package TMSlesson9_h;

import java.util.Scanner;

public class Circle extends Figure {

    public void Perimeter() {

        System.out.println("Вычисление периметра Круга");
        Scanner s1 = new Scanner(System.in);
        int R;

        while (true) {

            System.out.print("Введите радиус круга: ");
            R = s1.nextInt();

            if (R>0) {

                break;

            }
            else {

                System.out.println("Введите корректные значения");
                continue;

            }

        }
        System.out.println();

        System.out.println("Длина окружности с радуисом " + R + " равен " + (2*3.14*R));


    }

    public void Square() {

        System.out.println("Вычисление площади круга");
        Scanner s1 = new Scanner(System.in);
        int R;

        while (true) {

            System.out.print("Введите радиус окружности: ");
            R = s1.nextInt();

            if (R>0) {

                break;

            }
            else {

                System.out.println("Введите корректные значения");
                continue;

            }

        }
        System.out.println();

        System.out.println("Площадь окружности с радиусом " + R + " равен " + (3.14*R*R));


    }

}
