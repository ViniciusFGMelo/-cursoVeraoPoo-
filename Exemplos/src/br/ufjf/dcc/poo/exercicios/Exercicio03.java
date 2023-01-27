package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		float a,b,c,x1,x2;
		float delta;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com a: ");
		a = sc.nextFloat();
		System.out.print("Entre com b: ");
		b = sc.nextFloat();
		System.out.print("Entre com c: ");
		c = sc.nextFloat();
		
		delta = (b*b) - (4*a*c);
		x1 = (float) ((-b + Math.sqrt(delta))/2*a);
		x2 = (float) ((-b - Math.sqrt(delta))/2*a);
		
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		
		sc.close();
	}
}
