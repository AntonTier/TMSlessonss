package TMSlesson9_h;

import java.util.Scanner;

public class Rectangle extends Figure {

    public void Perimeter() {

        System.out.println("Вычисление периметра прямоугольника");
        Scanner s = new Scanner(System.in);
        int firstSides;
        int secondSides;

        while (true) {

            System.out.print("Введите первые две стороны прямоегольника: ");
            firstSides = s.nextInt();
            System.out.print("Введите оставшиеся две стороны прямоегольника: ");
            secondSides = s.nextInt();
            if (firstSides>0 && secondSides>0) {

                break;

            }
            else {

                System.out.println("Введите корректные значения");
                continue;

            }

        }
        System.out.println();

        System.out.println("Периметр прямоугольника со сторонами " + firstSides + " и " + secondSides + " равен " + (firstSides*2 + secondSides*2));

    }

    public void Square() {

        System.out.println("Вычисление площади прямоугольника");
        Scanner s = new Scanner(System.in);
        int firstSides;
        int secondSides;

        while (true) {

            System.out.print("Введите первые две стороны прямоегольника: ");
            firstSides = s.nextInt();
            System.out.print("Введите оставшиеся две стороны прямоегольника: ");
            secondSides = s.nextInt();
            if (firstSides>0 && secondSides>0) {

                break;

            }
            else {

                System.out.println("Введите корректные значения");
                continue;

            }

        }
        System.out.println();

        System.out.println("Площадь прямоугольника со сторонами " + firstSides + " и " + secondSides + " равен " + (firstSides*secondSides));


    }

}
