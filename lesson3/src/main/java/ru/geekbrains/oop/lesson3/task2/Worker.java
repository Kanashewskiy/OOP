package ru.geekbrains.oop.lesson3.task2;

/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee {

    @Override
    public int calculateAge() {
        return age;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    public Worker(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s; Рабочий; Среднемесячная заработная плата: %.2f руб.",
                surName, name, calculateAge(), calculateSalary());
    }
}
