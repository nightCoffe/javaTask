/*
Напишите программу, которая находит сумму цифр введенного целого числа.

создать сканнер
создать переменную где будет храниться введенное число
создать переменную где будет храниться сумма чисел
создать цикл фор с условием что введенное число должно быть больше нуля
откинуть последнее число и добавить его в сумму
удалить последнее число
вывести результат на экран

 */


import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int sum = 0;
        for (; number > 0;) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
