package app;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, -8, 49, 80, 34, -92, 23, -15, 64, 22, -74, -29, -40, 55, -3, 61, 79, 43, 46, 19};
        System.out.println("Елемент масиву: " + Arrays.toString(numbers));
         int sum = 0;
         int evenCount = 0;
         int oddCount = 0;
         int max = numbers[0];
         int min = numbers[0];
         boolean foundNegative = false;
         int sumAfterNegative = 0;
         int countAfterNegative = 0;

         for (int number : numbers){
             if (number < 0){
                 sum += number;
             }
             if (!foundNegative) {
                 foundNegative = true;
             }
             if (number % 2 == 0){
                 evenCount++;
             } else {
                 oddCount++;
             }
             if (number > max){
                 max = number;
             }
             if (number < min){
                 min = number;
             }
             if (number >= 0){
                 sumAfterNegative += number;
                 countAfterNegative++;
             }
         }

        double averageAfterNegative = countAfterNegative > 0
         ? (double) sumAfterNegative / countAfterNegative
         : 0;

        System.out.println("Сума від'ємних чисел: " + sum + "\nКількість парних чисел: " +
                evenCount + "\nКількість непарних чисел: " + oddCount + "\nНайменший елемент: " +
                min + "\nНайбільший елемент: " + max);
        if (countAfterNegative > 0){
            System.out.println("Середнє арифметичне чисел після першого від'ємного: " + averageAfterNegative);
        } else {
            System.out.println("Чисел після першого від'ємного немає.");
        }

    }


}
