package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        int row;
        int colum;
        boolean check;
        System.out.println("Начнём создание матрицы");
        row = enterRows();
        colum = enterColums();

        if (checkSquare(row,colum)){
              creationMatrix(row,colum);
        }

    }

    //Ввод количества строк
    public static int enterRows () {
            int a;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество строк:");
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                if (a > 1){
                    return a;
                } else{
                    System.out.print("Вы ввели слишком маленькое значение должно быть больше 1, попробуйте ещё раз ");
                    return enterRows();
                }
            } else {
                System.out.print("Вы ввели некорректные данные,нужно целое число больше 1, давайте попробуем ещё раз ");
                return enterRows();
            }
        }
    //Ввод количества столбцов
    public static int enterColums () {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество столбцов:");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            if (a > 1){
                return a;
            } else{
                System.out.print("Вы ввели слишком маленькое значение должно быть больше 1, попробуйте ещё раз ");
                return enterColums();
            }
        } else {
            System.out.print("Вы ввели некорректные данные,нужно целое число больше 1, давайте попробуем ещё раз ");
            return enterColums();
        }
    }
//  Проверяем что матрица квадратная
    public static boolean checkSquare(int a, int b){
        if (a == b) {
            System.out.println("Матрица квадратная, можем продолжать");
            return true;
        } else {
            System.out.println("матрица не получится квадратной - нужно вводить всё сначала");
            a = enterRows();
            b = enterColums();
            return checkSquare(a,b);
        }
    }
//    Создаём матрицу
    public static void creationMatrix(int a, int b){
        double [][] originMatrix = new double[a][b];
        Random random = new Random();
        double borderLeft =-50.00;
        double borderRight = 50.00;
        for (int i = 0; i < originMatrix.length; i++){
            for (int j = 0; j < originMatrix[i].length; j++){
                originMatrix[i][j] = borderLeft + random.nextDouble() * (borderRight - borderLeft) ;
                System.out.printf("%.2f   ",  originMatrix[i][j]);
            }
            System.out.println();
        }

    }
//   Меняем местами диагонали
//    public static void changeDiagonals(){
//
//    }

}
