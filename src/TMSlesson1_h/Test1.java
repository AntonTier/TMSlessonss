package TMSlesson1_h;

public class Test1 {

    public static void main(String[] args) {

        CalculateNumber();
        SumOfTwoDigit();
        SumOfThreeDigit();
        RoundNumber();
        DivisionWithRemainder();
        NumberReverse();

    }

    public static void CalculateNumber() {

        int c = 5;
        int b = 9;

        double a = 4*(b+c-1)/2;

        System.out.println(a);

    }

    public static void SumOfTwoDigit (){

        int n = 46;

        int firstNum = n/10;
        int secondNum = n%10;

        System.out.println(firstNum+secondNum);


    }

    public static void SumOfThreeDigit() {

        int n = 126;

        int firstNum = n/100;
        int secondNum = (n/10)%10;
        int thirdNum = n%10;

        System.out.println(firstNum+secondNum+thirdNum);

    }

    public static void RoundNumber () {

        double n = 3.7;
        System.out.println(Math.round(n));

    }

    public static void DivisionWithRemainder () {

        int q = 15;
        int w = 7;

        System.out.println("Результат деления q на w " + q/w + " , а остаток равен " + q%w);

    }

    public static void NumberReverse (){

        int a = 1;
        int b = 2;
        int c;
        c=b;
        b=a;
        a=c;

        System.out.println("Number a: " + a + " Number b: " + b);

    }

}