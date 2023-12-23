package ru.geekbrains.oop;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Product bottleOfMilk1 =
                new BottleOfMilk("Молоко #1", "ООО Источник", 250, 0.5, 25);

        Product bottleOfMilk2 =
                new BottleOfMilk("Молоко #2", "ООО Источник", 280, 1.5, 1);

        Product bottleOfMilk3 =
                new BottleOfMilk("Молоко #3", "ООО Источник", 150, 1.5, 5);

        Product bottleOfMilk4 =
                new BottleOfMilk("Молоко #4", "ООО Источник", 290, 2, 25);

        Product chocolate =
                new Chocolate("Шоколад", "Алёнка", 100, 120, 45);

        Product chocolate1 =
                new Chocolate("Шоколад", "Милка", 120, 115, 50);

        Product chocolate2 =
                new Chocolate("Шоколад", "Бабаевский", 200, 200, 75);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(bottleOfMilk4);
        products.add(chocolate);
        products.add(chocolate1);
        products.add(chocolate2);

        VendingMachine machine = new VendingMachine(products);

        BottleOfMilk bottleOfMilkResult =  machine.getBottleOfMilk(3.5);
        if (bottleOfMilkResult != null){
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilkResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с молоком нет в автомате.");
        }

        Chocolate chocolateResult = machine.getChocolate(115);
        if(chocolateResult != null){
            System.out.println("Вы купили:");
            System.out.println(chocolateResult.displayInfo());
        }else System.out.println("Такого товара в автомате нет!");
    }

}
