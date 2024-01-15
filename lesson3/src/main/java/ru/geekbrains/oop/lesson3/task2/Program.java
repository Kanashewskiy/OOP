package ru.geekbrains.oop.lesson3.task2;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Employee[] employees = EmployeeFabric.generateEmployees(10);
        ShowArrays.Show(employees);
        Arrays.sort(employees);
        ShowArrays.Show(employees);
        Arrays.sort(employees, new SalaryComparator());
        ShowArrays.Show(employees);
        Arrays.sort(employees, new AgeComparator());
        ShowArrays.Show(employees);
    }

}
