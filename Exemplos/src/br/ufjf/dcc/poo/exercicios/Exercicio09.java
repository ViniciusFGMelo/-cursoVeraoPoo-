package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float a,b,c;
		
		a = Float.parseFloat(JOptionPane.showInputDialog("a"));
		b = Float.parseFloat(JOptionPane.showInputDialog("b"));
		c = Float.parseFloat(JOptionPane.showInputDialog("c"));
		
		if((Math.abs(b-c)<a && a<b+c) && (Math.abs(a-c)<b && b<a+c) && (Math.abs(a-b)<c && a<a+b)) {
			JOptionPane.showMessageDialog(null,"O triangulo existe");
		} else {
			JOptionPane.showMessageDialog(null,"O triangulo nao existe");
		}

	}

}
