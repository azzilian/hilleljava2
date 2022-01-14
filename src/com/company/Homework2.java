package com.company;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку: ");
        int score;

        if (scanner.hasNextInt()){
            score = scanner.nextInt();
            if (score<=0){
                System.out.println("Неправильный ввод - Слишком низкая оценка - оценкой может быть цифра от 1 до 12");
            } else if (score>12){
                System.out.println("Неправильный ввод - Слишком высокая оценка - оценкой может быть цифра от 1 до 12");
            } else if (score>=1 && score<=12)       {
                System.out.println (switch (score) {
                    case 1,2,3 ->"Это 2";
                    case 4,5,6 ->"Это 3";
                    case 7,8,9 ->"Это 4";
                    case 10,11,12 ->"Это 5";
                    default ->"Нет такой оценки";
                });
            }
        } else {
            System.out.println("Некорректные ввод данных, спробуй ще");
        }//а вообще можно ли проверить напрямую, что переменная является строкой или к примеру проверять её тип там - double или float?




    }
}
