package org.example;

public class Task2 {
    /* В данном коде я вижу 3 слабых места
    * Массив должен быть строго из строк из 5 элементов Если меньше возникнет исключение, если больше решение будет некорректным
    * Строки в массиве должны быть корректными
    * Строки в массивы должны БЫТЬ (не NULL)
    *   */
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) { // ArrayIndexOutOfBoundsException если в строке массива менее 5 элементов
                int val = Integer.parseInt(arr[i][j]);
                /*  NumberFormatException если в элеменом массива будут включать любие символы кроме чисел
                * NullPointerException если в массиве будут null элементы
                * */
                sum += val;
            }
        }
        return sum;
    }


}
