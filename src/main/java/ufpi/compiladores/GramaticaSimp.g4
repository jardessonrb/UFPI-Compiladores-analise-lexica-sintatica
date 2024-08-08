grammar GramaticaSimp;


@header {
    import java.util.*;
    import ufpi.compiladores.backend.TabelaSimbolo;
    import ufpi.compiladores.backend.Variavel;
}

@members {
    TabelaSimbolo tabelaSimbolos = new TabelaSimbolo();
}

programa: BEGIN comandos END;

comandos : comandosDel(';'comandosDel)* ;

comandosDel: declaracaoVariaveis {

System.out.println("Tipo Declaracao: "+ $declaracaoVariaveis.tipoDeclaracao);
tabelaSimbolos.printVariaveis();

} | atribuicaoVariavel {System.out.println("ValorAtribuicao: "+$atribuicaoVariavel.valorAtributo);} | comandoPrint | comandoRead | comandoRepeat | comandoIf;

//comando: comandosDel(';'comandosDel);

declaracaoVariaveis returns [String tipoDeclaracao]: {$tipoDeclaracao = "";} VAR NOME_VARIAVEL {
    tabelaSimbolos.declararVariavel($NOME_VARIAVEL.text, new Variavel($NOME_VARIAVEL.text));
}
(',' NOME_VARIAVEL {
    tabelaSimbolos.declararVariavel($NOME_VARIAVEL.text, new Variavel($NOME_VARIAVEL.text));
})* ':' TIPOS {tabelaSimbolos.atualizarTipo($TIPOS.text);};

comandoRepeat: REPEAT comandos UNTIL '(' (expressaoBooleana | TRUE | FALSE) ')';

atribuicaoVariavel returns [String valorAtributo]: {$valorAtributo = "";} NOME_VARIAVEL CMD_ATRIBUICAO ((INT {$valorAtributo = $INT.text;} | FLOAT {$valorAtributo = $FLOAT.text;} | NOME_VARIAVEL {$valorAtributo = $NOME_VARIAVEL.text;}) | expressaoAritmetica {$valorAtributo = $expressaoAritmetica.code;});

comandoPrint: PRINT '(' listaArgumentosPrint ')';

comandoRead: READ '(' listaArgumentosRead ')';

comandoIf: IF '(' (expressaoBooleana) ')' THEN comandos (ELSE comandos)? ENDIF;

//Argumentos do Print
listaArgumentosPrint: argumentoPrint(','argumentoPrint)*;
argumentoPrint: (CADEIA | NOME_VARIAVEL | NUMERO);

//Argumentos do Read
listaArgumentosRead:  NOME_VARIAVEL(','NOME_VARIAVEL)*;

//Expressão aritmética com precedência de operadores
expressaoAritmetica returns [String code]: {$code = "";}

termoAri {$code += $termoAri.termo;} (Op1 {$code += $Op1.text;} termoAri {
$code += $termoAri.text;
$code = tabelaSimbolos.newTemp()+ " = " + $code;
})*;

termoAri returns [String termo]: {$termo =  "";} fatorAri {$termo += $fatorAri.text;} (Op2 {$termo += $Op2.text;}

fatorAri {
$termo += $fatorAri.text;
})*;

fatorAri returns [String code]: {$code = "";} variavelValor {$code = $variavelValor.valor;}
        | '(' expressaoAritmetica ')'
        {
            $code += $expressaoAritmetica.code;
        }
        | conversaoExplicita ;

//Expresão Booleana com precedência de operadores lógicos
expressaoBooleana: termoBool ((AND | OR) termoBool)*;
termoBool: fatorBool | negacao;
fatorBool: relacional | negacao;
relacional: relacao | '(' expressaoBooleana ')';
relacao: (variavelValor | '(' expressaoAritmetica ')') (OPERADOR variavelValor);
negacao: NOT fatorBool;

conversaoExplicita: CONVERSAO_EXPLICITO '(' expressaoAritmetica ')';

variavelValor returns [String valor]: (NOME_VARIAVEL {$valor = $NOME_VARIAVEL.text;} | NUMERO {$valor = $NUMERO.text;});

//Palavra Reservadas - Regras Lexicas
BEGIN: 'begin';
END: 'end.';
VAR: 'var';
REPEAT: 'repeat';
UNTIL: 'until';
IF: 'if';
ELSE: 'else';
THEN: 'then';
ENDIF:'endif';
PRINT: 'print';
READ: 'read';

//Operadores Relacionais
OPERADOR: '>' | '>=' | '<' | '<=' | '==' | '!=';

//Operadores Lógicos
NOT: '!';
AND: 'and';
OR: 'or';

//Operadores Aritméticos
Op1:  '-' | '+';
Op2: '*' | '/' | '%';

//Constantes Booleanas
TRUE: 'true';
FALSE: 'false';

TIPOS: 'int' | 'float';
CONVERSAO_EXPLICITO:  ('(int)' | '(float)');
NOME_VARIAVEL: LETRA(LETRA | DIGITO)*;
CMD_ATRIBUICAO:  ':=';
NUMERO: ('+' | '-')? (INT | FLOAT);

CADEIA : '\'' ( ('\\'('"'|'t'|'n')) | ~('\\' | '\n') )*? '\'' ;
INT: [0-9]+;
FLOAT: [0-9]+'.'[0-9]+;

//Fragmentos
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

//SKIP´s
COMENTARIOS : '{' .*? '}' -> skip;
ESCAPES : [ \t\r\n]+ -> skip ;

