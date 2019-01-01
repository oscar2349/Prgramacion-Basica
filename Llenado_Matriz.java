package Ciclos;

import javax.swing.JOptionPane;

public class Llenado_Matriz {

	public static void main(String[] args) {

		int a=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero de elementos"));
		int mi_matriz[]=new int[a];
		
	for (int i = 0; i < mi_matriz.length; i++) {
		
		mi_matriz[i]= (int) (Math.random()*100);
		
		
	}
	
		for (int i : mi_matriz) {
			System.out.println(i);
		}
		
	}

}
