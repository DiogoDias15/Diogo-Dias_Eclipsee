
package multiplicaçãorussa3;
import java.util.Scanner;
public class Multiplicaçãorussa3 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int M,m,m2,M2,r;
        Scanner dados=new Scanner(System.in);
        System.out.print("qual é o multiplicando?");
        m=dados.nextInt();
        System.out.print("qual é o multiplicador?");
        M=dados.nextInt(); 
        while(m>1){
           m=m/2;
        System.out.print(m+"\n");
        
    }
    }   
}
