<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.model.vo.Member"%>
<% Member member = (Member)session.getAttribute("member"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Petmily</title>
<style type="text/css">
body {
	display:flex;
	justify-content:center;
	align-items:center;
	height:100vh;
	margin:0;
	flex-direction:column;
}

h2 {
	text-align:center;
	margin-bottom:15;
}

button {
	width:280px;
	height:30px;
	display:block;
	margin-top:0;
	text-decoration:none;
}

a {
	text-decoration:none;
}
</style>
</head>
<body>
<h2>삭제 과정 중 문제가 발생하였습니다.</h2>
<a href="/petmily/suggest?mseq=<%=member.getMemberSeq()%>"><button>확인</button></a>
</body>
</html>