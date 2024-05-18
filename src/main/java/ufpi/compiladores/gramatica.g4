grammar gramatica;

programa: BEGIN comandos END;

comandos: comandosDel(';'comandosDel)*;

comandosDel: declaracaoVariaveis | atribuicaoVariavel | comandoPrint | comandoRead | comandoRepeat | comandoIf;

comando: comandosDel(';'comandosDel);

declaracaoVariaveis: VAR NOME_VARIAVEL (',' NOME_VARIAVEL)* ':' TIPOS;

comandoRepeat: REPEAT comandos UNTIL '(' (expressaoBooleana | NOME_VARIAVEL | TRUE | FALSE) ')';

atribuicaoVariavel: NOME_VARIAVEL CMD_ATRIBUICAO ((INT | FLOAT | NOME_VARIAVEL) | expressaoAritmetica);

comandoPrint: PRINT '(' listaArgumentosPrint? ')';

comandoRead: READ '(' listaArgumentosRead? ')';

comandoIf: IF '(' (expressaoBooleana | NOME_VARIAVEL) ')' THEN comandos (ELSE comandos)? ENDIF;

//Argumentos do Print
listaArgumentosPrint: argumentoPrint(','argumentoPrint)*;
argumentoPrint: (CADEIA | NOME_VARIAVEL | NUMERO);

//Argumentos do Read
listaArgumentosRead:  NOME_VARIAVEL(','NOME_VARIAVEL)*;

//Expressão aritmética com precedência de operadores
expressaoAritmetica: termoAri (Op1 termoAri)*;
termoAri: fatorAri (Op2 fatorAri)*;
fatorAri: variavelValor
        | '(' expressaoAritmetica ')'
        | conversaoExplicita ;

//Expresão Booleana com precedência de operadores lógicos
expressaoBooleana: termoBool ((AND | OR) termoBool)*;
termoBool: fatorBool | negacao;
fatorBool: relacional | negacao;
relacional: relacao | '(' expressaoBooleana ')';
relacao: (variavelValor | '(' expressaoAritmetica ')') (OPERADOR variavelValor);
negacao: NOT fatorBool;

conversaoExplicita: CONVERSAO_EXPLICITO'(' expressaoAritmetica ')';

variavelValor: (NOME_VARIAVEL | NUMERO);

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
CONVERSAO_EXPLICITO: ('(int)' | '(float)');
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

