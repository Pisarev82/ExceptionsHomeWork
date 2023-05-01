package org.example.homework2;

public class Task2 {
    /*Если необходимо, исправьте данный код
        try {
           int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
            } catch (ArithmeticException e) {
                System.out.println("Catching exception: " + e);
            }
     */
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    public void run () {
        modified(arr, 0);
    }

    private void modified (int[] intArray, int d) {
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } finally {
            System.out.println("Не упал");
        }
    }
}
