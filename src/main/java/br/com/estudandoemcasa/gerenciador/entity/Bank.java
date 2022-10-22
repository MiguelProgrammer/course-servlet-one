package br.com.estudandoemcasa.gerenciador.entity;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private static List<Company> companys = new ArrayList<>();
	
	public Bank() {
	}
	
	static {
		Company company = new Company(1, "Company One");
		Company company2 = new Company(1, "Company Two");
		companys.add(company);
		companys.add(company2);
	}
	
	public void addCompany(Company company) {
		this.companys.add(company);
	}

	public List<Company> listCompany(){
		return this.companys;
	}

}
