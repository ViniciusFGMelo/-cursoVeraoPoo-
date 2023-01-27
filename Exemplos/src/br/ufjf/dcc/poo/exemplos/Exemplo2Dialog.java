package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Exemplo2Dialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x,y;
		Float a,b;
		
		x = JOptionPane.showInputDialog(null);
		y = JOptionPane.showInputDialog(null);
		
		a = Float.parseFloat(x);
		b = Float.parseFloat(y);
		
		JOptionPane.showMessageDialog(null, a+b);

	}

}
