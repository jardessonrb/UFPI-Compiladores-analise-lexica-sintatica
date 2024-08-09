grammar GramaticaSimp;


@header {
    import java.util.*;
    import ufpi.compiladores.backend.TabelaSimbolo;
    import ufpi.compiladores.backend.ListaAtribuicao;
    import ufpi.compiladores.backend.Variavel;
}

@members {
    TabelaSimbolo tabelaSimbolos = new TabelaSimbolo();
    ListaAtribuicao listaAtribuicao = new ListaAtribuicao();
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

atribuicaoVariavel returns [String valorAtributo]: {$valorAtributo = "";} NOME_VARIAVEL {listaAtribuicao.nomeVariavel($NOME_VARIAVEL.text);} CMD_ATRIBUICAO ((INT {$valorAtributo = $INT.text;} | FLOAT {$valorAtributo = $FLOAT.text;} | NOME_VARIAVEL {$valorAtributo = $NOME_VARIAVEL.text;}) | expressaoAritmetica {$valorAtributo += listaAtribuicao.concat();});

comandoPrint: PRINT '(' listaArgumentosPrint ')';

comandoRead: READ '(' listaArgumentosRead ')';

comandoIf: IF '(' (expressaoBooleana) ')' THEN comandos (ELSE comandos)? ENDIF;

//Argumentos do Print
listaArgumentosPrint: argumentoPrint(','argumentoPrint)*;
argumentoPrint: (CADEIA | NOME_VARIAVEL | NUMERO);

//Argumentos do Read
listaArgumentosRead:  NOME_VARIAVEL(','NOME_VARIAVEL)*;

//Expressão aritmética com precedência de operadores
expressaoAritmetica returns [String code, String varAnterior, Integer pos]: {$code = ""; $varAnterior = ""; $pos = 0;}

termoAri {$code += $termoAri.termo;} (Op1 {$code += $Op1.text;} termoAri {
$code += $termoAri.termo;

if(listaAtribuicao.qntExpressoes() == 0){
    listaAtribuicao.addExpressao("_t"+listaAtribuicao.qntExpressoes()+" = " +$code);
}else {
    listaAtribuicao.addExpressao("_t"+listaAtribuicao.qntExpressoes()+" = "+"_t"+(listaAtribuicao.qntExpressoes() - 1)+$code);
}
System.out.println("Code: "+$code);
$code = "";

})*;

termoAri returns [String termo]: {$termo =  "";} fatorAri {$termo += $fatorAri.code;} (Op2 {$termo += $Op2.text;}
fatorAri {
$termo += $fatorAri.code;
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

