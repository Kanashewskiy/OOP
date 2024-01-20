package ru.geekbrains.oop.lesson4.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit>{
    private ArrayList<T> arrayList;

    public Box(T... items) {
        this.arrayList = new ArrayList<T>(Arrays.asList(items));
    }

    public void add(T... items) {
        this.arrayList.addAll(Arrays.asList(items));
    }

    public void remove(T... items) {
        for (T item: items) this.arrayList.remove(item);
    }

    public ArrayList<T> getArrayList() {
        return new ArrayList<T>(arrayList);
    }

    public void clear() {
        arrayList.clear();
    }

    public float getWeight() {
        if (arrayList.size() == 0) return 0;
        float weight = 0;
        for (T item: arrayList) weight += item.getWeight();
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void transfer(Box<? super T> box) {
        box.arrayList.addAll(this.arrayList);
        clear();
    }

    @Override
    public String toString() {
        return "[" +
                arrayList + ']';
    }
}
