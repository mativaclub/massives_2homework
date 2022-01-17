package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Задание 1
        System.out.println("Задание 1");

        int[] payments = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum = sum + payments[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();
        //Задание 2
        System.out.println("Задание 2");

        int[] expenses = generateRandomArray();
        int min = expenses[0];
        int max = expenses[0];
        for (int i = 0; i < expenses.length; i++) {
            if(expenses[i] < min ) {
                min = expenses[i];
            }
            if (expenses[i] > max) {
                max = expenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

        System.out.println();
        //Задание 3
        System.out.println("Задание 3");

        int [] monthSum = generateRandomArray();
        float sum1 = 0;
        for (int i = 0; i < monthSum.length; i++) {
            sum += monthSum[i];
        }
        float average = sum / (float)monthSum.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println();
        //Задание 4
        System.out.println("Задание 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        System.out.println();
        //Задание 5
        System.out.println("Задание 5");

        int [][] array2D = new int [5][10];
          for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = 1;
            }
        }
       for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
    }
            System.out.println();
       }
        System.out.println("Задание 5 version 2");
        int [][] matrix = new int [5][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 1;
                matrix[i][matrix.length - 1 - i] = 1;
            }
        }
        for (int[] row : matrix) {
        	for (int column : row) {
        		System.out.print(column + " ");
        	}
        	System.out.println();
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
