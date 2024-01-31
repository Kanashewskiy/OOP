package ru.geekbrains.oop.lesson7.observer;

import java.util.Random;

/**
 * Компания, которая нуждается в сотрудниках
 */
public class Company {

    private Random random = new Random();
    private Publisher vacancy;

    private String name;

    private int maxSalary;

    public Company(String name, Publisher vacancy, int maxSalary){
        this.vacancy = vacancy;
        this.name = name;
        this.maxSalary = maxSalary;
    }

    /*
    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary);
    }

     */

    public void newVacancy(){
        int salary = random.nextInt(maxSalary);
        vacancy.sendOffer(name, salary);
    }

}
