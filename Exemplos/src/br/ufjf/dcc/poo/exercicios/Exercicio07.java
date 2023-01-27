package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numSorteado = (int) (0 + Math.random() * 100);

		Integer numDig = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número: "));

		while(numSorteado != numDig) {
			
			if(numSorteado < numDig) {
				JOptionPane.showMessageDialog(null,"Menor");
			}
			else if (numSorteado > numDig) {
				JOptionPane.showMessageDialog(null,"Maior");
			}
			
			numDig = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número: "));
		}
		JOptionPane.showMessageDialog(null,"Acertou");
	}
}


