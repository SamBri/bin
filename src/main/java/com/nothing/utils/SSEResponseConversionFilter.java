package com.nothing.utils;

import java.io.IOException;

import org.springframework.http.converter.HttpMessageConverter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SSEResponseConversionFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletResponse resp = ((HttpServletResponse) response);
		System.err.println("inside doFilter :: before");
		
		
		((HttpServletRequest) request).getHeaderNames().asIterator().forEachRemaining(System.err::println);
		
		
		System.err.println("Accept:"+((HttpServletRequest) request).getHeader("accept"));
		System.err.println("Accept-Encoding"+((HttpServletRequest) request).getHeader("accept"));




//		  resp.setHeader("Content-Type", "text/plain");
//		  response = resp;
		if (resp.getStatus() == 200) {
			System.err.println("200 response code received");

			System.err.println("Content-type:" + resp.getContentType());
			
			
			if(resp.getContentType() != null) {
				
				if(resp.getContentType().contains("text/event-stream")) {
					System.err.println("streaming object content type defined by writer");
				}else {
					System.err.println("server has not responded");

				}
			}
			
		

		}

		chain.doFilter(request, response);

	}

}
