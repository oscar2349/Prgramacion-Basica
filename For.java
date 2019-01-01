package Ciclos;

import java.util.Scanner;


//imprime un determinado numero de veces mi nombre
public class For {

	public static void main(String[] args) {
	
		
		Scanner entrada=new Scanner (System.in);
		System.out.println("ingrese numero");
int valor=Integer.parseInt(entrada.nextLine());
entrada.close();

		for (int i = 0; i < valor; i++) {
			System.out.println("Oscar");
		}
	}

}
