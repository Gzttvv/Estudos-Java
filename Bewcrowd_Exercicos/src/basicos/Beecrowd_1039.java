package basicos;
import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1039 {

	public static void main(String[] args) {
		
		
		  
		  Locale.setDefault(Locale.US);
		  Scanner sc = new Scanner(System.in);
		  double a,b,c,delta,r1,r2;
	        
	        a = sc.nextDouble();
	        b = sc.nextDouble();
	        c =  sc.nextDouble();
	        
	        delta = (b*b) - (4*a*c);
	        
	        if (delta >= 0) {
	        r1 = (-b + Math.sqrt(delta)) / (2*a);
	        r2 = (-b + Math.sqrt(delta)) / (2*a);
	        
	        	System.out.printf("R1 = %.5f\n",r1);
		        System.out.printf("R2 = %.5f",r2);
	        } 
	        else System.out.print("Impossivel calcular");
	        
	        sc.close();
	}

}
