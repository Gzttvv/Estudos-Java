package programa;

import java.util.Scanner;

public class Array_5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		// Recebe o tamanho dos vetores 1 e 2
		System.out.println("Digite o tamanho dos vetores: ");
			int tamanho_array = sc.nextInt();

		
		// Cria os vetores 1 e 2
		int [] array1 = new int[tamanho_array];
		int [] array2 = new int[tamanho_array];
		int [] array3 = new int[tamanho_array];
		
		//Recebe os elementos do vetor 1
		System.out.println("Digite os valores do vetor A:");
		for (int indice = 0; indice < array1.length; indice++) {
				array1[indice] = sc.nextInt();
		}
		
		// Recebe os elementos do vetor 2 
		System.out.println("Digite os valores do vetor B:");
		for (int indice = 0; indice < array2.length; indice++) {
				array2[indice] = sc.nextInt();
		}
		
		// Somas os elementos dos vetores e os atribui a o 3 array
		for (int indice = 0; indice < array3.length; indice++) {
				array3[indice] = array1[indice] + array2[indice];
		}
		
		System.out.println("Vetor Resutante:");
		
		// Imprimi o 3 array na tela
		for (int indice = 0; indice < array3.length; indice++) {
			System.out.println(array3[indice]);
	}
		
		
		
		
		sc.close();
		
	}

}
