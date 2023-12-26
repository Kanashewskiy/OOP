package homework2;

public class MainClass {
    public static void main(String[] args) {
       run();
    }

    private static void run() {
        Cat cat = new Cat("Barsik", 100, false);
        Plate plate = new Plate(100);
        plate.info();
        if (cat.getAppetite() <= plate.getFood()) {
            cat.eat();
            plate.setFood(plate.getFood() - cat.getAppetite());
            plate.info();
        } else System.out.println("Малова-то еды!");
    }
}