package ejb.bean.singletons;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/concurencyTimeout")
public class Concurrency_AccessTimeout_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	Concurrency_AccessTimeout cat;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h3>Concurrency - @AccessTimeout</h3>");
		
		cat.testMethod();
		
	}
}
