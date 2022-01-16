package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Задание 1
        int[] payment = generateRandomArray();
        int sum1 = 0; //why sum is 0 and for what
        for (int i = 0; i < payment.length; i++) {
            sum1 += payment[i];
            System.out.println("sum of expenses for month is " + sum1);
        }

        //Задание 2
        int[] salary = generateRandomArray();
        int max = 0;
        int min = 1;
        for (int ii = 0; ii < salary.length; ii++) {
            if (max < salary[ii]) {
                max = salary[ii];
            }
            if (min < salary[ii]); //how to know min and max
        }
        System.out.println(max);

        //Задание 3
        int[] expenses = generateRandomArray();
        float sum = 0;
        for (int a = 0; a < expenses.length; a++) {
            sum = sum + expenses[a]; //why?
            float mid = sum / expenses.length;
            System.out.println("Middle expenses sum for month is " + mid);
        }

        //Задание 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int b = reverseFullName.length-1; b >= 0 ; b--) {
            System.out.print(reverseFullName[b]);
        }

    }
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
