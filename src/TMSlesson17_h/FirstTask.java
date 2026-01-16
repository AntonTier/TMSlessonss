package TMSlesson17_h;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class FirstTask {

    public static void main(String[] args) {

        System.out.println(BirthdayCalculator());

    }

    public static LocalDate BirthdayCalculator() {

        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Введите дату рождения в формате гггг-мм-дд: ");
            String birthdayDate = s.nextLine();
            LocalDate birthday = LocalDate.parse(birthdayDate);
            s.close();
            return birthday.plusYears(100);
        }
        catch (DateTimeParseException d){

            System.out.println("Внимание у вас ошибка: " + d.getMessage());
            return null;

        }

    }

}
