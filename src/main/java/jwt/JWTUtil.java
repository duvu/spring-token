package jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

/**
 * @author beou on 8/20/17 03:15
 * @version 1.0
 */
@Component
public class JWTUtil {
    private static final String SECRET      = "secret";
    Algorithm algorithm;

    private static JWTUtil instance = null;
    public static JWTUtil getInstance () {
        if (instance == null) {
            instance = new JWTUtil();
        }
        return instance;
    }

    public JWTUtil() {
        try {
            this.algorithm = Algorithm.HMAC256(SECRET);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public String createAndSign() {
        try {
            return JWT.create()
                    .withIssuer("auth0")
                    .sign(algorithm);
        } catch (JWTCreationException exception){
            //Invalid Signing configuration / Couldn't convert Claims.
            return null;
        }
    }

    public boolean verify(String token) {
        try {
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer("auth0")
                    .build(); //Reusable verifier instance
            DecodedJWT jwt = verifier.verify(token);
            return true;
        } catch (JWTVerificationException exception){
            //Invalid signature/claims
            return false;
        }
    }
}
