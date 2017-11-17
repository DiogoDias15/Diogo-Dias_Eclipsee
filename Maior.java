
package maior;
import java.util.Scanner;
public class Maior {

   
    public static void main(String[] args) {
   Scanner Ler = new Scanner(System.in);
   
   double A=0;
   double B=0;
   double C=0;
   double max=0;
   
   System.out.print("qual o primeiro numero?");
   A=Ler.nextDouble();
   System.out.print("qual o segundo numero?");
   B=Ler.nextDouble();
   System.out.print("qual o terceiro numero?");
   C=Ler.nextDouble();
   
   if(A>B)
   if(A>C)
   max=A;
   
   if(B>A)
   if(B>C)
  
   max=B;
       
   if(C>A)
   if(C>B)
   max=C;
       
       
       System.out.print("o maior é" + max);


   
           
   
   
           
   
    }
    
}
