package programa;

import java.util.Scanner;

import entites.Aluguel;

public class Pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		// Pergunta quantos quartos serão alugados
		System.out.println("Quantos quartos serão alugados? ");
		int qunt_estudantes = sc.nextInt();
		int room = 0;
		
		// Cria os arrays
		Aluguel[] info_ = new Aluguel[10]; // array com info dos users
	
		
		for(int i = 0 ; i < qunt_estudantes; i++) {
			
			System.out.println("Aluguel #"+(i+1));
			
			Aluguel pessoa = new Aluguel();
			
			System.out.print("Nome: ");
			sc.nextLine();
			pessoa.setName(sc.nextLine());
			
			System.out.print("Email: ");
			pessoa.setEmail(sc.next());
			
			System.out.print("Quarto: ");
			room = sc.nextInt();
			
			// Invejeta os dados no array na posição correponde aos do quarto
			info_[room] = pessoa;
			System.out.println("");
			
		}
		
		System.out.println("Quartos ocupados : ");
		for (int i = 0 ; i < info_.length;i++ ) {
			if (info_[i] != null) {
				System.out.println(i+": "+info_[i].getName() +", "+ info_[i].getEmail());
				
			}
		}
		
		sc.close();

	}

}
