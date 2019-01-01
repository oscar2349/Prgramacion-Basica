
package Ciclos;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {

Scanner entrada=new Scanner (System.in);

System.out.println("Ingrese Edad");

int edad=entrada.nextInt();
entrada.close();

if (edad>18) {
	System.out.println("Usted es mayor de edad");
	
	}

else if (edad==18) {
	
	System.out.println("tiene 18 años");
	}

else {
	System.out.println("usted es menor de eedad");
	}

	}

}
