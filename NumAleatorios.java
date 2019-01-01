package Ciclos;

import javax.swing.JOptionPane;

public class NumAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Valor=Integer.parseInt((JOptionPane.showInputDialog("Ingrese la cantidad de numeros que desea")));
		for (int i = 0; i < Valor; i++) {
			//como El valor Ingresado es Numerico, toca Hacer Cast a int
			
			int Aleatorio=(int) (Math.random()*100);
			System.out.println (Aleatorio);
			
			
			
		}
		
	}

}
