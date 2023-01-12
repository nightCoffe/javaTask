import java.util.Scanner;

/*
1. создать и запустить сканнер
2. сохранить введенное значение в переменную
3. проверить на четность
4. вывести ответ на экран

 */
public class Honest {
    public void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        if (number % 2 == 0) {
            System.out.println("четное число");
        } else {
            System.out.println("нечетное число ");
        }
    }
}

