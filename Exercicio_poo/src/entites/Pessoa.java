package entites;

public class Pessoa {
	private int idade;
	private double altura;
	private String nome;
	
	public Pessoa() {
		
	}
	public Pessoa(int idade,double altura,String nome) {
		this.idade = idade;
		this.altura = altura;
		this.nome = nome;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getNome() {
		return  nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
