/*
Напишите программу, выводящую на экран таблицу умножения в виде 3 х 3.
В первой строке должны отображаться таблицы умножения на 1, на 2 и на 3
Во второй строке должны отображаться таблицы умножения на 4, на 5 и на 6
В третьей строке должны отображаться таблицы умножения на 7, на 8 и на 9


 */


public class MultiplicationTable {
    public static void main(String[] args) {
        int firstValue = 1;
        int secondValue = 1;
        int stopValue = 1;
        int count = 1;
        while (count < 4) {
            secondValue = 1;
            while (secondValue <= 10) {
                switch (count) {
                    case (1):
                        firstValue = 1;
                        stopValue = 3;
                        break;
                    case (2):
                        firstValue = 4;
                        stopValue = 6;
                        break;
                    case (3):
                        firstValue = 7;
                        stopValue = 9;
                        break;
                }
                while (firstValue <= stopValue) {
                    System.out.print(firstValue + " * " + secondValue + " = " + secondValue * firstValue + "   ");
                    firstValue++;
                }
                System.out.println();
                secondValue++;
            }
            System.out.println(" ");
            count++;
        }
    }
}

