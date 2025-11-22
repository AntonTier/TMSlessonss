package TMSlesson12_h;

import TMSlesson9_h.Mac;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Abbreviation {

    public static void findAbbreviations() {

        Scanner scanner = new Scanner(System.in,"UTF-8");

        System.out.print("Введите строку: ");
        String s = scanner.nextLine();
        System.out.println();

        Pattern p =Pattern.compile("\\b[A-ZА-Я]{2,6}\\b", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher m = p.matcher(s);
        System.out.print("Результат поиска: ");
        while(m.find()) {

            System.out.print(m.group() + " ");

        }

    }

    public static void main(String[] args) {

        findAbbreviations();


    }



}
