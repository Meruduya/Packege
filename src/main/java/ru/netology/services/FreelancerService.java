package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {

        int counter = 0; // счётчик месяцев отдыха
        int wallet = 0; // количество денег на счету
        for (int i = 0; i < 12; i++) {
            if (wallet >= threshold) {
                //отдыхаем
               wallet -= expenses;
               wallet /= 3;
               counter++;
            } else {
                // работаем
//               wallet = wallet + income; тоже самое что и 13 строка
               wallet += income;
               wallet -= expenses;
            }
        }
        return counter;
    }
}