package Areas;
import java.io.*;
public class AreaRetângulo {

	public static void main(String[] args)throws IOException {
	// comprimento,largura,areaRetângulo;
	
	String comprimento1 ="";
	System.out.println("Digite comprimento:");
	InputStreamReader LerS = new InputStreamReader (System.in);
	BufferedReader GuardaS = new BufferedReader (LerS);
	comprimento1= GuardaS.readLine();
	
	String largura1 ="";
	System.out.println("Digite largura:");
	InputStreamReader LerS1 = new InputStreamReader (System.in);
	BufferedReader GuardaS2 = new BufferedReader (LerS);
	largura1= GuardaS2.readLine();
	
	System.out.printf("a area do retângulo é:%d",Integer.valueOf(largura1)* Integer.valueOf(comprimento1));
	
	
	
	
			
			
		

	}

}
