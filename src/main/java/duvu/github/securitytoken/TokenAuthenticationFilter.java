package duvu.github.securitytoken;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author beou on 8/20/17 01:29
 * @version 1.0
 */
@Component
public class TokenAuthenticationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        //verify token here
        String token = request.getHeader("Authorization");

        //TODO verify token and load user-detail into security-context here
        // when login --> create token & push authorization to redis to load later here.

        chain.doFilter(request, response);
    }
}
