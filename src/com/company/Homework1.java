package com.company;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
	    double bodyMassIndex; //Индекс массы тела

        Scanner scanner = new Scanner(System.in) ;

        System.out.print("Введите пожалуйста ваш вес в килограммах:  ");
        int bodyMass = scanner.nextInt(); //масса тела

        System.out.print("Введите пожалуйста ваш рост в см:  ");
        float height = scanner.nextInt(); //рост в см.

        height *= (double) height/10000; // берем квадрат высоты + сразу преабразуем его в квадратные метры по принципу 1 м^2 = 10000 см^2 - double сделать просто попробовать преобразовать типы при составной операции
        System.out.println("Проверка квадрата высоты = " + height + " м²"); //я не успел разобраться как в идее делать отладку, можете, пожалуйста, хотя бы в паре слов на лекции рассказать?

        bodyMassIndex = bodyMass / height;
        System.out.println("Ваш Индекс массы тела =  " + bodyMassIndex + " кг/м²"); //с метром в квадрате схалтурил - просто скопировал, но отсюда родился вопрос можно ли как-то отображать в виде степени прямо в System.out?
        //Чтобы не забыл вопрос на лекцию, проверил деление на "0" - выдало Infinity в результате - вопрос, а давно ли вместо ошибки выполнения, выдаёт результат Infinity?


    }
}
