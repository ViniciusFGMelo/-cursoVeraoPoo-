package Exercicio21;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Aluno> alunos = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		for (int i=0; i<1; i++) {
			Aluno aluno = new Aluno();
			System.out.println("Entre com o nome");
			aluno.setNome(sc.nextLine());
			System.out.println("Entre com a matricula");
			aluno.setMatricula(sc.nextInt());
			System.out.println("Entre com a nota da prova 1");
			aluno.setNotaP1(sc.nextFloat());
			System.out.println("Entre com a nota da prova 2");
			aluno.setNotaP2(sc.nextFloat());
			System.out.println("Entre com a nota do trabalho");
			aluno.setNotaTrabalho(sc.nextFloat());
			alunos.add(aluno);
		}
		
		for (Aluno aluno : alunos) {
			System.out.print(aluno.toString());
			System.out.println();
			System.out.println(aluno.resultadofinal());
		}
		
		sc.close();
	}

}
