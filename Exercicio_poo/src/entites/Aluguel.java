package entites;

public class Aluguel {
	
	private String name;
	private String email;
	
	
	// Funcões construtoras
	public void aluguel(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public void aluguel() {
		
	}
	
	// Get e sets 
	public String getName() {
		return name;
	}
	public void  setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void  setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nome: "+name+" email: "+email;
	}
	
}
