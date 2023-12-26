package homework2;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat() {
        satiety = true;
        System.out.println("Кот кушает " + appetite + " еды" + '\n' + satiety);
    }

    public int getAppetite() {
        return appetite;
    }

}