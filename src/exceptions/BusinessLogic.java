package exceptions;

public class BusinessLogic {
    public void account(String login, String password, String confirmPassword) {
        try {
            checkLogin(login);
            checkPassword(password);
            checkConfirmPassword(confirmPassword, password);
        } catch (WrongLoginException e) {
        } catch (WrongPasswordException e) {
        }

    }

    public void checkLogin(String login) throws WrongLoginException {
        boolean a = login.matches("\\w{20,}");
        if (a = false) {
            throw new WrongLoginException();
        }

    }

    public void checkPassword(String password) throws WrongPasswordException {
        boolean a = password.matches("\\w{20,}");
        if (a = false) {
            throw new WrongPasswordException();
        }
    }

    public void checkConfirmPassword(String confirmPassword, String password) throws WrongPasswordException {
        if (confirmPassword.equals(password)) {
        } else {
            throw new WrongPasswordException();
        }
}
}
