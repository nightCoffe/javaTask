
/*
Напишите программу, выводящую на экран таблицу умножения в виде 3 х 3.
В первой строке должны отображаться таблицы умножения на 1, на 2 и на 3
Во второй строке должны отображаться таблицы умножения на 4, на 5 и на 6
В третьей строке должны отображаться таблицы умножения на 7, на 8 и на 9

 */


public class MultiplicationTableFor {
    public static void main(String[] args) {
        int firstValue = 1;
        int secondValue = 1;
        int count = 1;
        for (int k = 1; k < 4; k++) {
            for (secondValue = 1; secondValue <= 10; secondValue++) {
                switch (k) {
                    case (1):
                        firstValue = 1;
                        count = 3;
                        break;
                    case (2):
                        firstValue = 4;
                        count = 6;
                        break;
                    case (3):
                        firstValue = 7;
                        count = 9;
                        break;
                }
                for (; firstValue <= count; firstValue++) {
                    System.out.print(firstValue + " * " + secondValue + " = " + secondValue * firstValue + "   ");
                }
                System.out.println();
            }
            System.out.println(" ");
        }
    }
}
