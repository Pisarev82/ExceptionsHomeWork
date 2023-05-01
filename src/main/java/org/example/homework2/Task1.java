package org.example.homework2;

import java.util.Scanner;

public class Task1 {

    public void run () {
        float number = readFloatInput();
        System.out.println("reading float" + number);
    }

    /*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение.
    Ввод текста вместо числа не должно приводить к падению приложения,
    вместо этого, необходимо повторно запросить у пользователя ввод данных.*/
    private float readFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введите дробное число: ");
            String input = scanner.nextLine();

            if (input.matches("-?\\d+(\\.\\d+)?")) {
                number = Float.parseFloat(input);
                validInput = true;
            } else System.out.println("Неверный ввод. Пожалуйста, введите дробное число.");
//            try {
//                number = Float.parseFloat(input);
//                validInput = true;
//            } catch (NumberFormatException e) {
//                System.out.println("Неверный ввод. Пожалуйста, введите дробное число.");
//            }
        }

        return number;
    }


}
