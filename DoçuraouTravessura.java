package exdiadasbruxas;
import java.io.*;
public class DošuraouTravessura {

	public static void main(String[] args)throws IOException {
	String C="";
	System.out.println("digite došura ou travessura");
	InputStreamReader LerS  = new InputStreamReader (System.in);
	BufferedReader GuardaS = new BufferedReader (LerS);
	C = GuardaS.readLine();
	System.out.printf("digitou:"+ C, args);
			

	}

}
