import exceptions.BusinessLogic;
import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        BusinessLogic businessLogic = new BusinessLogic();
        try {
            businessLogic.account("19120", "1d", "11");
        } catch (WrongLoginException e) {
        } catch (WrongPasswordException e) {
        }
    }
}

