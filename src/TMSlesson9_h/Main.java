package TMSlesson9_h;

public class Main {

    public static void main(String[] args) {

        Cat c = new Cat();
        c.doVoice();
        Dog d = new Dog();
        d.doVoice();

        Hp h = new Hp();
        h.getClassName();
        Mac m = new Mac();
        m.getClassName();

        Director di = new Director();
        di.doPosition();
        Worker w = new Worker();
        w.doPosition();
        Accountant a = new Accountant();
        a.doPosition();

        Rectangle r = new Rectangle();
        Circle cir = new Circle();
        Triangle t = new Triangle();
        r.Perimeter();
        cir.Perimeter();
        t.Perimeter();
        Figure [] figures = {new Circle(),new Triangle(),new Rectangle(),new Triangle(),new Circle()};


    }

}
