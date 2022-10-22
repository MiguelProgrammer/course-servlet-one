package br.com.estudandoemcasa.gerenciador.entity;

public class Company {

	private Integer id;
	private String name;
	
	public Company() {
	}
		
	public Company(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.id;
	}
	
	
}
