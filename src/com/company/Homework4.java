package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("Начнём создание матрицы");
          if (checkSquare(enterRows(),enterColums())){

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

}
