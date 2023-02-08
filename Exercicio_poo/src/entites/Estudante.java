package entites;

public class Estudante {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notafinal() {
		return  nota1+nota2+nota3;
	}
	public double pontosFaltantes() {
		if (notafinal() < 60) {
			return 60 - notafinal();
		}
		else return 0;
	}
}
