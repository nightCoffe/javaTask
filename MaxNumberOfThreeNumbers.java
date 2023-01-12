import java.util.Scanner;

/* Определить какое из трех введенных пользователем чисел максимальное и вывести его на экран.
тут стоит добавить уточнение, что одинаковых чисел не будет
1. создать и запустить сканнер
2. сохранить введенные значения в переменные
3. сравнить переменные между собой
4. вывести максимальное число на экран
5. добавить интерактивность
 */
public class MaxNumberOfThreeNumbers {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);
        System.out.println("Input first number");
        int first = console.nextInt();
        System.out.println("Input second number");
        int second = console.nextInt();
        System.out.println("Input three number");
        int three = console.nextInt();

        if (first > second && first > three) {
            System.out.println("The largest number = " + first);
        } else if (second > first && second > three) {
            System.out.println("The largest number = " + second);
        } else if (three > first && three > second) {
            System.out.println("The largest number = " + three);
        }
    }
}
