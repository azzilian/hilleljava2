package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        int masLenght = 0;
        boolean enterExit = false;
//      Задаём длину массива + защита от кривых рук
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дилину массива");
        do {

            if (scanner.hasNextInt()){
                masLenght = scanner.nextInt();
                if ((masLenght > 0) && (masLenght <= 100 )) {
                enterExit = true;} else {
                System.out.println("Упс, нужно ввести целое число от 1 до 100, попробуй ещё раз:"); //вот тут странный момент иногда возникает - дублируется сообщение если вводить некорректные данные, но не всегда, не пойму в чем дело
                }
               } else {
                System.out.println("Упс, нужно ввести целое число от 1 до 100, попробуй ещё раз");
                scanner.nextLine();
                }
        } while (!enterExit);
        scanner.close();
        double [] numbers = new double[masLenght];
        Random random = new Random();
        double a =-50.00;
        double b = 50.00;
//      Заполняем массив
        System.out.println("Наш масив выглядит так");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = a + random.nextDouble() * (b - a) ;
            System.out.printf("%.2f   ",  numbers[i]);
        }

//      Минимальное число
        double minNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        System.out.printf("%nМинимальный элемент массива = %.2f", minNumber);

//      Максимальное число
        double maxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        System.out.printf("%nМинимальный элемент массива = %.2f", maxNumber);

//      Средние арифметическое
        double midSum = 0;
        for (int i = 0; i < numbers.length; i++){
            midSum = midSum + numbers[i];
        }
        double averege = midSum/masLenght;
        System.out.printf("%nСреднее арифметическое = %.2f", averege);

    }

}
