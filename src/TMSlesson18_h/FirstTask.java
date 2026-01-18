package TMSlesson18_h;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FirstTask {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                1, 2, 3, 4, 5, 2, 4, 6, 7, 8, 8, 9, 10, 3, 5
        ));

        List<Integer> resultList = numbers.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("Новый список: " + resultList);

        int sumFromList = resultList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Сумма из нового списка: " + sumFromList);

    }

}
