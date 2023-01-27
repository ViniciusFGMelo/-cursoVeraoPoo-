package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com idade: "));


		if(idade <= 3 && idade > 0) {
			JOptionPane.showMessageDialog(null,"Bebe");
		}
		else if (idade > 3 && idade <= 13 ) {
			JOptionPane.showMessageDialog(null,"Criança");
		}
		else if (idade > 13 && idade < 20 ) {
			JOptionPane.showMessageDialog(null,"Adolescente");
		}
		else if (idade >= 20 && idade < 65) {
			JOptionPane.showMessageDialog(null,"Adulto");
		}
		else {
			JOptionPane.showMessageDialog(null,"Idoso");
		}

	}
}



