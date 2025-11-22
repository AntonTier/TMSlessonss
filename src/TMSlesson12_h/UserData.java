package TMSlesson12_h;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserData {

    public static void main(String[] args) {

        parseTextForData();

    }

    public static void parseTextForData() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        // Регулярные выражения для поиска информации
        Pattern emailPattern = Pattern.compile("\\b\\S+@\\S+\\.\\S+\\b");
        Pattern documentPattern = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{2}\\b");
        Pattern phonePattern = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}\\b");

        System.out.println("Найденная информация:");
        boolean found = false;

        Matcher emailMatcher = emailPattern.matcher(text);
        while (emailMatcher.find()) {
            System.out.println("email: " + emailMatcher.group());
            found = true;
        }

        Matcher documentMatcher = documentPattern.matcher(text);
        while (documentMatcher.find()) {
            System.out.println("document number: " + documentMatcher.group());
            found = true;
        }

        Matcher phoneMatcher = phonePattern.matcher(text);
        while (phoneMatcher.find()) {
            System.out.println("phone number: " + phoneMatcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("Информация не найдена");
        }

        scanner.close();

    }

}
