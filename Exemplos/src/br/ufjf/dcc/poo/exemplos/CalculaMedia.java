package br.ufjf.dcc.poo.exemplos;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float media = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			media += sc.nextFloat();
		}
		System.out.println("Media " + media/3);
		
		sc.close();
	}

}
