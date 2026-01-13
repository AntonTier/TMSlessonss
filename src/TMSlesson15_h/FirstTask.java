package TMSlesson15_h;

import java.util.*;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите набор чисел через запятую: ");
        String input = scanner.nextLine();
        List<Integer> numbers = parseStringToIntegerList(input);
        Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);
        String result = formatListToString(uniqueNumbers);
        System.out.println("Результат без дубликатов: " + result);

        scanner.close();
    }

    private static List<Integer> parseStringToIntegerList(String input) {
        List<Integer> result = new ArrayList<>();

        String[] parts = input.split(",");

        for (String part : parts) {
            try {
                int number = Integer.parseInt(part.trim());
                result.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Пропущен некорректный элемент: " + part);
            }
        }

        return result;
    }

    private static String formatListToString(Collection<Integer> numbers) {
        StringBuilder sb = new StringBuilder();

        boolean isFirst = true;
        for (int number : numbers) {
            if (!isFirst) {
                sb.append(", ");
            }
            sb.append(number);
            isFirst = false;
        }

        return sb.toString();
    }
}