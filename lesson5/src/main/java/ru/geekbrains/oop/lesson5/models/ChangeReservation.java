package ru.geekbrains.oop.lesson5.models;

import java.util.Date;

public class ChangeReservation {

    private static int counter = 1000;

    private int id;

    private Date reservationDate;

    private String name;

    private Table table;

    private int oldReservation;

    public ChangeReservation(int oldReservation, Table table, Date reservationDate, String name){
        //id = ++counter;
        this.oldReservation = oldReservation;
        this.table = table;
        this.reservationDate = reservationDate;
        this.name = name;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        ChangeReservation.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return reservationDate;
    }

    public void setDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public int getOldReservation() {
        return oldReservation;
    }

    public void setOldReservation(int oldReservation) {
        this.oldReservation = oldReservation;
    }
}
