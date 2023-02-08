package entites;

public class Conta_Banco {
// pertence ao exercicio 5 
// propriedades da classe 
	private int numeroConta;
	private String nomeConta;
	private double valorConta;
// Funções contrutoras do Objeto
	public void Conta_banco(int numeroConta,String nomeConta) {
		this.nomeConta = nomeConta;
		this.numeroConta = numeroConta;
		this.valorConta = 0;
	}
	public void Conta_banco(int numeroConta,String nomeConta, double valorConta) {
		this.nomeConta = nomeConta;
		this.numeroConta = numeroConta;
		this.valorConta = valorConta;
	}
// Metodos GET E SET
	public String getNomeConta() {
		return nomeConta;
	}
	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getValorConta() {
		return valorConta;
	} 
	public void setValorConta(double valorConta) {
		this.valorConta = valorConta;
	}
	
	// Metodos e de entrada e saida de valores 
	public void addValor (double valorConta) {
		this.valorConta += valorConta;
	}
	public void removeValor (double valorConta) {
		int taxa =5;
		this.valorConta -= valorConta;
		this.valorConta -= taxa;
	
	}
	
	
	// Metodo de exibição do Objeto
	public  String toString () {
		return "Numero da conta: " 
				+ numeroConta 
				+ "\nNome: "
				+ nomeConta 
				+ "\nValor disponivel: "
				+ valorConta+"\n";
	}
}
	
