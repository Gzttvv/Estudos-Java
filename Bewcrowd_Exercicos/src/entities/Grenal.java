package entities;

public class Grenal {
	private int golInter;
	private int golGremio;
	private int vitI;
	private int vitG;
	private int empt;
	
	public Grenal () {
		
	}
	
	public Grenal(int golInter, int golGremio) {
		this.golInter = golInter;
		this.golGremio = golGremio;

	}
	

	public int getGolInter() {
		return golInter;
	}

	public void setGolInter(int golInter) {
		this.golInter = golInter;
	}

	public int getGolGremio() {
		return golGremio;
	}

	public void setGolGremio(int golGremio) {
		this.golGremio = golGremio;
	}
	
	public void vit (int golInter, int golGremio) {
		if (golInter > golGremio) {
		
			this.vitI += vitI++;
		}
		else if (golInter == golGremio)  {
			
			this.empt += empt++; 
		}
		else if (golInter < golGremio) {
			
			this.vitG += vitG++;
		}

	}
	
	public void res () {
		System.out.println("");
		System.out.println("==== Resultados do grenal ====");
		System.out.println("Inter: " + this.vitI);
		System.out.println("Gremio: " + this.vitG);
		System.out.println("Empate: " + this.empt);
		System.out.println("==== Resultados do grenal ====");
		System.out.println("");
	}
	
	public void maisVit () {
		if (this.vitI >this.vitG && this.vitI > this.empt) {
			System.out.println("Inter Venceu mais");
		}
		else if (this.empt >this.vitG && this.empt > this.vitI) {
			System.out.println("Mais empates");
		}
		else System.out.println("Gremio Venceu Mais");
	}
	
	
}

