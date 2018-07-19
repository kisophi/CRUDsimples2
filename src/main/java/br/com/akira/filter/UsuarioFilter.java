package br.com.akira.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class UsuarioFilter
 */
@WebFilter("/*")
public class UsuarioFilter implements Filter {
	public UsuarioFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		//Cria a session
		HttpSession session = req.getSession();

		//
		String uri = req.getRequestURI();
		
		//If libera apenas usuAutenticado,usuControllerLogin e login.jsp 
		if (session.getAttribute("usuAutenticado") != null
				||uri.lastIndexOf("login.jsp")>-1
				||uri.lastIndexOf("usuControllerLogin")>-1) {
			chain.doFilter(request, response);
		} else {
			res.sendRedirect("login.jsp");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
