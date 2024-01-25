package ru.geekbrains.oop.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToJson {

    public SaveToJson(Order order){
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("{");
            writer.write("\"Имя клиента\":\" "+ order.getClientName() + "\",");
            writer.write("\"Наименование продукта\":\" "+ order.getProduct() +"\",");
            writer.write("\"Количество \":"+ order.getQnt() +",");
            writer.write("\"Цена \":"+ order.getPrice());
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
