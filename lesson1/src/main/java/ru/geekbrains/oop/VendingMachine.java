package ru.geekbrains.oop;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfMilk getBottleOfMilk(double volume){
        for (Product product : products){
            if (product instanceof BottleOfMilk){
                BottleOfMilk milk = (BottleOfMilk)product;
                if (milk.getVolume() == volume)
                    return milk;
            }
        }
        return null;
    }

    public Chocolate getChocolate(double weight){
        for(Product product: products){
            if(product instanceof Chocolate){
                Chocolate choco = (Chocolate)product;
                if(choco.getWeight() == weight) return choco;
            }
        }
        return null;
    }


}
