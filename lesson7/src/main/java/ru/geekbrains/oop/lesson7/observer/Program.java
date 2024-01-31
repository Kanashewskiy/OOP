package ru.geekbrains.oop.lesson7.observer;

public class Program {
    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher vacancy = new Vacancy();
        Company google = new Company("Google", vacancy, 120000);
        Company yandex = new Company("Yandex", vacancy, 95000);
        Company geekBrains = new Company("GeekBrains", vacancy, 98000);

        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Master master2 = new Master("Мастер #2");
        Midle midle = new Midle("Мидл #1");

        vacancy.registerObserver(student1);
        vacancy.registerObserver(master1);
        vacancy.registerObserver(master2);
        vacancy.registerObserver(midle);

        for (int i = 0; i < 3; i++){
            google.newVacancy();
            yandex.newVacancy();
            geekBrains.newVacancy();
        }

    }

}
