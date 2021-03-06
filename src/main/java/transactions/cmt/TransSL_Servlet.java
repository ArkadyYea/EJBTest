package transactions.cmt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/transSL")
public class TransSL_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	TransSL tsl;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h3>Stateless Session Bean - Container Managed Transaction</h3>");
		
		tsl.trans(out);
		tsl.transAsync();
		
	}
}
