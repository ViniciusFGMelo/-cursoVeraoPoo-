package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float quilometrosDg, litrosGas, quilometroPL;
		
		quilometrosDg = Float.parseFloat(JOptionPane.showInputDialog("quilometros dirigidos"));
		litrosGas = Float.parseFloat(JOptionPane.showInputDialog("litros gasolina"));
		
		quilometroPL = quilometrosDg/litrosGas;
		
		JOptionPane.showMessageDialog(null,"km/l: " + quilometroPL);
	}

}
