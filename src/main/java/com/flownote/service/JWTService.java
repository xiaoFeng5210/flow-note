package com.flownote.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.stereotype.Service;

@Service
public class JWTService {
    private final String secret = "ZhangQingfeng1234567890";

    public static void main(String[] args) {
        JWTService jwtService = new JWTService();
//        String token = jwtService.generateSecrets("1", "zhangqingfeng");
//        System.out.println(token);
    }

    /**
     * 生成token
     * @param userId userId
     * @param username username
     */
    public String generateSecrets(String userId, String username) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.create()
                    .withIssuer("flow-note")
                    .withClaim("userId", userId)
                    .withClaim("username", username)
                    .sign(algorithm);
        } catch (JWTCreationException exception) {
            // Invalid Signing configuration / Couldn't convert Claims.
            return "";
        }
    }


    /**
     * jwt验证
     * @param token token
     */
    public Boolean validateToken(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            JWTVerifier verifier = JWT.require(algorithm).withIssuer("flow-note").build();
            DecodedJWT jwt = verifier.verify(token);
            System.out.println(jwt.getClaim("username"));
            return true;
        } catch (JWTVerificationException exception) {
            return false;
        }
    }
}
