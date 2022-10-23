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
	
	public void setCompany(Company company) {
		for(Company cp :this.listCompany()) {
			if(cp.getName().equals(company.getName())) {
				cp = company;
				System.out.println("Compania igual");
			}
		}
	}
	
	public Company getCompany(Company company) {
		for(Company cp :this.listCompany()) {
			if(cp.getName().equals(company.getName())) {
				System.out.println("Retornonando compania");
				return company;
			}
		}
		return null;
	}

}
