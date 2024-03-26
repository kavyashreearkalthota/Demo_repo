class calculator
{
 public static int add(int x, int y){return(x+y);}
 public static int sub(int x, int y){return(x-y);}
 public static int mul(int x, int y){return(x*y);}
 public static int div(int x, int y){return(x/y);}
}
class Resultprinter
{
public static void printResult(int value)
 {
  System.out.println("The value is="+value);
 }
}
public class calcdemo
{
 public static void main(String args[])
{
 int a=calculator.add(20,30);
 Resultprinter.printResult(a);
 int b=calculator.sub(30,10);
 Resultprinter.printResult(b);
 int c=calculator.mul(5,8);
 Resultprinter.printResult(c);
 int d=calculator.div(10,5);
 Resultprinter.printResult(d);
 }
}