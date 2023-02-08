package programa;

import java.util.Scanner;

import entites.Empregado;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		/*Empregado empregado = new Empregado();
		System.out.print("Nome: ");
		empregado.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		empregado.salarioBruto = sc.nextDouble();
		System.out.print("imposto: ");
		empregado.imposto = sc.nextDouble();
		System.out.println();
		System.out.println("Employee: " + empregado);
		System.out.println();
		System.out.print("porcentagem? ");
		double porcentagem = sc.nextDouble();
		empregado.salarioAum(porcentagem);
		System.out.println();
		System.out.println("Updated data: " + empregado);
		sc.close();
		*/
		
		Empregado empregado = new Empregado();
		
		System.out.print("Nome: ");
		empregado.nome = sc.next();
		System.out.print("Salario bruto: ");
		empregado.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		empregado.imposto = sc.nextDouble();
		System.out.println(empregado);
		System.out.println("Porcentagem do aumento");
		double porcentagem = sc.nextDouble();
		empregado.salarioAum(porcentagem);
		System.out.println("Salario corrigido: "+empregado);
		
		sc.close();

	}

}
