package servicecenter.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicecenter.model.service.BoardService;
import servicecenter.model.vo.Board;

/**
 * Servlet implementation class SelectAllSuggest
 */
@WebServlet("/suggest")
public class SelectAllSuggestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectAllSuggestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		int mseq = Integer.parseInt(request.getParameter("mseq"));
//		String message = request.getParameter("message");
		
		BoardService bserv = new BoardService();
		ArrayList<Board> list = null;
		list = bserv.selectAllSuggest(mseq);
		
		RequestDispatcher view = null;
		
		if (list.size() > 0) {
//			view = request.getRequestDispatcher("views/servicecenter/mySuggestBoard.jsp");
			view = request.getRequestDispatcher("views/servicecenter/serviceCenter.jsp");
//			String message = request.getParameter("message");

			request.setAttribute("list", list);
//			request.setAttribute("message", message);
		} else {
			response.sendRedirect("views/servicecenter/dCommon/addFailed.jsp");
		}

		view.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
