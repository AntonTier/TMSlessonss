package TMSlesson17_h;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class ThirdTask {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите сумму в формате “*сумма* BYN”: ");
        String balance = s.nextLine();
        System.out.println();

        String [] strs = balance.split(" ");

        try {

            double amount = Double.parseDouble(strs[0]);

            Function<Double, String> convert = x -> {
                double dollars = x * 0.35;
                return String.format(dollars + " долларов");
            };

            System.out.println(convert.apply(amount));

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: невозможно преобразовать в число");
        }
    }

}
