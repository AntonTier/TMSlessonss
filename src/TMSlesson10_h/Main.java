package TMSlesson10_h;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person p1 = new Person("Anton", 18,0.0,new Cat("Martin"));
        Person p2 = (Person) p1.clone();
        p2.setName("Alex");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println("Сравнение объектов p1 и p2: " + p1.equals(p2));

    }

}
