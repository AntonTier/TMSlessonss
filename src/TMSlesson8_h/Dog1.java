package TMSlesson8_h;

public class Dog1 {
    private Dog1() {
    }

    public void voice() {
        System.out.println("ГАв");
    }

    public void eat() {
        System.out.println("Собака ест");
    }

    public static class DogAccessor {
        public static void useDog() {
            Dog1 dog = new Dog1();
            dog.voice();
            dog.eat();
        }
    }
}
