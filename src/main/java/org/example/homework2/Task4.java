package org.example.homework2;

import java.util.Scanner;

public class Task4 {
    public void run() {
        /*
        * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
        * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
        */
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите непустую строку: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                throw new Exception("Пустой ввод не разрешен.");
            }

            System.out.println("Вы ввели: " + input);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            scanner.close();
        }
    }
}

