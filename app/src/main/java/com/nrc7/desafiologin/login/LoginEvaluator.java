package com.nrc7.desafiologin.login;

public class LoginEvaluator {

    private static final String EXAMPLE_PASS = "123456";
    private LoginCallback callback;

    public LoginEvaluator(LoginCallback callback) {
        this.callback = callback;
    }

    public void loginEvaluation(String password) {
        String masterPass = EXAMPLE_PASS;
        if (!password.equals(masterPass)) {
            callback.notLogged();
        } else {
            callback.isLogged();
        }
    }
}
