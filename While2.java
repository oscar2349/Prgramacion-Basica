package Ciclos;

import javax.swing.JOptionPane;

public class While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String clave="Oscar";

String pass="";

while (clave.equals(pass)==(false)) {
	pass=JOptionPane.showInputDialog("ingrese clave");
	if (clave.equalsIgnoreCase(pass)==false) {
		
		System.out.println("incorrect");
		
	}

	
}
System.out.println("Correcto");
	}

}
