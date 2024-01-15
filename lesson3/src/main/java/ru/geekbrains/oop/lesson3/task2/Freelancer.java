package ru.geekbrains.oop.lesson3.task2;


/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee{
    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public int calculateAge() {
        return age;
    }

    public Freelancer(String name, String surName, double salary, int age){
        super (name, surName, salary, age);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s; Фрилансер; Среднемесячная заработная плата: %.2f руб.",
                surName, name, calculateAge(), calculateSalary());
    }
}
