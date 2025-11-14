grammar Forca;

// Regras do parser
programa
  ;
  : (declaracao | comando)* Fim

declaracao
  : VAR ID ':' tipo ( '=' expressao )? ';'
  ;

tipo
  : TIPO_INTEIRO
  | TIPO_REAL
  | TIPO_TEXTO
  ;

comando
  : atribuicao ';'
  | seCmd
  | enquantoCmd
  | repitaCmd
  | ioCmd ';'
  | PARE ';'
  | CONTINUE ';'
  | bloco
  ;

bloco
  : '{' (comando)* '}'
  ;

seCmd
  : SE '(' expressao ')' bloco (SENAO bloco)?
  ;

enquantoCmd
  : ENQUANTO '(' expressao ')' bloco
  ;

repitaCmd
  : REPITA bloco ATE '(' expressao ')' ';'
  ;

ioCmd
  : LEIA '(' ID ')'
  | ESCREVA '(' listaArgs? ')'
  ;

listaArgs
  : expressao (',' expressao)*
  ;

atribuicao
  : ID '=' expressao
  ;

// Procedencia
expressao
  : exprOu
  ;

exprOu
  : exprE ( OU exprE )*
  ;

exprE
  : exprIgual ( E exprIgual )*
  ;

exprIgual
  : exprRel ( ( '==' | '!=' ) exprRel )*
  ;

exprRel
  : exprAdd ( ( '<' | '<=' | '>' | '>=' ) exprAdd )*
  ;

exprAdd
  : exprMul ( ( '+' | '-' ) exprMul )*
  ;

exprMul
  : exprUn ( ( '*' | '/' | '%' ) exprUn )*
  ;

exprUn
  : ( '+' | '-' | '!' ) exprUn
  | prim
  ;

prim
  : '(' expressao ')'
  | literal
  | ID
  ;

literal
  : INT
  | REAL
  | TEXTO
  ;

// Regras Lexicas
VAR          : 'var' ;
SE           : 'se' ;
SENAO        : 'senao' ;
ENQUANTO     : 'enquanto' ;
REPITA       : 'repita' ;
ATE          : 'ate' ;
LEIA         : 'leia' ;
ESCREVA      : 'escreva' ;
PARE         : 'pare' ;
CONTINUE     : 'continue' ;
TIPO_INTEIRO : 'inteiro' ;
TIPO_REAL    : 'real' ;
TIPO_TEXTO   : 'texto' ;
OU           : 'ou' ;
E            : 'e' ;

ID      : [a-zA-Z_] [a-zA-Z_0-9]* ;
REAL    : [0-9]+ '.' [0-9]+ ;
INT     : [0-9]+ ;
TEXTO : '"' ( ~["\\] | '\\' . )* '"' ;
ESPACO : [ \t\r\n]+ -> skip ;
COMLIN : '//' ~[\r\n]* -> skip ;
COMBLO : '/*' .*? '*/' -> skip ;
