package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%
abstract|
continue|
for|
new|
switch|
assert|
default|
goto|
package|
synchronized|
boolean|
do|
if|
private|
this|
break|
double|
implements|
protected|
throw|
byte|
else|
import|
public|
thows|
case|enum|instanceof|return|transient|
catch|extends|int|short|try|
char|final|interface|static|void|
class|finally|long|strictfp|volatile|
const|float|native|super|while|
else |args|
while {lexeme=yytext(); return Reservadas;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"(" {return Aparentesis;}
")" {return CParentesis;}
"=" {return Igual;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
"{" {return Allaves;}
"}" {return Cllaves;}
"[" {return Acorchetes;}
"]" {return Ccorchetes;}
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}
