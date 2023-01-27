package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Exemplo1Dialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomeUsuario;
		nomeUsuario = JOptionPane.showInputDialog(null);
		JOptionPane.showMessageDialog(null, nomeUsuario);
	}

}
