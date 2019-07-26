package com.gw.SpringBootTest.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyRequestExtendsHttpServletWrapper extends HttpServletRequestWrapper {
	

	public MyRequestExtendsHttpServletWrapper(HttpServletRequest request, HttpServletResponse response) {
		super(request);
		// TODO Auto-generated constructor stub
	}

	@Override
    public HttpSession getSession() {

        //return super.getSession(); // 这样就是沿用servlet容器的session管理

        return this.getSession(true);
    }

    @Override
    public HttpSession getSession(boolean create) {
    	return super.getSession();
    }
}
