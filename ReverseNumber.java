/*
Напишите программу, которая преобразует введенное с клавиатуры число? чтобы его цифры следовали в обратном порядке
по сравнению с введенным числом. Без преобразований в другие типы.

создать сканнер
создать переменную куда будем сохранять перевернутое число
создачть цикл с условием что введенное число больше нуля
создать временную переменную где будем хранить последнее число от введенного
в переменную где храним перевернутое число сохраняем временную переменную и увеличиваем значие на разряд
от введенного числа откидываем послее число
вывести на экран значение
 */


import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int reversed = 0;
        for (; number > 0; ) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        System.out.println(reversed);
    }
}
