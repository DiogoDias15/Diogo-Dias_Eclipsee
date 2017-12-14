
package multiplicaçãorussa;
import java.util.Scanner;
public class Multiplicaçãorussa {

   
    public static void main(String[] args)throws Exception
    {int x,x2,y,y2,t;
    Scanner LerS=new Scanner(System.in);
    System.out.print("multiplicando");
    x=LerS.nextInt();
    System.out.print("multiplicandr");
    y=LerS.nextInt();
    x2=x;y2=y;t=0;
    while (x2>=1)
    {if (x2%2!=0)
        t=t+y2;
    x2=(x2/2);
    y2=y2*2;}
    System.out.printf("%d x %d=%d", x,y,t);
        // TODO code application logic here
    }
    
}
