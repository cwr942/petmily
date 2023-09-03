package post.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import post.model.service.PostSerivce;
import post.model.vo.Post;

/**
 * Servlet implementation class StandardPostMyPostViewServlet
 */
@WebServlet("/pmypost")
public class PostMyPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostMyPostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PostSerivce pSerivce = new PostSerivce();
		ArrayList<Post> list = new ArrayList<Post>();
		int memberSeq = Integer.parseInt(request.getParameter("memberseq"));
		list = pSerivce.getMyPostList(memberSeq);
		
		RequestDispatcher view = null;
		
		if(list.size() > 0) {
			view = request.getRequestDispatcher("views/post/postList.jsp");
			
			request.setAttribute("list", list);
		} else {
			view = request.getRequestDispatcher("views/common/waiting.jsp");
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
