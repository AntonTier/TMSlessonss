package TMSlesson17_h;

import java.util.Scanner;
import java.util.function.Supplier;

public class FifthTask {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите строку для переворота: ");
        String str = s.nextLine();
        System.out.println();

        Supplier<String> refreshStr = () -> {

            StringBuilder strRefresh = new StringBuilder("");

            for (int i = str.length()-1;i>=0;i--) {

                strRefresh.append(str.charAt(i));

            }

            s.close();

            return strRefresh.toString();

        };

        System.out.println(refreshStr.get());

    }

}
