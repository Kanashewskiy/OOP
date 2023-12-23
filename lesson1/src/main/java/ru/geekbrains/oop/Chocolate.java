package ru.geekbrains.oop;

public class Chocolate extends Product{
    private double weight;
    private double bitter;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBitter() {
        return bitter;
    }

    public void setBitter(double bitter) {
        this.bitter = bitter;
    }

    public Chocolate(String name, String brand, double price, double weight, double bitter){
        super(name, brand, price);
        this.weight = weight;
        this.bitter = bitter;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - Стоимость: %.2f; Вес: %.2f; Горечь: %.2f",
                name, brand, price, weight, bitter);
    }
}
