package basicos;
import java.util.Scanner;

public class Beecrowd_1048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		double salario = sc.nextDouble();
		double novoS = 0;
		double reajuste = 0;
		int percentual;

		
		if (salario >= 0 && salario <= 400.00  ) {
			percentual = 15;
			novoS = salario + (salario * 0.15);
			reajuste = novoS - salario;
			System.out.printf("Novo Salario: %.2f\n",novoS);
			System.out.printf("Reajuste ganho: %.2f\n",reajuste);
			System.out.printf("Em percentual: %d %",percentual);

		}
		else if (salario > 400.00 && salario <= 800.00) {
			novoS = salario + (salario * 0.12);
			reajuste = novoS - salario;
			System.out.printf("Novo Salario: %.2f\n",novoS);
			System.out.printf("Reajuste ganho: %.2f\n",reajuste);
			System.out.println("Em percentual: 12 %");
		}
		else if (salario > 800.00 && salario <= 1200.00) {
			novoS = salario + (salario * 0.10);
			reajuste = novoS - salario;
			System.out.printf("Novo Salario: %.2f\n",novoS);
			System.out.printf("Reajuste ganho: %.2f\n",reajuste);
			System.out.println("Em percentual: 10 %");
		}
		else if (salario > 1200.00 && salario <= 2000.00) {
			novoS = salario + (salario * 0.07);
			reajuste = novoS - salario;
			System.out.printf("Novo Salario: %.2f\n",novoS);
			System.out.printf("Reajuste ganho: %.2f\n",reajuste);
			System.out.println("Em percentual: 7 %");
		}
		else {
			novoS = salario + (salario * 0.04);
			reajuste = novoS - salario;
			System.out.printf("Novo Salario: %.2f\n",novoS);
			System.out.printf("Reajuste ganho: %.2f\n",reajuste);
			System.out.println("Em percentual: 4 %");
		}
		
		
		
		sc.close();

	}

}
