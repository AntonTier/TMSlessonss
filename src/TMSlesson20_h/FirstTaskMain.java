package TMSlesson20_h;

import java.util.Scanner;

public class FirstTaskMain {

    static int[] array;
    static int minResult;
    static int maxResult;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arrLength =  s.nextInt();
        System.out.println();
        array = new int[arrLength];
        for (int i = 0; i<arrLength;i++) {

            System.out.print("Введите элемент под индексом " + i + ": ");
            array[i] = s.nextInt();
            System.out.println();

        }

        Thread minThread = new Thread(new MinFinder());
        Thread maxThread = new Thread(new MaxFinder());

        minThread.start();
        maxThread.start();

        try {
            minThread.join();
            maxThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nМинимальный элемент: " + minResult);
        System.out.println("Максимальный элемент: " + maxResult);

    }

}

class MinFinder implements Runnable {

    @Override
    public void run() {

        if (FirstTaskMain.array.length == 0) {
            FirstTaskMain.minResult = 0;
            return;
        }

        int min = FirstTaskMain.array[0];
        for (int i = 1; i < FirstTaskMain.array.length; i++) {
            if (FirstTaskMain.array[i] < min) {
                min = FirstTaskMain.array[i];
            }
        }

        FirstTaskMain.minResult = min;
        System.out.println("Поток для поиска минимума завершил работу");

    }

}


class MaxFinder implements Runnable {

    @Override
    public void run() {

        if (FirstTaskMain.array.length == 0) {
            FirstTaskMain.maxResult = 0;
            return;
        }

        int max = FirstTaskMain.array[0];
        for (int i = 1; i < FirstTaskMain.array.length; i++) {
            if (FirstTaskMain.array[i] > max) {
                max = FirstTaskMain.array[i];
            }
        }

        FirstTaskMain.maxResult = max;
        System.out.println("Поток для поиска максимума завершил работу");

    }

}
