package br.com.estudandoemcasa.gerenciador.entity;

public class Company {

	private Integer id;
	private String name;
	private static Integer count = 2;
	private Bank bank;

	public Company() {
	}

	public Company(Integer id, String name) {
		this.id = id + count;
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
