package exceptions;

public class BusinessLogic {
    public void account(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        checkLogin(login);
        checkPassword(password);
        checkConfirmPassword(confirmPassword, password);
    }

    public void checkLogin(String login) throws WrongLoginException {
        boolean a = login.matches("\\w{20,}");
        if (a = false) {
            throw new WrongLoginException();
        }
    }

    public void checkPassword(String password) {
        boolean a = password.matches("\\w{20,}");
        if (a = false) {
            throw new WrongPasswordException();
        }
    }

    public void checkConfirmPassword(String confirmPassword, String password) {
        confirmPassword.equals(password);
        if (confirmPassword.equals(password)) {
        } else {
            throw new WrongPasswordException();
        }
    }
}
