package basicos;
import java.util.Scanner;
public class Beecrowd_1021 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
			
			double valor,notas;
			
			valor = sc.nextDouble();
			notas = 0;
			for (int i=0; i <8;i++); {
				
				if (valor<100) {
					notas = valor/100;
					System.out.println(notas);
				}
			}
		
		sc.close();
	}
}
