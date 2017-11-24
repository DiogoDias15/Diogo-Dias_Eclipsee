
package soma.dos.primeiros.positivos;
import java.util.Scanner;
public class SomaDosPrimeirosPositivos {

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
       int soma=0;
       int num;
       System.out.print("insira os 20 primeiros numeros");
       num=ler.nextInt();
       
       for(int I=1;I<=num;I++){
          soma+= I;
      
       }
       System.out.println(soma);
               
                 
    }
    
}
