package br.com.estudandoemcasa.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/nova-empresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nameEmpresa = request.getParameter("nome");
		System.out.println("Cadastrando nova-empresa = " + nameEmpresa);
		
		PrintWriter out = response.getWriter();
		out.println("<html>"
				+ "<head><title>Cadastro de Empresas</title></head>"
				+ "<body><h2>Empresa " + nameEmpresa + " Cadastrada com sucesso.</h2></body></html>");
	}

}
