package VerifyAuthentication;

import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

public class Authentication {
    public boolean verifyAuthentication(String login, String password, String confirmPassword) {
        return checkLogin(login) && checkPassword(password, confirmPassword);
    }

    private boolean checkLogin(String login) {
        if (login.length() < 20 && login.indexOf(" ") < 0) {
            return true;
        } else {
            throw new WrongLoginException("Login does not match requirements");
        }
    }

    private boolean checkPassword(String password, String confirmPassword) {
        boolean foundNumber = false;
        if (password.length() < 20 && password.indexOf(" ") < 0) {
            for (int ch = 0; ch < password.length(); ch ++) {
                char symbol = password.charAt(ch);
                if (Character.isDigit(symbol)) {
                    foundNumber = true;
                    break;
                }
            }
        }

        if (foundNumber && password.equals(confirmPassword)) {
            return true;
        } else {
            throw new WrongPasswordException(
                    "The password does not meet the requirements or does not match the confirmed one"
            );
        }
    }
}