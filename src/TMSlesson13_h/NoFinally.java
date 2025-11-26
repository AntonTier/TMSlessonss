package TMSlesson13_h;

public class NoFinally {

    public static void main(String[] args) {

        try {
            System.out.println("Выполняем try-блок");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Выполняем catch-блок");
        } finally {
            System.out.println("Выполняем finally-блок");
        }

    }

}
