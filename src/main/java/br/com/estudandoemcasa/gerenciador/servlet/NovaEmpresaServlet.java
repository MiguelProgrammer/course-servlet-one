package br.com.estudandoemcasa.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.estudandoemcasa.gerenciador.entity.Bank;
import br.com.estudandoemcasa.gerenciador.entity.Company;

@WebServlet("/nova-empresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nameCompany = request.getParameter("nome");
		Bank bank = new Bank();
		Company company = null;
		String page = "/error.jsp";

		if (!bank.existCompanyName(nameCompany)) {
			company = new Company(1, nameCompany);
			bank.addCompany(company);
			page = "/companyCreated.jsp";
		}

		RequestDispatcher rd = request.getRequestDispatcher(page);
		request.setAttribute("company", company);
		rd.forward(request, response);
	}

}
