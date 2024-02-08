package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NumberGuesser;

/**
 * Servlet implementation class getHigherOrLowerServlet
 */
@WebServlet("/getHigherOrLowerServlet")
public class getHigherOrLowerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getHigherOrLowerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String higherOrLower = request.getParameter("higherOrLower");
		
		NumberGuesser userGuess = new NumberGuesser(higherOrLower);
		
		request.setAttribute("userHighOrLowGuess", userGuess);
		
		getServletContext().getRequestDispatcher("/highOrLowResult.jsp").forward(request, response);
		
	}

}
