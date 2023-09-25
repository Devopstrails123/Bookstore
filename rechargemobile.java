You can also use characters in switch case. for example –

public class SwitchCaseExample2 {

public static void main(String args[]){

char ch='b';

switch(ch)

{

case 'd':

System.out.println("Case1 ");

break;

case 'b':

System.out.println("Case2 ");

break;

case 'x':

System.out.println("Case3 ");

break;

case 'y':

System.out.println("Case4 ");

break;

default:

System.out.println("Default ");

}

}

}

3) The expression given inside switch should result in a constant value otherwise it would not be valid.

For example:

Valid expressions for switch:

switch(1+2+23)

switch(1*2+3%4)

Invalid switch expressions:

switch(ab+cd)

switch(a+b+c)
