package org.codecop.auth;

public interface AuthenticationService {

    AuthenticationResult authenticate(String phoneEmailUserName, String password);

    void rememberMe(String phoneEmailUserName);
}
