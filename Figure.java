import java.util.Scanner;




/*
понадобится еще одно значение для определения длинны стороны или радиуса, можно конечно дефолтное значение задать, пи = 3,14, корень из 3 = 1,7

1. создать и запустить сканнер
2. сохранить введенное значение выбора фигуры в одну переменную, во вторую длинну стороны или радиуса
 1 - треугольник, 2 - круг, 3 - квадрат
3. если треугольник провести расчет по формуле 1.7 / 4 * secondNum * secondNum
если круг - secondNum * secondNum * 3.14
если квадрат -
4. вывести ответ на экран secondNum * secondNum

 */

public class Figure {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNum = console.nextInt();
        int secondNum = console.nextInt();
        if (firstNum == 1) {
            System.out.println(1.7 / 4 * secondNum * secondNum);
        }
        else if (firstNum == 2){
            System.out.println(secondNum * secondNum * 3.14);
        }
        else if (firstNum == 3){
            System.out.println(secondNum * secondNum);
        }
    }
}
