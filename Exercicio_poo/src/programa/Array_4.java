package programa;

import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor de entrada");
		int x = sc.nextInt();
		
		if (x > 0 && x < 1000000 ) {
			int acc100 = x / 100;
			x  =  x % 100;
			int acc50 = x /50 ; 
			x = x % 50;
			int acc20 = x / 20;
			x = x % 20;
			int acc10 = x / 10;
			x = x % 10 ; 
			int acc5 = x / 5;
			x = x % 5;
			int acc2 = x / 2;
			x = x % 2;
			int acc1 = x / 1;
			System.out.println(acc100);
			System.out.println(acc50);
			System.out.println(acc20);
			System.out.println(acc10);
			System.out.println(acc5);
			System.out.println(acc2);
			System.out.println(acc1);
		}
		
		System.out.println();
		sc.close();

	}

}
