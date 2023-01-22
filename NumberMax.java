/*
Напишите программу, которая находит наибольшую среди цифр введенного целого положительного числа.

создать сканнер
создать переменную где будет храниться введенное число
создать переменную с самым минимальным числом
создать цикл фор с условием что введенное число должно быть больше нуля
откинуть последнее число
создать условие что если это число больше минимального то присвоить это значение переменной с минимальным числом
если нет то число подельнить на 10
вывести результат на экран

 */

import java.util.Scanner;
public class NumberMax {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int maxDigit = Integer.MIN_VALUE;
        for (int i = 0; number > 0 ; i++) {
            int digit = number % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            } else {
                number = number / 10;
            }
        }
        System.out.println(maxDigit);
    }
}
