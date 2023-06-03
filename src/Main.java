import exceptions.BusinessLogic;
import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        BusinessLogic businessLogic = new BusinessLogic();
        try {
            businessLogic.account("19120", "1d л", "11");
        } catch (WrongLoginException e) {
            System.out.println("Неверный логин");
        } catch (WrongPasswordException e) {
            System.out.println("Неверный пароль");
        }
    }
}

