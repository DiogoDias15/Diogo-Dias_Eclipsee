package Operações;
import java.util.Scanner;
public class TeoremadePitagoras {

	public static void main(String[] args) throws Exception {
  {double C1,C2,h;

  System.out.print("Qual a medida do primeiro Cateto?");
  Scanner LerS=new Scanner(System.in);
  C1= LerS.nextDouble();
  
  System.out.print("Qual a medida do segundo Cateto?");
  C2= LerS.nextDouble();
  
  h=Math.sqrt (Math.pow(C1, 2) + Math.pow(C2, 2));
  System.out.printf(String.format("Hipotenusa=%4.0f",h));}}}
