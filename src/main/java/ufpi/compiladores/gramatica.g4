grammar gramatica;

programa: 'begin' comandos 'end.';

declaracaoVariaveis: 'var' NomeVariavel (',' NomeVariavel)* ':' Tipos;

comandoRepeticao: 'repeat' comandos 'until' '(' (expressaoBooleana | NomeVariavel | TRUE | FALSE) ')';

atribuicaoVariavel: NomeVariavel ComandoAtribuicao ((INT | FLOAT | NomeVariavel) | expressaoAritmetica);

comandos: comando(';'comando)*;

comando: (declaracaoVariaveis | comandoRepeticao |  atribuicaoVariavel | comandoPrint | comandoRead | comandoIf)*;


listaArgumentosPrint: (String | NomeVariavel)(','(String | NomeVariavel))*;
listaArgumentosRead:  NomeVariavel(','NomeVariavel)*;

comandoPrint: 'print' '(' listaArgumentosPrint? ')';
comandoRead: 'read' '(' listaArgumentosRead? ')';

expressaoAritmetica: termo (Op1 termo)*;
termo: fator (Op2 fator)*;
fator: primeiroTermo (Op3 primeiroTermo)*;
primeiroTermo: NUMBER | '(' expressaoAritmetica ')';
NUMBER: ('+' | '-')? (INT | FLOAT);


expressaoBooleana: termoBool ((AND | OR) termoBool)*;
termoBool: fatorBool | negacao;
fatorBool: relacional | negacao;
relacional: relacao | '(' expressaoBooleana ')';
relacao: NUMBER (OPERADOR NUMBER);
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
Op3: '^';
NomeVariavel: Letra(Letra | Digito)*;
String : '\'' ( ('\\'('"'|'t'|'n')) | ~('\\' | '\n') )*? '\'' ;
ComandoAtribuicao:  ':=';
INT: [0-9]+;
FLOAT: [0-9]+'.'[0-9]+;
TRUE: 'true';
FALSE: 'false';
Valor: (NomeVariavel | INT | FLOAT);
COMENTARIOS : '{' .*? '}' -> skip;
ESCAPES : [ \t\r\n]+ -> skip ;

