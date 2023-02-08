package entities;

public class Baskhara {
	public double a;
	public double b;
	public double c;
	public double r1;
	public double r2;
	
	public double delta() {
		return (b*b) - (4 * a * c);
	}
	
	public void raizes() {
		if (delta() >=0) {
			r1 = (-b + Math.sqrt(delta())) / (2*a);
			
			r2 = (-b - Math.sqrt(delta())) / (2*a);
		}
		else System.out.println("Impossivel calcular");
	}
 
}
