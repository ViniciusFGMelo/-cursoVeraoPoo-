package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class ExemploValorAbsoluto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double numero;
		numero = Double.parseDouble(JOptionPane.showInputDialog("Entre com um número: "));
		
		if (numero < 0) numero = -numero;
		
		JOptionPane.showMessageDialog(null,"Valor absoluto: " + numero);
	}

}
