package entities;

public class Empregados {
	
	public  int id;
	public String name;
	public double salary;
	
	// Construtores da classe
	public void construtor_new_empregado() {};
	public void construtor_new_empregado(int id,String name,double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	};
	
	// Gets and Setters 
	public int getId() {
		return id;
	};
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	};
	
	
}
