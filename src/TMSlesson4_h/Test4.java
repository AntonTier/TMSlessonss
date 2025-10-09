package TMSlesson4_h;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {

        printArrayBothWays();

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

    }

}