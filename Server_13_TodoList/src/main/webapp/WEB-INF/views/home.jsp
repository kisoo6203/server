<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MY TODO List</title>
<style>
	/* style 지정을 위하여 전체 초기화 */
	* {
		box-sizing: border_box;
		margin:0;
		padding:0;
	}
	
	h1, form.doit{
		width:50%;
		margin:10px auto;
		border-radius: 5px;
	}
	h1 {
		background-color: rgba(0,255,0,0.3);
		color:white; /* 글자색 화이트 */
		padding:1rem; /* todolist 위아래크기 늘리기 */
		text-align:center; /* 텍스트를 중앙으로 보내기 */
		/* text에 그림자 지정 */
		text-shadow: 1px 1px 1px #000;
	}
	form.doit {
		border: 1px solid red; /* 빨간색 입력상자 만들기 */
		padding:10px;
		text-align: center;
	}
	form.doit input {
		width:90%;
		outline: 0; /* input box를 클릭하면 진한테두리가 생기는것을 방지 */
		border: 1px solid #eee; /* #eee 색으로 상자 만들기 */
		border-radius: 5px;
		padding:15px;
		margin: 10px;
		font-weight: bold; /* 굵은 글자로 만들기 */
	}
	form.doit input:hover {
		background-color: #eee; /* 입력박스에 마우스가 올라가면 #eee색으로 바꾸기 */
	}
</style>
</head>
<body>
	<h1>To Do List</h1>

	<%--
		form tag의 action 속성
		form tag의 action 속성은 form에 담긴 데이터를
		서버로 전송할 때 (submit할때)
		어떤 uri path를 통해서 서버에 보낼 것인가를
		지정하는 것
		
		만약 이 action속성을 지정하지 않으면 
		현재 파일(home.jsp)을 보여줄때 사용한
		uri 주소가 자동으로 설정이 된다
		
		${rootPath}/ 처럼 주소를 지정하는 것
		form, a tag등에 URL, URI를 지정할 때
		
		주소의 지정방식에 따라 상대주소, 절대주소 방법이 있는데
		지정하는 방법에 따라 연결이 잘 안되는 경우가 많다
		
		우리 프로젝트는 모두 절대주소 지정방식으로 통일하고
		항상 주소(URI, URL)과 관련된 모든 항목은
		${rootPath} 시작하는 주소로 사용한다
		rootPath = http://localhost:8080/todo
		 --%>
	<form class="doit" method="POST" action="${rootPath}/insert">
		<input name="td_doit" placeholder="할일을 입력한 후 Enter">
	</form>


</body>
</html>