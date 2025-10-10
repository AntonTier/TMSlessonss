package TMSlesson4_h;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {

        //printArrayBothWays();
        //SearchMaxMin();
        //CountZeroElements();
        reverseArray();

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

    public static void SearchMaxMin() { //второе и третье задание

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
        int index = 0;

        for (int i = 0;i<=array.length-1;i++) {

            if (array[i]>max) {

                max=array[i];
                index=i;

            }

        }

        System.out.println();
        System.out.println("Максимальный элемент: " + max + " а его индекс " + index);

        for (int i = 0;i<=array.length-1;i++) {

            if (array[i]<min) {

                min=array[i];
                index=i;

            }

        }

        System.out.println("Минимальный элемнет: " + min + " а его индекс " + index);

    }

    public static void CountZeroElements() {

        Scanner input  = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = input.nextInt();
        int [] array = new int[size];

        System.out.println();

        for (int i=0;i<=array.length-1;i++) {

            System.out.println("Введите " + i + " элемент массива: ");
            array[i] = input.nextInt();

        }

        int count=0;

        for(int i = 0;i<=array.length-1;i++) {

            if (array[i] == 0) {

                count++;

            }

        }

        if (count==0) {

            System.out.println("Нулевых элементов нет");

        }
        else {

            System.out.println("Количество нулевых элементов равно " + count);

        }

    }

    public static void reverseArray () {

        Scanner input  = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = input.nextInt();
        int [] array = new int[size];

        System.out.println();

        for (int i=0;i<=array.length-1;i++) {

            array[i] = (int) (Math.random()*100);

        }

        System.out.println("Исходный массив: ");
        for (int i = 0;i<=array.length-1;i++) {

            System.out.print(array[i] + " ");

        }

        System.out.println();
        int left = 0;
        int right = array.length-1;

        while (left<right) {

            int temp = array[left];
            array[left] = array[right];
            array[right] =temp;

            left++;
            right--;

        }

        System.out.println("Новый массив: ");
        for (int i = 0;i<=array.length-1;i++) {

            System.out.print(array[i] + " ");

        }

    }

}