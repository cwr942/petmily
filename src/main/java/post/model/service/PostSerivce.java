package post.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import post.model.dao.PostDao;
import post.model.vo.Post;
import standardpost.model.vo.StandardPost;

public class PostSerivce {
	PostDao pdao = new PostDao();
	
	public PostSerivce() {}
	
	public int getPostListCount() {
		int count = 0;
		Connection conn = getConnection();
		// TODO Auto-generated method stub

		count = pdao.getPostListCount(conn);
		close(conn);
		return count;
	}

	public ArrayList<Post> getPostList() {
		ArrayList<Post> list = null;
		Connection conn = getConnection();

		list = pdao.getPostList(conn);
		close(conn);
		return list;
	}

	public ArrayList<Post> getPostListFilter() {
		ArrayList<Post> list = null;
		Connection conn = getConnection();
		// TODO Auto-generated method stub

		list = pdao.getPostListFilter(conn);
		close(conn);
		return list;
	}
	
	public ArrayList<Post> getMyPostList(String userId) {
		ArrayList<Post> list = null;
		Connection conn = getConnection();
		// TODO Auto-generated method stub

		list = pdao.getMyPostList(conn, userId);
		close(conn);
		return list;
	}
	
	public int insertPost(int memberSeq, Post Post) {
		int result = 0;
		Connection conn = getConnection();
		// TODO Auto-generated method stub

		result = pdao.insertPost(conn, memberSeq, Post);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		return result;
	}
	
	public int updatePost(int memberSeq, Post post) {
		int result = 0;
		Connection conn = getConnection();
		// TODO Auto-generated method stub

		result = pdao.updatePost(conn, memberSeq, post);
		close(conn);
		return result;
	}
	
	public StandardPost selectPost(int postSeq) {
		// TODO Auto-generated method stub
		StandardPost sp = null;
		Connection conn = getConnection();

		sp = pdao.selectPost(conn, postSeq);
		close(conn);
		return sp;
	}
	
	public int deletePost(int memberSeq, int postSeq) {
		// TODO Auto-generated method stub
		int result = 0;
		Connection conn = getConnection();

		result = pdao.deletePost(conn, memberSeq, postSeq);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		return result;
	}
	
	public int updatePostLikeNo(int memberSeq, int postSeq) {
		// TODO Auto-generated method stub
		int result = 0;
		Connection conn = getConnection();

		result = pdao.updatePostLikeNo(conn, memberSeq, postSeq);
		close(conn);
		return result;
	}
	
	public int getPostLikeNo(int postSeq){
		// TODO Auto-generated method stub
		int tradePostLikeNo = 0;
		Connection conn = getConnection();
		tradePostLikeNo = pdao.getPostLikeNo(conn, postSeq);
		
		close(conn);
		return tradePostLikeNo;
	}
}
