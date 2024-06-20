package ex01.filter;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.GenericFilterBean;

import java.io.IOException;

public class MyFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    	Cookie cookie = new Cookie("MyFilter", "Works");
        cookie.setPath(((HttpServletRequest)request).getContextPath());
        cookie.setMaxAge(60);
        ((HttpServletResponse)response).addCookie(cookie);

    	chain.doFilter(request, response);
    }
}