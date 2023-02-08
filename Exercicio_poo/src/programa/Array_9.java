package programa;

import java.util.Scanner;

public class Array_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// Variaveis globais
		double media = 0;
		
		//Quantidade de alunos
		System.out.println("Digite a quantidade de alunos: ");
		int qunt_alunos = sc.nextInt();
		
		// Crias os Arrays com nomes e notas do alunos
		String[] nomes = new String[qunt_alunos];
		double[] notas1 = new double[qunt_alunos];
		double[] notas2 = new double[qunt_alunos];
		
		// Receber os Elementos dos arrays
		for (int i=0;i < nomes.length;i++ ) {
			System.out.println("Digite as informações dos alunos");
			System.out.println("================================");
			System.out.print("Digite o nome do "+(i+1)+" aluno: ");
			nomes[i] = sc.next();
			System.out.print("Nota 1 semestre: ");
			notas1[i] = sc.nextDouble();
			System.out.print("Nota 2 semestre: ");
			notas2[i] = sc.nextDouble();
			System.out.println("");
		}
		
		System.out.println("Alunos Aprovados: ");
		
		// Calcula a media e exibie os alunos aprovados
		for (int i=0; i < notas1.length;i++) {
			media = (notas1[i]+ notas2[i]) / 2 ; 
			if (media >= 6) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}

}
