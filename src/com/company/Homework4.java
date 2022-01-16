package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        int matrixSize = 0;
        boolean enterExit = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Размер матрицы: ");
        do {

            if (scanner.hasNextInt()){
                matrixSize = scanner.nextInt();
                if (matrixSize > 0) {
                    enterExit = true;} else {
                    System.out.println("Нужно ввести целое число больше 0"); //вот тут странный момент иногда возникает - дублируется сообщение если вводить некорректные данные, но не всегда, не пойму в чем дело
                }
            } else {
                System.out.println("Нужно ввести целое число больше 0");
                scanner.nextLine();
            }
        } while (!enterExit);
        scanner.close();

        double [][] squareMatrix = new double[matrixSize][matrixSize];
        Random random = new Random();
        double a =-50.00;
        double b = 50.00;
//      Заполняем массив
        System.out.println("Наша матрица выглядит так");
        for (int i = 0; i < squareMatrix.length; i++){
            for (int j = 0; j< squareMatrix[i].length; j++){
                squareMatrix[i][j] = a + random.nextDouble() * (b - a);
            System.out.printf("%.2f   ",squareMatrix[i][j]);
            }
            System.out.println();

        }
        //Создание матрицы

        //Выводим матрицу на экран

        //Меняем местами элементы
        //Выводим новую матрицу на экран

    }
    public static void creationMatrix (String[] args){

    }
}
