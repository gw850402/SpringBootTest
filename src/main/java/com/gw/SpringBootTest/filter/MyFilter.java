package com.gw.SpringBootTest.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Configuration;

@Configuration
@WebFilter(urlPatterns = "/login/logininfo",filterName = "loginFilter")
public class MyFilter implements Filter{
	
	@Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		HttpServletRequest httpServeltRequest = (HttpServletRequest)request;
//		
//		HttpSession httpSession = httpServeltRequest.getSession();
//		if(httpSession instanceof StandardSessionFacade)
//		{
//			StandardSessionFacade standardSessionFacade = (StandardSessionFacade)httpSession;			 
//		}
		
		HttpSession session = httpServeltRequest.getSession();
		String sessionId = session.getId();
		System.out.println(sessionId);
		
		chain.doFilter(request, response);
	}
	
	@Override
    public void destroy() {

    }

}
