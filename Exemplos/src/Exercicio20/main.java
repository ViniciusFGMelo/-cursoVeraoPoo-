package Exercicio20;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List<Pessoa> pessoas = new ArrayList<>();
		// Pessoa p1 = new Pessoa("Zé", 35);
		// Pessoa p2 = new Pessoa("Ana", 42, "F");
		// Pessoa p3 = new Pessoa();

		ArrayList<Pessoa> pessoas = new ArrayList<>();
		// String nome, sexo, cpf;
		// int idade;

		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<3; i++) {
			Pessoa p = new Pessoa();
			System.out.println("Entre com o nome");
			p.setNome(sc.nextLine());
			System.out.println("Entre com o sexo");
			p.setSexo(sc.nextLine());
			System.out.println("Entre com a idade");
			p.setIdade(sc.nextInt());
			System.out.println("Entre com o cpf");
			p.setCpf(sc.nextLine());
			pessoas.add(p);
			//pessoas.add(new Pessoa(nome,idade,sexo,cpf));
		}
		
		// pessoas.add(new Pessoa("Zé", 35));
		// pessoas.add(new Pessoa("Ana", 42, "F", null));
		// pessoas.add(new Pessoa());
		// pessoas.add(new Pessoa("Jorge", 37, "M", "001.345.654-76"));

		for (Pessoa pessoa : pessoas) {
			System.out.print(pessoa.toString());
			System.out.println();
		}

		sc.close();

	}

}
