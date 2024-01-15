package ru.geekbrains.oop.lesson3.task2;

public class ShowArrays {

    public static Employee[] Show(Employee[] employees){
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("***");
        System.out.println();
        return employees;
    }
}
