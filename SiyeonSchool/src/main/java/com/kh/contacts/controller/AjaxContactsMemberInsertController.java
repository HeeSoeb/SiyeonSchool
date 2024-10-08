package com.kh.contacts.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.kh.contacts.model.service.ContactsService;
import com.kh.contacts.model.vo.Contacts;
import com.kh.contacts.model.vo.ContactsCategory;
import com.kh.user.model.vo.User;

/**
 * Servlet implementation class ContactsMemberInsertController
 */
@WebServlet("/contacts/insert.member")
public class AjaxContactsMemberInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxContactsMemberInsertController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 주서록구성원 추가 컨트롤러 : "특정주소록"에 "특정유저"를 추가
		
		int contactsNo = Integer.parseInt(request.getParameter("contactsNo"));
		String[] strList = request.getParameter("checkedUsersNoList").split(","); // ex) "22,13,12" -> ["22","13","12"]
		ArrayList<Integer> checkedUsersNoList = new ArrayList<Integer>();         // ex) [22,13,12]
		
		for(String s : strList) {
			checkedUsersNoList.add(Integer.parseInt(s));
		}
		
		int result = new ContactsService().insertContactsMember(contactsNo, checkedUsersNoList);
		
		response.getWriter().print(result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
