package ru.geekbrains.oop.lesson3.task2;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

    public int compare(Employee o1, Employee o2){
        return Double.compare(o1.calculateAge(), o2.calculateAge());
    }
}
