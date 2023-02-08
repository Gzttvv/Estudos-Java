package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Empregados;

public class Lista_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Listas
		List<Empregados> listaEmpregados = new ArrayList<>();
		
		// Globais
		int max_empregados,id_check;
		double aument_salario,porcentagem;
		
		// Input employes 
		System.out.println("Quantos empregados novos serão registrados?");
		max_empregados = sc.nextInt();
		
		
		// loop for insert on list
		for (int i = 0 ; i < max_empregados; i++ ) {
			//
			Empregados addEmpregado = new Empregados();
			
			System.out.println("Registro do Empregado n"+(i+1)+"#");
			System.out.print("Id do empregado: ");
			int id = sc.nextInt();
				// Check for id on BD
				for (int j= 0; j < listaEmpregados.size();) {
					if (id == listaEmpregados.get(j).getId()) {
						System.out.println("=== Invalid Id! ===");
						System.out.print("Digite novamente: ");
						id = sc.nextInt();
					} 
					else j++;

				}
			
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			addEmpregado.construtor_new_empregado(id,name,salary);
			System.out.println("");
			
		
			listaEmpregados.add(addEmpregado);
		}

		
		System.out.println("");
		System.out.println(" === Aumento de sálario ==="); 
		System.out.print("Insira a Id do empregado: ");
		
		id_check = sc.nextInt(); 
		
			// check on BD for the emplyoee
			for (int j= 0; j < listaEmpregados.size();j++) {
				if (id_check == listaEmpregados.get(j).getId()) {
					
					System.out.print("Digite a % do aumento salarial: ");
					aument_salario = sc.nextDouble();
					porcentagem = aument_salario /100;
					
						for (int k= 0; k < listaEmpregados.size();k++) {
							if (id_check == listaEmpregados.get(k).getId()) {
								double temp = listaEmpregados.get(k).getSalary();
								listaEmpregados.get(k).setSalary((temp*porcentagem)+temp);
								System.out.println("Novo salario: "+listaEmpregados.get(k).getSalary());
							} 
						}
				} 
				else 
	
					System.out.println("Programa encerrado! ");
					System.out.println("");
					
	
			}
			// loop for print, list elements
			System.out.println("=== Lista de empregados atualizada ===");
			for (int x = 0; x < listaEmpregados.size();x++) {
				System.out.println("Id: "+listaEmpregados.get(x).getId());
				System.out.println("Nome: "+listaEmpregados.get(x).getName());
				System.out.println("Salario: "+listaEmpregados.get(x).getSalary());
				System.out.println("");
			}
		
		sc.close();

	}



}
