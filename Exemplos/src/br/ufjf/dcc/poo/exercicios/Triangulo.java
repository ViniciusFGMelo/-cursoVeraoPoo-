package br.ufjf.dcc.poo.exercicios;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int altura,base;
		float area;
		System.out.print("Informe a altura ");
		altura = sc.nextInt();
		System.out.print("Informe a base ");
		base = sc.nextInt();
		area = altura*base/2;
		System.out.println("Area = " + area);

		sc.close();

	}

}
