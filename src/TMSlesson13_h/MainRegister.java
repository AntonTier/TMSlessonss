package TMSlesson13_h;

import java.util.Scanner;

public class MainRegister {

    public static void main(String[] args) {

        verify();

    }

    public static void verify() {

        try {

            System.out.print("Введите пароль: ");
            String password = new Scanner(System.in).nextLine();
            System.out.print("Подтвердите пароль: ");
            String confirmPassword = new Scanner(System.in).nextLine();
            System.out.print("Введите логин: ");
            String login= new Scanner(System.in).nextLine();

            verifyLogin(login);
            verifyPassword(password,confirmPassword);
            System.out.println("Регистрация успешна!");


        }
        catch (WrongLoginException | WrongPasswordException e) {

            System.out.println(e.getMessage());

        }

    }

    public static void verifyLogin(String login) throws WrongLoginException {

        if (login.length()>20 || login.trim().isEmpty()) {

            throw new WrongLoginException("Неправильно введенный логин");

        }

    }

    public static void verifyPassword(String password,String confirmPassword) throws WrongPasswordException {

        if (!password.equals(confirmPassword) || password.length()>20 || password.trim().isEmpty() || !password.matches(".*\\d.*")) {

            throw new WrongPasswordException("Неправильно введенный пароль");

        }

    }

}
