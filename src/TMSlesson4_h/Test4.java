package TMSlesson4_h;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {

        //printArrayBothWays();
        SearchMaxMin();

    }

    public static void printArrayBothWays() {

        Scanner input  = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = input.nextInt();
        int [] array = new int[size];

        System.out.println();

        for (int i=0;i<=array.length-1;i++) {

            System.out.println("Введите " + i + " элемент массива: ");
            array[i] = input.nextInt();

        }

        System.out.println();
        System.out.print("Вывод массива в прямом порядке: ");
        for (int i=0;i<=array.length-1;i++) {

            System.out.print(array[i] + " ");

        }

        System.out.println();
        System.out.print("Вывод массива в обратном порядке: ");
        for (int i= array.length-1;i>=0;i--) {

            System.out.print(array[i] + " ");

        }

    }

    public static void SearchMaxMin() {

        Scanner input  = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = input.nextInt();
        int [] array = new int[size];

        System.out.println();

        for (int i=0;i<=array.length-1;i++) {

           array[i] = (int) (Math.random()*100);

        }

        System.out.println("Ваш массив: ");
        for (int i=0;i<=array.length-1;i++) {

            System.out.print(array[i] + " ");

        }

        int min = array[0];
        int max = array[0];

        for (int i = 0;i<=array.length-1;i++) {

            if (array[i]>max) {

                max=array[i];

            }

        }

        System.out.println();
        System.out.println("Максимальный элемент: " + max);

        for (int i = 0;i<=array.length-1;i++) {

            if (array[i]<min) {

                min=array[i];

            }

        }

        System.out.println("Минимальный элемнет: " + min);

    }

}