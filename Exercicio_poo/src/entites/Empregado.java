package entites;

public class Empregado {
	public String nome;
	public double salarioBruto;
	public double imposto;

	
	public double  salarioLiq() {
		return salarioBruto - imposto; 
	}
	
	public  void salarioAum (double porcentagem) {
		salarioBruto += salarioBruto* porcentagem/100 ;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiq());
		}
}
