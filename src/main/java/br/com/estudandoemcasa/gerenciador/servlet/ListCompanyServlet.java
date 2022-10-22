package br.com.estudandoemcasa.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.estudandoemcasa.gerenciador.entity.Bank;
import br.com.estudandoemcasa.gerenciador.entity.Company;

/**
 * Servlet implementation class ListCompanyServlet
 */
@WebServlet("/list-company")
public class ListCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Bank bank = new Bank();
		PrintWriter out = response.getWriter();

		out.println("<html><head><title>List Company</title></head><body><ul>");
		for(Company company : bank.listCompany()) {
			out.println("<li>" + company.getName() + "</li>");
		}
		out.println("</ul></body></html>");
	}
}
