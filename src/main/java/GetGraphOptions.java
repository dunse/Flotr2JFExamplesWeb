

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class GetGraphOptions
 */
public class GetGraphOptions extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String example = request.getParameter("example");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		if (example == null) {
			example = "1";
		}
		
		switch (Integer.valueOf(example)) {
		case 1:
			out.println(ExampleGraph1.getGraphOptions());
			break;
		case 2:
			out.println(ExampleGraph2.getGraphOptions());
			break;
		case 3:
			out.println(ExampleGraph3.getGraphOptions());
			break;
		case 4:
			out.println(ExampleGraph4.getGraphOptions());
			break;
		case 5:
			out.println(ExampleGraph5.getGraphOptions());
			break;
		case 6:
			out.println(ExampleGraph6.getGraphOptions());
			break;
		}

		out.close();
	}
}
