package programa;

import java.util.Scanner;

public class Array_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int maiorNumb,maiorPos;
		int mar = 0;
	
		// recebe quantos numeros serão inseridos no array
		System.out.print("Quantos numeros: ");
		int x = sc.nextInt();
		int [] array = new int[x];
		
		// armazena os numeros no array 
		for (int i=0 ; i< array.length;i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextInt();
		}
		
		// Descobre o maior num do array e sua posição
		maiorNumb = array[0];
		maiorPos = 0;
		for (int i=0; i <array.length;i++) {
			if (array[i] > maiorNumb) {
				maiorNumb = array[i];
				maiorPos = i;
			}
		}
		
		System.out.println("MAIOR VALOR : "+maiorNumb);
		System.out.println("Posição do maior valor = "+maiorPos);
		sc.close();

	}

}
// comentario