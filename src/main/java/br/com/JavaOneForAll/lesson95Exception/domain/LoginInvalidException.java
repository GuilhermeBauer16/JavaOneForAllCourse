package br.com.JavaOneForAll.lesson95Exception.domain;

public class LoginInvalidException  extends Exception{

    public LoginInvalidException() {

        super("Invalid Login");
    }

    public LoginInvalidException(String message) {
        super(message);
    }



    @Override
    public String toString() {
        return "LoginInvalidException{}";
    }
}
