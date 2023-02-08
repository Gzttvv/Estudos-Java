package programa;


import java.util.Scanner;
import entites.Conta_Banco;

public class Exercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		
		
		Conta_Banco cont1 = new Conta_Banco();
		
		System.out.println("Digite o numero da conta:");
		int numeroConta = sc.nextInt();
		cont1.setNumeroConta(numeroConta);
		
		System.out.println("Digite o nome da conta:");
		String nomeConta = sc.next();
		cont1.setNomeConta(nomeConta);
		
		System.out.println("Deseja fazer um primeiro deposito? 1 = SIM, 0 = NÃO");
		int resposta = sc.nextInt();
		if (resposta == 1) {
			System.out.println("Digite o valor: ");
			double valorConta = sc.nextDouble();
			cont1.setValorConta(valorConta);
		}
		else System.out.println("");
		
		System.out.print(cont1);
		System.out.println("");
		System.out.println("Fazer deposito: ");
		double valorConta = sc.nextDouble();
		cont1.addValor(valorConta);
		
		System.out.print(cont1);
		
		System.out.println("Fazer saque: ");
		 valorConta = sc.nextDouble();
		cont1.removeValor(valorConta);
		
		
		System.out.print(cont1);
		
		
		sc.close();

	}

}
