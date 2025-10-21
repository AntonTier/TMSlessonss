package TMSlesson6_h;

public class SimpleATM {
    static int count20 = 0;
    static int count50 = 0;
    static int count100 = 0;

    public static void main(String[] args) {

        initializeATM(10, 10, 10);

        addMoney(5, 0, 2);

        removeMoney(270);
    }

    static void initializeATM(int c20, int c50, int c100) {
        count20 = c20;
        count50 = c50;
        count100 = c100;
    }

    static void addMoney(int add20, int add50, int add100) {
        count20 += add20;
        count50 += add50;
        count100 += add100;
        System.out.println("Деньги добавлены.");
    }

    static boolean removeMoney(int amount) {
        int originalAmount = amount;
        int temp20 = count20;
        int temp50 = count50;
        int temp100 = count100;

        int n100 = Math.min(amount / 100, temp100);
        amount -= n100 * 100;

        int n50 = Math.min(amount / 50, temp50);
        amount -= n50 * 50;

        int n20 = Math.min(amount / 20, temp20);
        amount -= n20 * 20;

        if (amount == 0) {
            count100 -= n100;
            count50 -= n50;
            count20 -= n20;

            System.out.println("Выдано:");
            if (n100 > 0) System.out.println("100 x " + n100);
            if (n50 > 0) System.out.println("50 x " + n50);
            if (n20 > 0) System.out.println("20 x " + n20);
            return true;
        } else {
            System.out.println("Невозможно выдать сумму " + originalAmount + " текущим набором купюр.");
            return false;
        }
    }
}
