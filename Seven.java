/*
Напишите программу, выводящую на экран таблицу умножения на 7, в виде списка.
7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
7 * 4 = 28
7 * 5 = 35
7 * 6 = 42
7 * 7 = 49
7 * 8 = 56
7 * 9 = 63
7 * 10 = 70

создать переменную равную 1
создать цикл вайл с условием что переменная должна быть меньше 11 строго
вывести на экран
 */

public class Seven {
    public static void main(String[] args) {
        int number = 1;
        while (number < 11) {
            System.out.println(7 + " * " + number + " = " + 7 * number);
            number++;
        }
    }
}
