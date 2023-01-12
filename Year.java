import java.util.Scanner;


/*
1. создать и запустить сканнер
2. сохранить введенное значение в переменную
3. проверить на деление на 4 с остатком
4. вывести ответ на экран

 */
public class Year {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int year = console.nextInt();
        if (year % 4 == 0) {
            System.out.println("високосный год");
        }
        else {
            System.out.println("не високосный год");
        }
    }
}
