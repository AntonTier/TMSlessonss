package TMSlesson11_h;

import java.util.Scanner;

public class StringTasks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        task1(scanner);
        task2(scanner);
        task3(scanner);

        scanner.close();

    }

    public static String[] inputStrokes(Scanner scanner) {

        String [] str = new String[3];
        System.out.println("Введите три строки");
        for (int i = 0;i<3;i++) {

            System.out.print("Введите " + i + " строку:");
            str[i] = scanner.nextLine();

        }

        return str;

    }

    public static void task1(Scanner scanner) {

        String [] strings = inputStrokes(scanner);

        String longest = strings[0];
        String shortest = strings[0];

        for (String str:strings) {

            if (str.length()<shortest.length()) {

                shortest = str;

            }
            if (str.length()>longest.length()) {

                longest = str;

            }

        }

        System.out.println("Самая длинная строка " + longest + " размером " + longest.length());
        System.out.println("Самая короткая строка " + shortest + " размером " + shortest.length());
    }

    public static void task2(Scanner scanner) {
        String[] strings = inputStrokes(scanner);

        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - 1 - i; j++) {
                if (strings[j].length() > strings[j + 1].length()) {

                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;

                }
            }
        }

        System.out.println("Строки в порядке возрастания длины:");
        for (String str : strings) {
            System.out.println( str +  "(длина: " + str.length() + ")");
        }
    }

    public static void task3(Scanner scanner) {

        String [] strings = inputStrokes(scanner);

        int totalLength = 0;
        for (String str:strings) {

            totalLength += str.length();

        }

        int midLength = totalLength/strings.length;

        for (String str:strings) {

            if (str.length()<midLength) {

                System.out.println("Средняя длина строк " + midLength);
                System.out.println("Строки меньше средней длины:");
                System.out.println("Строка " + str + " c длиной " + str.length());

            }

        }

    }

}
