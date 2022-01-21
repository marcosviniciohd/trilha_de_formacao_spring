package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Ola")
public class OlaMundoJava extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
        out.println("<body>");
        out.println("<h1> Legal, vc escreveu a sua primeira servlet.</h1>");
        out.println("</body>");
        out.println("</html>");
        
        out.close();
        
        System.out.println("O Servlet OlaMundo foi chamado!!!");
	}

}
