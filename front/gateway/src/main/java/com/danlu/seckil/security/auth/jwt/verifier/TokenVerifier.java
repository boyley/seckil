package com.danlu.seckil.security.auth.jwt.verifier;

public interface TokenVerifier {
    public boolean verify(String jti);
}
