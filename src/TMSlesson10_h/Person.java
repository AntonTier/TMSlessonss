package TMSlesson10_h;

public class Person implements Cloneable {

    private String name;
    private int age;
    private double salary;
    private Cat perCat;

    public Person(String name, int age, double salary, Cat perCat) {

        this.name = name;
        this.age = age;
        this.salary = salary;
        this.perCat = perCat;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public double getSalary() {

        return salary;

    }

    public void setSalary(double salary) {

        this.salary = salary;

    }

    public Cat getPerCat() {
        return perCat;
    }

    public void setPerCat(Cat perCat) {
        this.perCat = perCat;
    }

    @Override
    public int hashCode() {

        return age + (int) salary;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", Cat=" + perCat.catName +
                '}';
    }
}
