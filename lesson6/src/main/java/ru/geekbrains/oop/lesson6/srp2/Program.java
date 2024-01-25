package ru.geekbrains.oop.lesson6.srp2;

public class Program {

    public static void main(String[] args) {
        System.out.println("Укажите параметры заказа:");
        Order order = new Order();
        InputFromConsole inputFromConsole = new InputFromConsole(order);
        SaveToJson saveToJson = new SaveToJson(order);

    }
}
