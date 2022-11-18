package com.company;

import java.util.Scanner;


public class GuessTheNumberPull {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Ваша задача удагать число. Выберите уровень сложности\n1. Легкий\n2. Средний\n3. Сложный");
        int operation = scanner.nextInt();
        int range;
        switch (operation) {
            case 1:
                range = 10;
                break;
            case 2:
                range = 50;
                break;
            case 3:
                range = 100;
                break;
            default:
                throw new Exception("Введите правильный уровень сложности");
        }
        PlayLevel(range);
    }

    private static void PlayLevel(int range) {
        int number = (int) (Math.random() * range);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int inputNumber = scanner.nextInt();
            if (inputNumber == number) {
                System.out.println("Вы угадали число");
                break;
            } else if (inputNumber > number) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
        System.out.println("Вы выиграли");
        scanner.close();
    }
}
