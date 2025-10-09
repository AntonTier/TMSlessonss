package TMSlesson3_h;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {

        //isEven();
        //getTemperature();
        //PrintSquares();
        //SequencePrinter();
        SumRange();

    }

    public static void isEven () {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = input.nextInt();

        if (a%2==0) {

            System.out.println("Число " + a + " четное");

        }
        else {

            System.out.println("Число " + a + " нечетное");

        }

        input.close();

    }

    public static void getTemperature() {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите температуру: ");
        int t = input.nextInt();

        if (t>-5) {

            System.out.println("Warm");

        }
        else if(t<=-5 && t>-20) {

            System.out.println("Normal");

        }
        else if(t<=-20) {

            System.out.println("Cold");

        }

    }

    public static void PrintSquares() {

        for (int i = 10;i<=20;i++) {

            System.out.println("Квадрат числа " + i + " равен " + i*i);

        }

    }

    public static void SequencePrinter() {

        for (int i = 7;i<=98;i+=7) {

            System.out.print(i + " ");

        }

    }

    public static void SumRange() {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = input.nextInt();
        if (a<=0) {

            System.out.println("Введите число больше 0!!!");

        }

        int sum = 0;

        for (int i = 0;i<=a;i++) {

            sum+=i;

        }

        System.out.println("Сумма от 1 до " + a + " равна " + sum);

    }


}
