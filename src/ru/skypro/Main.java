package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // Задание №1
	    String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // Задание №2
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName1);

        // Задание №3
        fullName = "Иванов Семён Семёнович";
        String fullNameReplaced = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullNameReplaced);

    }
}
