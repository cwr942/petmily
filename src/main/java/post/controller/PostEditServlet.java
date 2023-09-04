package post.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import common.FileNameChange;
import post.model.service.PostSerivce;
import post.model.vo.Post;
import standardpost.model.vo.StandardPost;
import tradepost.model.vo.TradePost;

/**
 * Servlet implementation class StandardPostEditViewServlet
 */
@WebServlet("/pedit")
public class PostEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostEditServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int result = 0;
		RequestDispatcher view = null;
		Post p = null;
		PostSerivce pService = new PostSerivce();

		//1. multipart 방식으로 인코딩되어서 전송왔는지 확인
		if (!ServletFileUpload.isMultipartContent(request)) {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "form의 enctype='multipart/form-data' 속성 누락됨.");
			view.forward(request, response);
		}
		
		//2. 업로드할 파일의 용량 제한 설정 : 10메가바이트로 제한한다면
		int maxSize = 1024 * 1024 * 10;
		
		//3. 업로드되는 파일의 저장 폴더 지정
		String savePath = request.getSession().getServletContext().getRealPath("/resources/postupfiles");
		//request.getSession().getServletContext()  => "/first"  + 뒤에 하위 폴더 경로 추가함
		

		//4. request 를 MultipartRequest 로 변환해야 함
		//MultipartRequest 클래스는 외부 라이브러리를 사용해야 함 : cos.jar 사용한 경우
		//MultipartRequest 객체가 생성되면, 자동으로 지정 폴더에 업로드된 파일이 저장됨
		MultipartRequest mrequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new DefaultFileRenamePolicy());
		String originalFileName = mrequest.getFilesystemName("upfile");
		int postSeq = Integer.parseInt(mrequest.getParameter("postseq"));
		String postType = mrequest.getParameter("post-type");
		String postContent = mrequest.getParameter("post-content");
		int memberSeq = Integer.parseInt(mrequest.getParameter("memberseq"));
		
		if(postType.equals("standardpost")) {
			p = new StandardPost();
			p.setPostSeq(postSeq);
			p.setMemberSeq(memberSeq);
			p.setPostContent(postContent);
			p.setOriginalFileName(null);
			p.setChangedFileName(null);
			if(originalFileName != null) {
				System.out.println("일반게시글 파일 변경 하고 있음");
				pService.deleteImage(p);
				String renameFileName = FileNameChange.change(originalFileName, savePath, "yyyyMMddHHmmss");
				p.setOriginalFileName(originalFileName);
				p.setChangedFileName(renameFileName);
			}
		} else {
			p = new TradePost();
			p.setPostSeq(postSeq);
			p.setMemberSeq(memberSeq);
			p.setPostContent(postContent);
			p.setOriginalFileName(null);
			p.setChangedFileName(null);
			if(mrequest.getFilesystemName("upfile") != null) {
				pService.deleteImage(p);
				String renameFileName = FileNameChange.change(originalFileName, savePath, "yyyyMMddHHmmss");
				p.setOriginalFileName(originalFileName);
				p.setChangedFileName(renameFileName);
			}
		}
		
		result = pService.updatePost(p.getMemberSeq(), p);

		if (result > 0) {
			// insert successful
			System.out.println(8);
			String path = "/petmily/plist?memberseq=" + String.valueOf(memberSeq);
			response.sendRedirect(path);
		} else {
			String path = "/petmily/plist?memberseq=" + String.valueOf(memberSeq);
			response.sendRedirect(path);
		}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
