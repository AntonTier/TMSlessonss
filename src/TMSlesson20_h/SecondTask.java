package TMSlesson20_h;

import java.util.Arrays;
import java.util.Random;

public class SecondTask {

    public static void main(String[] args) throws InterruptedException {

        int[] nums = new int[8];
        Random rand = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Случайный массив: " + Arrays.toString(nums));

        int[] arr1 = nums.clone();
        int[] arr2 = nums.clone();
        int[] arr3 = nums.clone();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i < arr1.length; i++) {
                for (int j = i; j > 0 && arr1[j] < arr1[j-1]; j--) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j-1];
                    arr1[j-1] = temp;
                }
            }
            System.out.println("1. Вставками:    " + Arrays.toString(arr1));
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < arr2.length; i++) {
                int min = i;
                for (int j = i+1; j < arr2.length; j++) {
                    if (arr2[j] < arr2[min]) min = j;
                }
                int temp = arr2[i];
                arr2[i] = arr2[min];
                arr2[min] = temp;
            }
            System.out.println("2. Выбором:      " + Arrays.toString(arr2));
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < arr3.length; i++) {
                for (int j = 0; j < arr3.length-1; j++) {
                    if (arr3[j] > arr3[j+1]) {
                        int temp = arr3[j];
                        arr3[j] = arr3[j+1];
                        arr3[j+1] = temp;
                    }
                }
            }
            System.out.println("3. Пузырьком:    " + Arrays.toString(arr3));
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

    }
}