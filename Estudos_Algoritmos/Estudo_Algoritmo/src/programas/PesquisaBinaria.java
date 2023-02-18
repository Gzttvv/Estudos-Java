package programas;
import java.util.Random;
import java.util.Scanner;

public class PesquisaBinaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		// Gera um numero aleatorio que será usado no array
		Random random = new Random();
		int item = random.nextInt(10);
		
		System.out.println(item);
		
		// var globais
		int baixo,meio,alto,chute;
		
		// array 
		int[] lista = {1,2,3,4,5,6,7,8,9,10};
		
		//Define os valores
		baixo = 0 ;
		alto = lista.length;
		meio = (baixo+alto)/2;
		chute = lista[meio];
		System.out.println(item);
		
		if (chute < item) {
			baixo = meio +1 ;
		}
		
		while (baixo <= alto) {
			
			meio = (baixo + alto) /2 ;
			chute = lista[meio];
			
			if (chute == item) {
				System.out.println("Encontrado na posição: "+chute); 
				break;
			}
			else if (chute > item) {
				alto = meio -1;
			}
			else if (chute < item) {
				baixo = meio +1;
			}
			
		}
		
		
		sc.close();
	
	}
	

}
