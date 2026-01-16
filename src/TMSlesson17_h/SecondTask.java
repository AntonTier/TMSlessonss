package TMSlesson17_h;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.List;
import java.util.stream.Collectors;

public class SecondTask {
    public static void main(String[] args) {
        Integer[] numbers = {5, -3, 12, 0, -8, 7, -1, 25};

        Predicate<Integer> isPositive = n -> n > 0;

        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        System.out.print("Положительные числа: ");

        Arrays.stream(numbers).filter(isPositive).forEach(n -> System.out.print(n + " "));

    }
}