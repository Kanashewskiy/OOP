package ru.geekbrains.oop.lesson4.homework;

public abstract class Fruit {

    private float weight;

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Вес фрукта = " + weight + 'f';
    }
}
