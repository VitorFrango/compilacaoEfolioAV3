grammar MontPy;

// Definindo tokens
FLOAT: ('+'|'-')? DIGIT* '.' DIGIT+ (('e' | 'E') ('+'|'-')? DIGIT+)?;
INT: ('+'|'-')? DIGIT+;
DIGIT: [0-9];
STRING: '"' ~["\r\n]* '"';
WS: [ \t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;

// Palavras reservadas
DEF: 'def';
FLOAT_TYPE: 'float';
INT_TYPE: 'int';
FOR: 'for';
IN: 'in';
RANGE: 'range';
WHILE: 'while';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
SIZE: 'size';
ADD: 'add';
REMOVE: 'remove';
AND: 'and';
OR: 'or';
RETURN: 'return';
PRINT: 'print';
INPUT: 'input';

// Operadores e símbolos
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
EXPONENT: '^';  // Exponenciação
FLOOR_DIVIDE: '//';
MODULO: '%';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
EQUALS: '=';
EQUALITY: '==';
INEQUALITY: '!=';
GREATER_THAN: '>';
LESS_THAN: '<';
GREATER_THAN_OR_EQUAL: '>=';
LESS_THAN_OR_EQUAL: '<=';
COMMA: ',';
COLON: ':';
DOT: '.';
TAB: '\t';

// Identificar nomes de variáveis e funções
ID: [a-zA-Z_] [a-zA-Z_0-9]*;

ERROR: . ;

// Regras de precedência adicionadas para operações matemáticas e lógicas
expression :
    logicalExpression;

logicalExpression :
    equalityExpression ((AND | OR) equalityExpression)*;

equalityExpression :
    comparisonExpression ((EQUALITY | INEQUALITY) comparisonExpression)*;

comparisonExpression :
    additiveExpression ((GREATER_THAN | LESS_THAN | GREATER_THAN_OR_EQUAL | LESS_THAN_OR_EQUAL) additiveExpression)*;

additiveExpression :
    multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*;

multiplicativeExpression :
    powerExpression ((MULTIPLY | DIVIDE | FLOOR_DIVIDE | MODULO) powerExpression)*;

powerExpression :
    unaryExpression (EXPONENT powerExpression)?; // Associatividade à direita para exponenciação

unaryExpression :
    (PLUS | MINUS) unaryExpression
    | primary;

primary :
    INT | FLOAT | STRING
    | ID
    | OPEN_PAREN expression CLOSE_PAREN
    | function_call
    | list_function_call;

program : (statement | function_declaration)+ EOF;

type : INT_TYPE | FLOAT_TYPE;

list_type : type OPEN_BRACKET CLOSE_BRACKET;

literal : INT | FLOAT | STRING;

list_function_call : (SIZE | ADD | REMOVE) OPEN_PAREN ID (COMMA expression)* CLOSE_PAREN;

variable_declaration :
  type ID (EQUALS expression)?
  | list_type ID (EQUALS OPEN_BRACKET (literal (COMMA literal)*)? CLOSE_BRACKET)?
  | ID EQUALS expression;

function_declaration : DEF type? ID OPEN_PAREN params? CLOSE_PAREN statement_block;

params : param (COMMA param)*;
param : type ID | list_type ID;

statement_block : OPEN_BRACKET statement* CLOSE_BRACKET;
statement :
  variable_declaration
  | assignment
  | if_statement
  | for_statement
  | while_statement
  | expression
  | RETURN expression?
  | PRINT OPEN_PAREN expression (COMMA expression)* CLOSE_PAREN
  | INPUT OPEN_PAREN expression CLOSE_PAREN;

assignment :
  ID EQUALS expression
  | ID OPEN_BRACKET expression CLOSE_BRACKET EQUALS expression;

if_statement : IF expression statement_block (ELIF expression statement_block)* (ELSE statement_block)?;
for_statement : FOR ID IN (ID | range_expression) statement_block;
range_expression : RANGE OPEN_PAREN expression (COMMA expression (COMMA expression)?)? CLOSE_PAREN;
while_statement : WHILE expression statement_block;

function_call : ID OPEN_PAREN (expression (COMMA expression)*)? CLOSE_PAREN;
