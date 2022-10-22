package br.com.estudandoemcasa.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/miguel")
public class OlaMundo extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException  {
		PrintWriter out = resp.getWriter();
		out.println("<html><head><title>Olá Mundo</title></head><body><h2>Mundo Servlet</h2></body></html>");
	}

}
