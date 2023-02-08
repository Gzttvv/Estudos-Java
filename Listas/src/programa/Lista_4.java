package programa;

import java.util.Scanner;

public class Lista_4 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		// Variaveis globais	
		int m,n,x;
		
		System.out.println("Digite o numero de linhas");
		m = sc.nextInt();
		
		System.out.println("Digite o numero de colunas");
		n = sc.nextInt();
		
		// Declaraçao da matriz
		
		int[][] matriz = new int[m][n];
		
		// Percore  a matriz e atribui os elementos de cada index
		System.out.println("Digite os  numeros da matriz: ");
		for (int i=0; i < matriz.length;i++) {
			for(int j=0; j < matriz[i].length;j++) {
				matriz[i][j] = sc.nextInt();
			}
			
		}
		
		// Leitura do numero que seja varido na matriz
		System.out.println("Digite o numero a ser procurado na matriz");
		x = sc.nextInt();
		
		for (int i=0; i < matriz.length;i++) {
			for(int j=0; j < matriz[i].length;j++) {
				if(x == matriz[i][j]) {
					
					System.out.println("Posição: "+i+", "+j);
					if (j > 0) {
						System.out.println("Esquerda: "+matriz[i][j-1]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Direita: "+matriz[i][j+1]);
					}
					if (i > 0) {
						System.out.println("Cima: "+matriz[i-1][j]);
					}
					if (i < matriz[i].length-1) {
						System.out.println("Baixo: "+matriz[i+1][j]);
					} 
					
					
					
				}
			}
			
		}
		
		
		sc.close();
	} 
}
