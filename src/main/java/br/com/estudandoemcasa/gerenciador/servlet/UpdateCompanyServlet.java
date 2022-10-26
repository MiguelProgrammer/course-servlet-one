package br.com.estudandoemcasa.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.estudandoemcasa.gerenciador.entity.Bank;
import br.com.estudandoemcasa.gerenciador.entity.Company;

@WebServlet("/update-company")
public class UpdateCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idCompany = request.getParameter("idCompany");

		Bank bank = new Bank();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String page = "/error.jsp";
		Company company = bank.existCompanyId(Integer.parseInt(idCompany));

		if (!company.getName().isBlank()) {
			page = "/FormNewCompany.jsp";
		}
		

		RequestDispatcher rd = request.getRequestDispatcher(page);
		request.setAttribute("company", company);
		rd.forward(request, response);

	}
}
