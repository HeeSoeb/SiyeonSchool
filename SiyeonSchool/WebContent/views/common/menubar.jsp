<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    .header-area {
        width: 100%;
        height: 100px;
        box-shadow: 0px 15px 5px -9px gray;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .header-area img{
        width: 60px;
        height: 55px;
        margin-right: 30px;
    }
    .header-area img:last-child(){
        margin: 0;
    }
</style>
</head>
<body>

    <div class="header-area" align="center">
        <a href="javascript:void(0)"><img src="resources/images/home_sel.png" alt="홈버튼"></a>
        <a href="javascript:void(0)"><img src="resources/images/mail_sel.png" alt="메일버튼"></a>
        <a href="javascript:void(0)"><img src="resources/images/todo_sel.png" alt="todo버튼"></a>
        <a href="javascript:void(0)"><img src="resources/images/add_sel.png" alt="주소록버튼"></a>
        <a href="javascript:void(0)"><img src="resources/images/class_sel.png" alt="수업자료버튼"></a>
        <a href="javascript:void(0)"><img src="resources/images/homework_sel.png" alt="과제버튼"></a>
        <a href="javascript:void(0)"><img src="resources/images/equipment_sel.png" alt="도구버튼"></a>
    </div>
</body>
</html>