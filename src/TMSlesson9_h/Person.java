package TMSlesson9_h;

public class Person implements Cloneable {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "name=" + name + ", age=" + age ;
    }
}

class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person p1 = new Person("Антон", 18);
        Person p2 = (Person) p1.clone();
        System.out.println(p2.toString());
        System.out.println(p1 == p2);

    }
}
