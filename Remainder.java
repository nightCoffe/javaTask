import java.util.Scanner;


/*
1. создать и запустить сканнер
2. сохранить введенные значения в переменные
3. сохранить в переменную деление с остатком первого числа на второе
4. проверить результат деления на деление с остатком
5. вывести ответ на экран

 */
public class Remainder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int numberDel = console.nextInt();
        int result = number % numberDel;
        if (result == 0) {
            System.out.println("Можно разделить " + number + " на " + numberDel + " без остатка.");
        } else {
            System.out.println("Нельзя разделить " + number + " на " + numberDel + " без остатка. Остаток равен " + result);
        }
    }
}
