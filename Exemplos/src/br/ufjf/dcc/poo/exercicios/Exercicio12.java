package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes repetir a farse: "));
		
		for(int i=0; i<num; i++) {
			JOptionPane.showMessageDialog(null,"Faça o exercicio novamente");
		}
	}

}
