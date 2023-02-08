package programa;

import java.util.Scanner;
import entites.Produto;
public class Exercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int a[], b,c;
		a = new int[n];
		
		int [] vetor = new int [n] ;
		
		for (int i=0 ; i < n; i++) {
			vetor[i] = sc.nextInt();
		}
		
			System.out.print("Valores: ");
		for (int i=0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" " );
		
		}
		int soma = 0;
		
		for (int i=0; i< vetor.length; i++) {
			soma += vetor[i];
		}
		System.out.println("");
		System.out.println("Soma: "+soma);
		System.out.println("Media: "+ soma/n);
		sc.close();

	}

}
