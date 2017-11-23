
package avaliação.pkgfinal;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class AvaliaçãoFinal {

   
    public static void main(String[] args)throws Exception {
       Scanner Ler= new Scanner(System.in);
       Scanner Ler2 = new Scanner(System.in);
    double cognitivo;
    double atitudes;
    double notafinal;
    System.out.print("qual a nota do dominio cognitivo");
    cognitivo=Ler.nextDouble();
    System.out.print("qual a nota das atitudes");
    atitudes=Ler.nextDouble();
    notafinal=cognitivo*0.6+atitudes*0.4;
    System.out.print("qual o nome da pessoa");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String nomedapessoa = in.readLine();
    if(notafinal>10)
        System.out.print("A"+nomedapessoa+"é"+notafinal+"esta aprovado");
    else
        System.out.print("A"+nomedapessoa+"é"+notafinal+"esta reprovada");
    
    
     
        // TODO code application logic here
    }
    
}
