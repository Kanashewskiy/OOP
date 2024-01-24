package ru.geekbrains.oop.lesson5;

import ru.geekbrains.oop.lesson5.models.TableService;
import ru.geekbrains.oop.lesson5.presenters.BookingPresenter;
import ru.geekbrains.oop.lesson5.presenters.Model;
import ru.geekbrains.oop.lesson5.views.BookingView;

import java.util.Date;

public class Program {


    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Model model = new TableService();
        BookingView view = new BookingView();

        BookingPresenter presenter = new BookingPresenter(view, model);
        presenter.updateTablesView();

        view.reservationTable(new Date(), 1, "Станислав");//1001
        view.reservationTable(new Date(), 2, "Станислав");//1002
        view.reservationTable(new Date(), 3, "Станислав");//1003
        view.reservationTable(new Date(), 4, "Станислав");//1004
        view.reservationTable(new Date(), 5, "Станислав");//1005

        view.changeReservationTable(1004, new Date(), 4, "Станислав");

    }

}
