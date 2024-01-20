package ru.geekbrains.oop.lesson4.homework;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */

    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        Orange orange = new Orange();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.add(apple, apple1, apple2);
        orangeBox.add(orange, orange1);

        System.out.println(orangeBox);

        System.out.println(appleBox.compare(orangeBox));

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.add(orange2);

        orangeBox1.transfer(orangeBox);

        System.out.println(orangeBox1.getWeight());
        System.out.println(appleBox.getWeight());

        appleBox.remove();

        System.out.println(appleBox);
    }
}
