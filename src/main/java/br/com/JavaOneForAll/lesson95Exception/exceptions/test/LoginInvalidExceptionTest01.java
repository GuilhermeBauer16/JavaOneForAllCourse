package br.com.JavaOneForAll.lesson95Exception.exceptions.test;

import br.com.JavaOneForAll.lesson95Exception.domain.LoginInvalidException;

import java.util.Scanner;

public class LoginInvalidExceptionTest01 {
    public static void main(String[] args) {

        try {
            login();
        } catch (LoginInvalidException e) {
            throw new RuntimeException(e);
        }

    }

    private static void login() throws LoginInvalidException {
        Scanner scanner = new Scanner(System.in);
        String usernameDb = "Goku";
        String passwordDb = "ssj";
        System.out.println("Username: ");
        String typedUsername = scanner.nextLine();
        System.out.println("password: ");
        String typedPassword = scanner.nextLine();

        if (!usernameDb.equals(typedUsername) || !passwordDb.equals(typedPassword)){
            throw new LoginInvalidException("Username or Password is incorrect");
        }

        System.out.println("login completed");

    }
}
