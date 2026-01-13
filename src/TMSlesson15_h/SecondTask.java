package TMSlesson15_h;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SecondTask {

    private List<String> animals;

    public SecondTask() {

        this.animals = new LinkedList<>();
    }

    public void addAnimal(String animalName) {

        if(animalName==null || animalName.trim().isEmpty()) {

            System.out.println("Нельзя добавить пустое имя");

        }
        else {

            animals.add(0,animalName.trim());
            System.out.println("Добавлено животное: " + animalName);

        }

    }

    public void removeAnimal() {

        if (animals.isEmpty()) {

            System.out.println("Массив пуст");

        }
        else {
            System.out.println("Удален элемент: " + animals.get(animals.toArray().length - 1));
            animals.remove(animals.toArray().length - 1);
        }

    }

    public static void main(String[] args) {

        SecondTask a1 = new SecondTask();

        a1.addAnimal("Лось");
        a1.addAnimal("Собака");
        a1.addAnimal("Слон");

        System.out.println(a1.animals);

        a1.removeAnimal();

        System.out.println(a1.animals);

    }

}
