package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		// entendendo o basico sobre listas 
		
		//Sintaxe
		List<String> lista = new ArrayList<>();
		
		lista.add(sc.nextInt(),sc.next());
		
		
		// List = Interface generica do tipo list.
		
		//<String> = nesse caso usa a classe wrapped String mas poderia ser outra
		// contanto que fosse uma classe wrapped para definir o tipo de dado da lista
		// <Integer>, <Boolean>, <Float>, <Double>.
		
		// lista = o nome da variavel
		
		// new = instancia um novo obj ou classe.
		
		//ArrayList = classe que cria um lista generica com os metodos da interface List
		
		// <> = operador diamond, instancia uma lista generica
		
		;
		
		// .add = adiciona um elemento na lista = sintaxe = .add(index do elemento,elemento)
		
		for (String x: lista) {
			System.out.println(x);
		}	
		sc.close();
		
		
		

	}

}
