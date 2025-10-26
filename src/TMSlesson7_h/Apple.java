package TMSlesson7_h;

import java.lang.reflect.Field;

public class Apple {

    private String color="red";

    public String getColor() {

        return color;

    }

}

class Test {

    public static void main(String[] args) {

        Apple apple = new Apple();

        try {

            Field field = Apple.class.getDeclaredField("color");
            field.setAccessible(true);
            field.set(apple, "green");
            System.out.println("New color: " + apple.getColor());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}