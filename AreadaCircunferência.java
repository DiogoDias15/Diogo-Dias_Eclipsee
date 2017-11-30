
package areadacircunferência;
import java.util.Scanner;
public class AreadaCircunferência {
private static Scanner dados;
    public static void main(String[] args) {
    dados= new Scanner(System.in);
    double r,a;
    System.out.println("qual a area da circunferência?");
    System.out.println("qual a medida do raio?");
    r= dados.nextDouble();
    a=3.14*r*r;
    System.out.printf(" a area da circunferência é ",+a);
    }
    
}
