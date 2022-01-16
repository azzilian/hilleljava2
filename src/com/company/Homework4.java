package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("Начнём создание матрицы");
        System.out.println("Строк " + enterRows());
        System.out.println("Столбцов " + enterColums());


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


}
