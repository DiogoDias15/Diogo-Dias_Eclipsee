package exdiadasbruxas;
import java.io.*;
public class DoçuraouTravessura {

	public static void main(String[] args)throws IOException {
	String C="";
	System.out.println("digite doçura ou travessura");
	InputStreamReader LerS  = new InputStreamReader (System.in);
	BufferedReader GuardaS = new BufferedReader (LerS);
	C = GuardaS.readLine();
	System.out.printf("digitou:"+ C, args);
			

	}

}
