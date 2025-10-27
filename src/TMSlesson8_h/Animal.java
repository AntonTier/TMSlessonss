package TMSlesson8_h;

abstract class Animal {
    public abstract void voice();

    public abstract void eat(String food);
}


class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Собака говорит Гав-гав");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Собака любит мясо!");
        } else {
            System.out.println("Собака не ест " + food);
        }
    }
}

class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Тигр рычит Рррр");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Тигр с удовольствием ест мясо.");
        } else {
            System.out.println("Тигр не ест " + food);
        }
    }
}

class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Кролик пищит Пи-пи");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Grass")) {
            System.out.println("Кролик любит травку!");
        } else {
            System.out.println("Кролик не ест " + food);
        }
    }
}
