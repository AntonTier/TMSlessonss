package TMSlesson6_h;

public class CreditCard {

    CreditCard (int accountNumber,double accountBalance) {

        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;

    }

    int accountNumber;
    double accountBalance;

    public void addBalance(double s) {

        System.out.println("-".repeat(50));
        System.out.println("Номер карты: " + accountNumber);
        System.out.println("Ваш текущий баланс: " + accountBalance);
        if (s>0) {

            accountBalance+=s;
            System.out.println("Ваш баланс после пополнения: " + accountBalance);

        }
        else {

            System.out.println("Введите корректное значение");

        }
        System.out.println("-".repeat(50));

    }

    public void removeBalance(double s) {

        System.out.println("-".repeat(50));
        System.out.println("Номер карты: " + accountNumber);
        System.out.println("Ваш текущий баланс: " + accountBalance);
        if (s<=accountBalance && s>0) {

            accountBalance-=s;
            System.out.println("Ваш баланс после снятия денег: " + accountBalance);

        }
        else {

            System.out.println("Введите корректное значение");

        }
        System.out.println("-".repeat(50));

    }

    public void outInformation () {

        System.out.println("-".repeat(50));
        System.out.println("Информация о вашей карточке");
        System.out.println("Номер вашей карточки: " + accountNumber);
        System.out.println("Ваш текущий баланс: " + accountBalance);
        System.out.println("-".repeat(50));

    }

}

class TestCard {

    public static void main(String[] args) {

        CreditCard c1 = new CreditCard(1,1000.0);
        CreditCard c2 = new CreditCard(2,500.50);
        CreditCard c3 = new CreditCard(3,1500.0);
        c1.addBalance(300.60);
        c2.addBalance(500);
        c3.removeBalance(400.40);

        c1.outInformation();
        c2.outInformation();
        c3.outInformation();

    }

}
