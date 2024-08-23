package com.kh.user.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.user.model.service.UserService;
import com.kh.user.model.vo.Question;
import com.kh.user.model.vo.User;

/**
 * Servlet implementation class UserIdPwdFindController
 */
@WebServlet("/userIdPwdFind.user")
public class UserIdPwdFindController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserIdPwdFindController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Question> questionList = new UserService().selectQuestions();
        request.setAttribute("questionList", questionList);
		request.getRequestDispatcher("views/home/userIdPwdFind.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		 
		String userName = request.getParameter("userName");
		String birthday = request.getParameter("birthday");
		int questionNo = Integer.parseInt(request.getParameter("questionNo"));
		String questionAnswer = request.getParameter("questionAnswer");
		
		UserService us = new UserService();
		User u = us.findUser(userName, birthday, questionNo, questionAnswer);
		
		if (u != null) {
			System.out.println("aa");
            request.setAttribute("foundUserId", u.getUserId());
            request.setAttribute("foundUserName", userName);
            request.getRequestDispatcher("views/home/userIdPwdFind.jsp").forward(request, response);
        } else {
            request.setAttribute("message", "일치하는 회원이 없습니다.");
            request.getRequestDispatcher("views/home/userIdPwdFind.jsp").forward(request, response);
        }
	}

}
