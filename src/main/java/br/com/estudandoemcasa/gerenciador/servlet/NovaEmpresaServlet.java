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

@WebServlet("/nova-empresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nameCompany = request.getParameter("nome");
		String dateOpen = request.getParameter("date-open");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		Bank bank = new Bank();
		Company company = null;
		String page = "/error.jsp";

		if (!bank.existCompanyName(nameCompany)) {
			
			try {
				company = new Company(Company.count+1, nameCompany, sdf.parse(dateOpen));
			} catch (ParseException e) {
				throw new ServletException("Erro of Parse date." + e.getMessage());
			}
			
			bank.addCompany(company);
			page = "/companyCreated.jsp";
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(page);
		request.setAttribute("company", company);
		rd.forward(request, response);
	}
}
