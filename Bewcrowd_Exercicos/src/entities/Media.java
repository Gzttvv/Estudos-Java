package entities;

public class Media {
	private int n1;
	private int n2;
	public int media;
	
	public void media (int n1,int n2, int media) {
		this.media = media;
		this.n1 = n1;
		this.n2 = n2;
	}
	// construtor vazio
	public void media() {
		
	}
	// gets e setters
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	// verifica se a nota é menor ou maior que zero 
	public int Validacao() {
		if (this.n1 < 0 || this.n1 > 10 || this.n2 < 0 || this.n2 > 10 ) {
			return 0;
		}
		else return 1 ;
	}
	
}
