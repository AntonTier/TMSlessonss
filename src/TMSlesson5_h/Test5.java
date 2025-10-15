package TMSlesson5_h;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test5 {

    public static void main(String[] args) {

        //processMatrix();
        //generateChessBoard();
        snakeFill();

    }

    public static void processMatrix() {

        Scanner input = new Scanner(System.in);
        Random r = new Random();

        int rows = 3;
        int cols = 4;
        int [][] matrix = new int[rows][cols];

        System.out.println("Исходная матрица");

        for (int i = 0;i<rows;i++) {

            for (int j = 0;j<cols;j++) {

                matrix[i][j] = r.nextInt(100);
                System.out.print(matrix[i][j] + " ");

            }

            System.out.println();

        }

        System.out.println();
        System.out.print("Введите число для добавления: ");
        int plus = input.nextInt();
        int sum=0;
        System.out.println();
        System.out.println("Измененная матрица: ");

        for (int i = 0;i<rows;i++) {

            for (int j = 0;j<cols;j++) {

                matrix[i][j] += plus;
                sum+=matrix[i][j];
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }

        System.out.println();
        System.out.println("Сумма всех чисел в матрице: " + sum);

        input.close();

    }

    public static void generateChessBoard() {

        Random r = new Random();

        int cols = 8;
        int rows = 8;

        char [][] matrix = new char[rows][cols];

        for (int i = 0;i<rows;i++) {

            for (int j = 0;j<cols;j++) {

                if ((i+j)%2 == 0) {

                    matrix[i][j] = 'W';

                }
                else {

                    matrix[i][j] = 'B';

                }

                System.out.print(matrix[i][j] + " ");

            }

            System.out.println();

        }



    }

    public static void snakeFill() {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int rows = input.nextInt();
        System.out.print("Введите количество столбцов: ");
        int cols = input.nextInt();
        System.out.println();

        int [][] matrix = new int[rows][cols];
        int value = 0;

        for (int i = 0;i<rows;i++) {

            if (i%2==0) {

                for (int j = 0;j<cols;j++) {

                    matrix[i][j] = value++;
                    System.out.print(matrix[i][j] + " ");

                }
                System.out.println();

            }
            else {

                for (int j = cols-1;j>=0;j--) {

                    matrix[i][j] = value++;

                }
                //System.out.println(Arrays.toString(matrix[i]));
                for (int j = 0;j<matrix[i].length;j++) {

                    System.out.print(matrix[i][j] + " ");

                }
                System.out.println();
            }

        }
    }

}

