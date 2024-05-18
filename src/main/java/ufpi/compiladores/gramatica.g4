grammar gramatica;

programa: 'begin' comandos 'end.';

declaracaoVariaveis: 'var' NOME_VARIAVEL (',' NOME_VARIAVEL)* ':' Tipos;

comandoRepeticao: 'repeat' comandos 'until' '(' (expressaoBooleana | NOME_VARIAVEL | TRUE | FALSE) ')';

atribuicaoVariavel: NOME_VARIAVEL ComandoAtribuicao ((INT | FLOAT | NOME_VARIAVEL) | expressaoAritmetica);

comandos: comando(';'comando)*;

comando: (declaracaoVariaveis | comandoRepeticao |  atribuicaoVariavel | comandoPrint | comandoRead | comandoIf)*;


listaArgumentosPrint: (String | NOME_VARIAVEL)(','(String | NOME_VARIAVEL))*;
listaArgumentosRead:  NOME_VARIAVEL(','NOME_VARIAVEL)*;

comandoPrint: 'print' '(' listaArgumentosPrint? ')';
comandoRead: 'read' '(' listaArgumentosRead? ')';

expressaoAritmetica: termo (Op1 termo)*;
termo: fator (Op2 fator)*;
fator: val | '(' expressaoAritmetica ')' ;

NUMBER: ('+' | '-')? (INT | FLOAT);

val: (NOME_VARIAVEL | NUMBER);

expressaoBooleana: termoBool ((AND | OR) termoBool)*;
termoBool: fatorBool | negacao;
fatorBool: relacional | negacao;
relacional: relacao | '(' expressaoBooleana ')';
relacao: val (OPERADOR val);
negacao: NOT fatorBool;


comandoIf: 'if' '(' expressaoBooleana? ')' 'then' comandos ('else' comandos)? 'endif';


fragment Letra: [a-zA-Z];
fragment Digito: [0-9];

OPERADOR: '>' | '>=' | '<' | '<=' | '==' | '!=';
NOT: '!';
AND: 'and';
OR: 'or';
Tipos: 'int' | 'float';
Op1:  '-' | '+';
Op2: '*' | '/' | '%';
NOME_VARIAVEL: Letra(Letra | Digito)*;
String : '\'' ( ('\\'('"'|'t'|'n')) | ~('\\' | '\n') )*? '\'' ;
ComandoAtribuicao:  ':=';
INT: [0-9]+;
FLOAT: [0-9]+'.'[0-9]+;
TRUE: 'true';
FALSE: 'false';
Valor: (NOME_VARIAVEL | INT | FLOAT);
COMENTARIOS : '{' .*? '}' -> skip;
ESCAPES : [ \t\r\n]+ -> skip ;

