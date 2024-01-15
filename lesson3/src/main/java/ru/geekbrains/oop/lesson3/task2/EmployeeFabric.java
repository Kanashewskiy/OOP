package ru.geekbrains.oop.lesson3.task2;
import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();
    public static Worker generateWorker() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов" };
        int salary = random.nextInt(60000, 120001);
        int age = random.nextInt(18,65);
        return new Worker(
                names[random.nextInt(names.length)],
                surnames[random.nextInt(surnames.length)],
                salary,
                age);
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param
     * @return
     */

    public static Freelancer generateFreelancer(){
        String[] names = new String[] {"Ксения", "Егор", "Артемий", "Виктория", "Николай", "Михаил", "Тимофей", "Сергей",
                "Елена", "Анна"};
        String[] surNames = new String[] {"Магистр", "Летов", "Капитал", "Шпроттер", "Килька", "Каменец", "Лыткин",
                "Патрашку", "Бумага", "Офис"};
        int salary = 20 * 8 * 750; // 20 дней в месяц, 8 часов в день, 750 руб. в час
        int age = random.nextInt(18, 65);
        return new Freelancer(
                names[random.nextInt(names.length)],
                surNames[random.nextInt(surNames.length)],
                salary,
                age);
    }

    public static Trainee generateTrainee(){
        String[] names = new String[] {"Ксения", "Егор", "Артемий", "Виктория", "Николай", "Михаил", "Тимофей", "Сергей",
                "Елена", "Анна"};
        String[] surNames = new String[] {"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов"};
        int salary = 20 * 8 * 3;
        int age = random.nextInt(18, 65);
        return new Trainee(
                names[random.nextInt(names.length)],
                surNames[random.nextInt(surNames.length)],
                salary,
                age);
    }

    public static Employee[] generateEmployees(int count){
        Employee[] employees = new Employee[count];
        for(int i = 0; i < count; i++) {
            if(i % 3 == 0){
                employees[i] = generateFreelancer();
            }else if(i % 5 == 0){
                employees[i] = generateTrainee();
            }else{
                employees[i] = generateWorker();
            }
        }
        return employees;
    }
}
