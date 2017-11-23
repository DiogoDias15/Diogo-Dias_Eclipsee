
package operações.aritemeticas;
import java.util.Scanner;
public class OperaçõesAritemeticas {

   
    public static void main(String[] args){
    Scanner Ler = new Scanner(System.in);
    double num1;
    double num2;
    String operaçao;
    double resultado=0;
    System.out.print("qual o primeiro numero");
    num1= Ler.nextDouble();
    System.out.print("qual o segundo numero");
    num2= Ler.nextDouble();
    System.out.print("digite qual a operação desejada");
    operaçao=Ler.next();
     switch(operaçao){
         case "+":
     resultado =num1+num2;
     System.out.print("o resultado é" +resultado);
     break;
     case"-":
     resultado=num1-num2;
     System.out.print("o resultado é" +resultado);
     break;
     case"*":
     resultado=num1*num2;
     System.out.print("o resultado é"+resultado);
     break;
     case"/":
     resultado=num1/num2;
     System.out.print("o resultado é"+resultado);
     break;
     
     }
              
    }
    
}
