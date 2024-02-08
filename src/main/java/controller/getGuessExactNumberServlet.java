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
 * Servlet implementation class getGuessExactNumberServlet
 */
@WebServlet("/getGuessExactNumberServlet")
public class getGuessExactNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getGuessExactNumberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String exactNum = request.getParameter("guessExactNum");
		
		NumberGuesser userGuess = new NumberGuesser(Integer.parseInt(exactNum));
		
		request.setAttribute("userExactGuess", userGuess);
		
		getServletContext().getRequestDispatcher("/exactResult.jsp").forward(request, response);
		
		
		//PrintWriter writer = response.getWriter();
		
		//writer.println("exact");
		//writer.close();
	}

}
