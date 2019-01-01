package Ciclos;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {

Scanner entrada=new Scanner (System.in);
System.out.println("Elige una opcion");
int seleccion=entrada.nextInt();
entrada.close();
switch (seleccion) {
case 1:
	System.out.println("Selecciono la opcion 1");
	
	break;
	//se ecojen las opciones a establecer
case 2:
	System.out.println("Selecciono la opcion 2");	
default:
	break;
}
	           
	
	}

}
