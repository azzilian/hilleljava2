package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        int row = 1;
        int colum = 0;
        boolean check;
        System.out.println("Начнём создание матрицы");
        row = enterRows();
        colum = enterColums();

        while (!checkSquare(row,colum)){
            row = enterRows();
            colum = enterColums();
        }
        changeDiagonals(creationMatrix(row,colum),row,colum);
//        if (checkSquare(row,colum)){
//
//              changeDiagonals(creationMatrix(row,colum),row,colum);
//        }

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
//            a = enterRows();
//            b = enterColums();
            return false;//checkSquare(a,b);
        }
    }
//    Создаём матрицу
    public static double[][] creationMatrix(int a, int b){
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
        return originMatrix;

    }
//   Меняем местами диагонали
    public static void changeDiagonals(double[][] originalMatrix,int a,int b){ //в принципе можно было и только 1 раз а передать, проверку то уже сделали, но я всё равно оставил так как благодаря этому нашел баг в проверке
        System.out.println("а теперь меням местами диагонали");
        double [][] newMatrix = new double[a][b];
        double [][] saveMatrix = new double[a][b];
        for (int i = 0 ; i < originalMatrix.length; i++){
            for (int j = 0; j < originalMatrix[i].length; j++){
                saveMatrix[i][j] = originalMatrix[i][j];
                newMatrix[i][j] = originalMatrix[i][originalMatrix.length-1-j];
                newMatrix[i][originalMatrix[i].length-1-j] = originalMatrix[i][j];

            }
        }
        for (int i = 0 ; i < originalMatrix.length; i++){
            for (int j = 0; j < originalMatrix[i].length; j++) {
                System.out.printf("%.2f   ", newMatrix[i][j]);
            }
            System.out.println();
        }

    }

}
