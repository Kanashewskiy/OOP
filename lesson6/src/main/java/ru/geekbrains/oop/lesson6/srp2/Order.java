package ru.geekbrains.oop.lesson6.srp2;

public class Order {

    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order() {
    }

    public String getClientName() {
        return clientName;
    }

    public Order setClientName(String clientName) {
        this.clientName = clientName;
        return null;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
