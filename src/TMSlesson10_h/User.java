package TMSlesson10_h;

import java.util.Scanner;

public class User implements Cloneable {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User shallowClone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    public User deepClone() {
        return new User(this.name, this.age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }

}

class TestUser {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);

        User original = new User("Иван", 25);
        System.out.println("Исходный пользователь: " + original);

        System.out.print("Выберите тип клонирования (1 поверхностное, 2 глубокое): ");
        int choice = scanner.nextInt();


            User clone;

            if (choice == 1) {
                clone = original.shallowClone();
                clone.setName("Поверхностноее");

            } else if (choice == 2) {
                clone = original.deepClone();
                clone.setName("Глубокое");

            } else {
                System.out.println("Неверный выбор");
                return;
            }

            System.out.println("Исходный: " + original);
            System.out.println("Клон: " + clone);

    }
}