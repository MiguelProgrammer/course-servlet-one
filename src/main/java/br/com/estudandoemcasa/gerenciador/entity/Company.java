package br.com.estudandoemcasa.gerenciador.entity;

public class Company {

	private Integer id;
	private String name;
	public static Integer count; 

	public Company() {
	}

	public Company(Integer id, String name) {
		this.id = id;
		this.name = name;
		count = this.id;
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
