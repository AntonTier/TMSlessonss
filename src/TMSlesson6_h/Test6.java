package TMSlesson6_h;

public class Test6 {
}

class Calculator {

    Calculator(double weight,double cost,String color) {

        this.weight = weight;
        this.cost = cost;
        this.color = color;

        System.out.println("создаётся объект Calculator");

    }

    double weight;
    double cost;
    String color;

    public static void sum (int a,int b) {

        System.out.println("Сумма двух чисел: " + (a+b));

    }

    public static void difference(int a,int b) {

        System.out.println("Разность двух чисел: " + (a-b));

    }

    public static void divide(int a,int b) {

        System.out.println("Результат деления двух чисел: " + ((double) a/b));

    }

    public static void multiply(int a,int b) {

        System.out.println("Результат умножения двуз чисел: " + (a*b));

    }

}

class Person {

    String fullName;
    int age;

    Person() {

        System.out.println("Объект Peerson создан");

    }

    Person(String fullName,int age) {

        this.fullName = fullName;
        this.age = age;

        System.out.println("fullName: " + this.fullName);
        System.out.println("age: " + this.age);

    }

    public  void talk(String text) {

        System.out.println(this.fullName + " talk " + text);

    }

    public  void move() {

        System.out.println(this.fullName + " walk");

    }

}

class testProgram {

    public static void main(String[] args) {

        Calculator c = new Calculator(70.8,15.50,"red");

        System.out.println("Вес: " + c.weight);
        System.out.println("Цена: " + c.cost);
        System.out.println("Цвет: " + c.color);

        Calculator.sum(1,3);
        Calculator.difference(5,6);
        Calculator.divide(9,5);
        Calculator.multiply(10,76);

        Person p1 = new Person();
        Person p2 = new Person("Anton",18);
        p2.move();
        p2.talk("Hello");
    }

}