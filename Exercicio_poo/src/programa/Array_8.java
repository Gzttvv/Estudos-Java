package programa;

import java.util.Scanner;

public class Array_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Recebe o tamanho dos vetores
		System.out.print("Digite a quantidade de pessoas: ");
		int tamanho_vetor = sc.nextInt();
		int comparativo = 0;
		int valor_index = 0;
		
		//Cria os vetores para Nome e Idade
		String[] nomes = new String[tamanho_vetor];
		int[] idade = new int[tamanho_vetor];
		
		//Recebe os dados
		for (int i=0 ;i < tamanho_vetor; i++ ) {
			System.out.println("Digite o nome da "+(i+1)+" pessoa");
			System.out.print("Nome: ");
			nomes[i]= sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.println("");		
		}
		
		// Descobre quem é a pessoa mais velha
		for (int i=0;i<idade.length;i++) {
			if (comparativo < idade[i]) {
				valor_index = i;
				comparativo = idade[i];
			}		
			
		}
		
		System.out.print("Pessoa mais velha: "+nomes[valor_index]);
		
		sc.close();
	}
}
