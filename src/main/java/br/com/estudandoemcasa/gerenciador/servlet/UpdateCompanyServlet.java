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

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nameCompany = request.getParameter("nameCompany");
		String date = request.getParameter("date");
		
		String idCompany = request.getParameter("idCompany");
		String flag = request.getParameter("alter");

		Bank bank = new Bank();
		String page = "/error.jsp";

		SimpleDateFormat sdf = null;
		if(flag.equals("notok")) {
			sdf = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy");
		} else {
			date = date.replaceAll(" ","");
			sdf = new SimpleDateFormat("dd/MM/yyyy");
		}
		
		try {
			Company company = new Company(Integer.parseInt(idCompany), nameCompany, sdf.parse(date));
			page = "/FormNewCompany.jsp";

			if(flag.equals("ok")) {
				bank.setCompany(company);
				page = "/listCompany.jsp";
			}
			
			RequestDispatcher rd = request.getRequestDispatcher(page);
			request.setAttribute("company", company); 
			rd.forward(request, response);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
