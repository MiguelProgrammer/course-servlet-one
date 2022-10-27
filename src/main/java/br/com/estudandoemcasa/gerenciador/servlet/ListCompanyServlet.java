package br.com.estudandoemcasa.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.estudandoemcasa.gerenciador.entity.Bank;

//@WebServlet("/list-company")
public class ListCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Bank bank = new Bank();
		request.setAttribute("companys", bank.listCompany());
		RequestDispatcher rd = request.getRequestDispatcher("/listCompany.jsp");
		rd.forward(request, response);
	}
}
