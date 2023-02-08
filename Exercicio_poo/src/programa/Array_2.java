package programa;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		
		// recebe o valor de quantos numeros terão no array e cria o array
		System.out.println("Quantos numeros quer digitar?");
		int x  = sc.nextInt();
		int [] array = new int [x];
		int acc = 0;
		
		// recebe o valor de cada elemento do array e o armazena
		for (int i=0; i < array.length;i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextInt();
		}
		
		System.out.println("Numeros pares: ");
		// verifica os numeros pares e os exibe na tela
		for (int i=0; i < array.length;i++) {
			int modulo = array[i] % 2 ;
			if (modulo == 0 ) {
				System.out.print(array[i]+ " ");
				acc++;
			}
		}
		
		System.out.println("");
		System.out.println("Numeros pares: "+ acc);
		
		
		
		sc.close();
	}

}
