/**
 * 
 */
package edu.villanova.csc.treatment.prediction.config;

/**
 * @author natew
 *
 */

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public final class CorsFilter extends OncePerRequestFilter  {
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
	        throws ServletException, IOException {
	    // CORS "pre-flight" request
	    response.addHeader("Access-Control-Allow-Origin", "*");
	    response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
	    response.addHeader("Access-Control-Allow-Headers", "Content-type,X-Requested-With,Origin,accept");
	    response.addHeader("x-access_token","Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With");
	    response.addHeader("Access-Control-Max-Age", "1800");
	
	    filterChain.doFilter(request, response);
	}
}
