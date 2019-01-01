package Ciclos;

import javax.swing.JOptionPane;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] paises= new String[8];
//este para ingresar valores
for (int i = 0; i < paises.length; i++) {
	paises [i]=JOptionPane.showInputDialog("ingrese pais");
}

//paises [0]="colombia";
//paises [1]="peru";
///paises [2]="chile";
//paises [3]="Argentina";
//paises [4]="mexico";

for (String string : paises) {
	System.out.println("paises  "+ string);
}

	}

}
