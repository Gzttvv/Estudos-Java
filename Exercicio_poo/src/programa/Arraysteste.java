package programa;

import java.util.Scanner;

import entites.Pessoa;

public class Arraysteste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double media = 0;
		int soma = 0;
		
		System.out.println("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		
		Pessoa [] container = new Pessoa [n];
		// criar array 
		for (int i=0;i< container.length;i++) {
			System.out.println("Dados da "+ (i+1)+ "a pessoa: ");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			 container[i] = new Pessoa (idade,altura,nome);
		}
		// media altura
		for (int i=0;i < container.length ; i++) {
			 media += container[i].getAltura()/n;
		}
		// %  de idade menor que 16
		for (int i=0;i < container.length ; i++) {
			int acc = container[i].getIdade();
			if (acc < 16) {
				soma += 1;
			}
		}
		int res = (soma * 100) / n; // porcentagem de menores de 16
		System.out.println("");
		System.out.printf("Altura Media: %.2f\n", media);
		System.out.println("Pessoas com menos de 16 anos: "+res+"%" );
		for (int i=0;i < container.length ; i++) { 
			System.out.println(container[i].getNome());
		}
		sc.close();
		
	}

}
