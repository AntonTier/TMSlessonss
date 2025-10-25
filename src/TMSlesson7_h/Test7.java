package TMSlesson7_h;

public class Test7 {

    public static void main(String[] args) {

        //Первое дз
        House h = new House();
        Garage g = new Garage();
        System.out.println(h.getType());
        System.out.println(g.getType());

        //Второе дз
        Person p = new Person();
        System.out.println(p.age);
        System.out.println(p.name);
        System.out.println(p.getGender());

    }

}
