
package Ciclos;

import javax.swing.JOptionPane;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// se ejecuta al menos una vez
		
		String Genero="";
		do {
			
			Genero=JOptionPane.showInputDialog("Ingrese genero");
			
		} while (Genero=="m");
		
		System.out.println("ingreso correcto");
		
	}

}
