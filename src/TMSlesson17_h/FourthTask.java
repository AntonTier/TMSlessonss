package TMSlesson17_h;

import java.util.function.Consumer;

public class FourthTask {

    public static void main(String[] args) {

        Consumer<String> printer = x->{

            String [] s = x.split(" ");
            System.out.println("Сумма в долларах: " + 0.35*Double.parseDouble(s[0]));

        };

        printer.accept("600 BYN");

    }

}
