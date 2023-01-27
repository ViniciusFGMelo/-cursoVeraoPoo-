package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float lt, pt;
		float lc, pc;
		float areat, areac, livre;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com lt");
		lt = sc.nextFloat();
		System.out.println("Entre com pt");
		pt = sc.nextFloat();
		System.out.println("Entre com lc");
		lc = sc.nextFloat();
		System.out.println("Entre com pt");
		pc = sc.nextFloat();
		
		areat = lt*pt;
		areac = lc*pc;
		livre = areat - areac;
		
		System.out.println("Livre " + livre/areat*100 + "%");
		
		sc.close();
	}
}
		

