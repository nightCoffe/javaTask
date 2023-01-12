import java.util.Scanner;


/*
1. создать и запустить сканнер
2. сохранить введенные значения трех сторон в переменные
3. сравнить сумму двух сторон с третье стороной
4. вывести ответ на экран

 */
public class Triangle {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstSide = console.nextInt();
        int secondSide = console.nextInt();
        int thirdSide = console.nextInt();
        if ((firstSide + secondSide > thirdSide) && (firstSide + thirdSide > secondSide) && (secondSide + thirdSide > firstSide)) {
            System.out.println("Можно составить треугольник");
        }
        else {
            System.out.println("Нельзя составить треугольник");
        }
    }
}
