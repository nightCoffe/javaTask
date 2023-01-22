/*
создать сканнер
создать переменную с начальным число диапазона
создать переменную с конечным числом диапазона
создать цикл фор с условием:
    счетчику присвоить значение стартового числа диапазона
    сравнения с конечным числом диапазона
    увеличить счетчик на единицу
создать условие проверки на четность
вывод на экран
 */

import java.util.Scanner;

public class RangeFor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNum = console.nextInt();
        int secondNum = console.nextInt();
        for (int i = firstNum; i <= secondNum; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
