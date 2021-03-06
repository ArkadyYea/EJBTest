package environment_entries;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/environmentEntries")
public class EnvironmentEntriesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	EnvironmentEntriesTest eet;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h3>Environment Entries (Deplyment Descriptor - ejb-jar.xml)</h3>");
		
		eet.testMethod(out);
		
	}
	
}
