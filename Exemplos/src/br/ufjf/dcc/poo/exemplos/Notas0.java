package br.ufjf.dcc.poo.exemplos;

import java.util.Scanner;

public class Notas0 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String [] vectNome = new String[3];
		float [] vectNota = new float[3];
		float media;

		for (int i=0; i<3; i++) {
			System.out.print("Informe o nome do aluno : " + (i+1));
			vectNome[i] = teclado.next();
			System.out.print("Informe a nota do aluno : " + (i+1));
			vectNota[i] = teclado.nextFloat();
		}
		media = (vectNota[0] + vectNota[1] + vectNota[2]) / 3;
		System.out.println("Media " + media);
		
		teclado.close();
	}

}
