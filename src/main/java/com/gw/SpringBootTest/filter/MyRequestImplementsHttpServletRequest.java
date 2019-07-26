package com.gw.SpringBootTest.filter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpUpgradeHandler;
import javax.servlet.http.Part;

public class MyRequestImplementsHttpServletRequest implements HttpServletRequest{
	
	HttpServletRequest request;

	public MyRequestImplementsHttpServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	@Override
	public Object getAttribute(String name) {
		// TODO Auto-generated method stub
		return this.request.getAttribute(name);
	}

	@Override
	public Enumeration<String> getAttributeNames() {
		// TODO Auto-generated method stub
		return this.request.getAttributeNames();
	}

	@Override
	public String getCharacterEncoding() {
		// TODO Auto-generated method stub
		return this.request.getCharacterEncoding();
	}

	@Override
	public void setCharacterEncoding(String env) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		this.request.setCharacterEncoding(env);
	}

	@Override
	public int getContentLength() {
		// TODO Auto-generated method stub
		return this.request.getContentLength();
	}

	@Override
	public long getContentLengthLong() {
		// TODO Auto-generated method stub
		return this.request.getContentLengthLong();
	}

	@Override
	public String getContentType() {
		// TODO Auto-generated method stub
		return this.request.getContentType();
	}

	@Override
	public ServletInputStream getInputStream() throws IOException {
		// TODO Auto-generated method stub
		return this.request.getInputStream();
	}

	@Override
	public String getParameter(String name) {
		// TODO Auto-generated method stub
		return this.request.getParameter(name);
	}

	@Override
	public Enumeration<String> getParameterNames() {
		// TODO Auto-generated method stub
		return this.request.getParameterNames();
	}

	@Override
	public String[] getParameterValues(String name) {
		// TODO Auto-generated method stub
		return this.request.getParameterValues(name);
	}

	@Override
	public Map<String, String[]> getParameterMap() {
		// TODO Auto-generated method stub
		return this.request.getParameterMap();
	}

	@Override
	public String getProtocol() {
		// TODO Auto-generated method stub
		return this.request.getProtocol();
	}

	@Override
	public String getScheme() {
		// TODO Auto-generated method stub
		return this.request.getScheme();
	}

	@Override
	public String getServerName() {
		// TODO Auto-generated method stub
		return this.request.getServerName();
	}

	@Override
	public int getServerPort() {
		// TODO Auto-generated method stub
		return this.request.getServerPort();
	}

	@Override
	public BufferedReader getReader() throws IOException {
		// TODO Auto-generated method stub
		return this.request.getReader();
	}

	@Override
	public String getRemoteAddr() {
		// TODO Auto-generated method stub
		return this.request.getRemoteAddr();
	}

	@Override
	public String getRemoteHost() {
		// TODO Auto-generated method stub
		return this.request.getRemoteHost();
	}

	@Override
	public void setAttribute(String name, Object o) {
		// TODO Auto-generated method stub
		this.request.setAttribute(name, o);
	}

	@Override
	public void removeAttribute(String name) {
		// TODO Auto-generated method stub
		this.request.removeAttribute(name);
	}

	@Override
	public Locale getLocale() {
		// TODO Auto-generated method stub
		return this.request.getLocale();
	}

	@Override
	public Enumeration<Locale> getLocales() {
		// TODO Auto-generated method stub
		return this.request.getLocales();
	}

	@Override
	public boolean isSecure() {
		// TODO Auto-generated method stub
		return this.request.isSecure();
	}

	@Override
	public RequestDispatcher getRequestDispatcher(String path) {
		// TODO Auto-generated method stub
		return this.request.getRequestDispatcher(path);
	}

	@SuppressWarnings("deprecation")
	@Override
	public String getRealPath(String path) {
		// TODO Auto-generated method stub
		return this.request.getRealPath(path);
	}

	@Override
	public int getRemotePort() {
		// TODO Auto-generated method stub
		return this.request.getRemotePort();
	}

	@Override
	public String getLocalName() {
		// TODO Auto-generated method stub
		return this.request.getLocalName();
	}

	@Override
	public String getLocalAddr() {
		// TODO Auto-generated method stub
		return this.request.getLocalAddr();
	}

	@Override
	public int getLocalPort() {
		// TODO Auto-generated method stub
		return this.request.getLocalPort();
	}

	@Override
	public ServletContext getServletContext() {
		// TODO Auto-generated method stub
		return this.request.getServletContext();
	}

	@Override
	public AsyncContext startAsync() throws IllegalStateException {
		// TODO Auto-generated method stub
		return this.request.startAsync();
	}

	@Override
	public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse)
			throws IllegalStateException {
		// TODO Auto-generated method stub
		return this.request.startAsync(servletRequest, servletResponse);
	}

	@Override
	public boolean isAsyncStarted() {
		// TODO Auto-generated method stub
		return this.request.isAsyncStarted();
	}

	@Override
	public boolean isAsyncSupported() {
		// TODO Auto-generated method stub
		return this.request.isAsyncSupported();
	}

	@Override
	public AsyncContext getAsyncContext() {
		// TODO Auto-generated method stub
		return this.request.getAsyncContext();
	}

	@Override
	public DispatcherType getDispatcherType() {
		// TODO Auto-generated method stub
		return this.request.getDispatcherType();
	}

	@Override
	public String getAuthType() {
		// TODO Auto-generated method stub
		return this.request.getAuthType();
	}

	@Override
	public Cookie[] getCookies() {
		// TODO Auto-generated method stub
		return this.request.getCookies();
	}

	@Override
	public long getDateHeader(String name) {
		// TODO Auto-generated method stub
		return this.request.getDateHeader(name);
	}

	@Override
	public String getHeader(String name) {
		// TODO Auto-generated method stub
		return this.request.getHeader(name);
	}

	@Override
	public Enumeration<String> getHeaders(String name) {
		// TODO Auto-generated method stub
		return this.request.getHeaders(name);
	}

	@Override
	public Enumeration<String> getHeaderNames() {
		// TODO Auto-generated method stub
		return this.request.getHeaderNames();
	}

	@Override
	public int getIntHeader(String name) {
		// TODO Auto-generated method stub
		return this.request.getIntHeader(name);
	}

	@Override
	public String getMethod() {
		// TODO Auto-generated method stub
		return this.request.getMethod();
	}

	@Override
	public String getPathInfo() {
		// TODO Auto-generated method stub
		return this.request.getPathInfo();
	}

	@Override
	public String getPathTranslated() {
		// TODO Auto-generated method stub
		return this.request.getPathTranslated();
	}

	@Override
	public String getContextPath() {
		// TODO Auto-generated method stub
		return this.request.getContextPath();
	}

	@Override
	public String getQueryString() {
		// TODO Auto-generated method stub
		return this.request.getQueryString();
	}

	@Override
	public String getRemoteUser() {
		// TODO Auto-generated method stub
		return this.request.getRemoteUser();
	}

	@Override
	public boolean isUserInRole(String role) {
		// TODO Auto-generated method stub
		return this.request.isUserInRole(role);
	}

	@Override
	public Principal getUserPrincipal() {
		// TODO Auto-generated method stub
		return this.request.getUserPrincipal();
	}

	@Override
	public String getRequestedSessionId() {
		// TODO Auto-generated method stub
		return this.request.getRequestedSessionId();
	}

	@Override
	public String getRequestURI() {
		// TODO Auto-generated method stub
		return this.request.getRequestURI();
	}

	@Override
	public StringBuffer getRequestURL() {
		// TODO Auto-generated method stub
		return this.request.getRequestURL();
	}

	@Override
	public String getServletPath() {
		// TODO Auto-generated method stub
		return this.request.getServletPath();
	}

	@Override
	public HttpSession getSession(boolean create) {
		// TODO Auto-generated method stub
		return this.request.getSession(create);
	}

	@Override
	public HttpSession getSession() {
		// TODO Auto-generated method stub
		//this.request
		return this.request.getSession();
	}

	@Override
	public String changeSessionId() {
		// TODO Auto-generated method stub
		return this.request.changeSessionId();
	}

	@Override
	public boolean isRequestedSessionIdValid() {
		// TODO Auto-generated method stub
		return this.request.isRequestedSessionIdValid();
	}

	@Override
	public boolean isRequestedSessionIdFromCookie() {
		// TODO Auto-generated method stub
		return this.request.isRequestedSessionIdFromCookie();
	}

	@Override
	public boolean isRequestedSessionIdFromURL() {
		// TODO Auto-generated method stub
		return this.request.isRequestedSessionIdFromURL();
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean isRequestedSessionIdFromUrl() {
		// TODO Auto-generated method stub
		return this.request.isRequestedSessionIdFromUrl();
	}

	@Override
	public boolean authenticate(HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		return this.request.authenticate(response);
	}

	@Override
	public void login(String username, String password) throws ServletException {
		// TODO Auto-generated method stub
		this.request.login(username, password);
	}

	@Override
	public void logout() throws ServletException {
		// TODO Auto-generated method stub
		this.request.logout();
	}

	@Override
	public Collection<Part> getParts() throws IOException, ServletException {
		// TODO Auto-generated method stub
		return this.request.getParts();
	}

	@Override
	public Part getPart(String name) throws IOException, ServletException {
		// TODO Auto-generated method stub
		return this.request.getPart(name);
	}

	@Override
	public <T extends HttpUpgradeHandler> T upgrade(Class<T> httpUpgradeHandlerClass)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		return this.request.upgrade(httpUpgradeHandlerClass);
	}
	
}
