package ru.geekbrains.oop.lesson3.task2;

public class Trainee extends Employee{
    public Trainee(String name, String surName, double salary, int age){
        super(name, surName, salary, age);
    }

    @Override
    public int calculateAge() {
        return age;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s; Стажёр; Среднемесячная заработная плата: %.2f килограмм печенья.",
                surName, name, calculateAge(), calculateSalary());
    }
}
