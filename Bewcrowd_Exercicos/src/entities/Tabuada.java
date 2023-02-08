package entities;

public class Tabuada {
	public int n1;

	public void Tabu () {
		System.out.println("===== Tabuada =====");
		
		
		for (int i = 0 ; i <= 10; i++) {
			int multi1 = n1;
			int multi2 = i;
			int res = n1*i;
			System.out.println(multi1 + " x " + multi2 + " = "+ res );
		
		}
		System.out.println("===== Tabuada =====");
	}
	
}
