package org.example;

public class Task1 {
//    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    public int division(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Знаменатель не может быть 0");

        }
        return x / y;
    }

    public int searchNumberByIndex(int a, int[] array) throws ArrayIndexOutOfBoundsException {
        if (a >= array.length || a < 0) {
            throw new ArrayIndexOutOfBoundsException("Index " + a + " is out of bounds for array of length " + array.length);
        }
        return array[a];
    }

    public int castToInt(String a) throws NumberFormatException {
        if (!a.matches("^-?\\\\d+$")) {
            throw new NumberFormatException("String argument is not a valid integer: " + a);
        }
        return Integer.parseInt(a);
    }
}
