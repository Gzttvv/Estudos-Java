package programa;

import java.util.Scanner;

import entites.Estudante;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		Estudante estudante = new  Estudante();
		System.out.println("Digite o nome do aluno:");
		estudante.nome = sc.nextLine();
		System.out.println("Digite a nota 1");
		estudante.nota1 = sc.nextDouble();
		System.out.println("Digite a nota 2");
		estudante.nota2 = sc.nextDouble();
		System.out.println("Digite a nota 3");
		estudante.nota3 = sc.nextDouble();
		
		System.out.printf("Nota Final: %.2f",estudante.notafinal());
		
		if (estudante.notafinal() >= 60) {
			System.out.println(" Passou");
		}
		else System.out.println(" Reprovou faltaram: " + estudante.pontosFaltantes()+" pontos.");
		sc.close();
	}

}
