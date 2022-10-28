package br.com.estudandoemcasa.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.estudandoemcasa.gerenciador.model.*;

@WebServlet("/delete-company")
public class DeleteCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idCompany = request.getParameter("idCompany");
		String page = "/error.jsp";
		Bank bank = new Bank();
		if (bank.removeCompany(bank.existCompanyId(Integer.parseInt(idCompany)))) {
			page = "list-company";
		}

		response.sendRedirect(page);
	}
}
