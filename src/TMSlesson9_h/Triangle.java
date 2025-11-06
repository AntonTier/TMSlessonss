package TMSlesson9_h;

import java.util.Scanner;

public class Triangle extends Figure{

    public void Perimeter() {

        System.out.println("Вычисление периметра прямоугольника");
        Scanner s2 = new Scanner(System.in);
        int firstSide;
        int secondSide;
        int thirdSide;

        while (true) {

            System.out.print("Введите первую сторону треугольника: ");
            firstSide = s2.nextInt();
            System.out.print("Введите вторую сторону треугольника: ");
            secondSide = s2.nextInt();
            System.out.print("Введите третью сторону треугольника: ");
            thirdSide = s2.nextInt();
            if (firstSide>0 && secondSide>0 && thirdSide>0) {

                break;

            }
            else {

                System.out.println("Введите корректные значения");
                continue;

            }

        }
        System.out.println();

        System.out.println("Периметр треугольника со сторонами " + firstSide + ", " + secondSide + ", " + "равен " + (firstSide + secondSide + thirdSide));


    }

    public void Square() {

        System.out.println("Вычисление площади треугольника");
        Scanner s2 = new Scanner(System.in);
        int height;
        int baseSide;

        while (true) {

            System.out.print("Введите высоту треугольника: ");
            height = s2.nextInt();
            System.out.print("Введите основание треугольника: ");
            baseSide = s2.nextInt();
            if (height>0 && baseSide>0) {

                break;

            }
            else {

                System.out.println("Введите корректные значения");
                continue;

            }

        }
        System.out.println();

        System.out.println("Площадь треугольника с основанием " + baseSide + " и высотой " + height + " равна " + ((baseSide*height)/2));


    }

}
