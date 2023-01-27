package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float x1,x2,y1,y2,distancia;
		
		x1 = Float.parseFloat(JOptionPane.showInputDialog("x1"));
		x2 = Float.parseFloat(JOptionPane.showInputDialog("x2"));
		y1 = Float.parseFloat(JOptionPane.showInputDialog("y1"));
		y2 = Float.parseFloat(JOptionPane.showInputDialog("y2"));
		
		distancia = (float)Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		JOptionPane.showMessageDialog(null,"Distancia " + distancia);

	}

}
