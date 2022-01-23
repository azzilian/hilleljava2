package com.company.classesHomework5;

import com.company.classesHomework5.Box;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Начнём создание коробок");

        Box box = new Box(enterName (), enterLength (), enterWidth (),enterHeight ());
        System.out.println("Объём коробки " + box.getName()+ " = "+ box.getVolume());
        Box box2 = new Box(enterName (), enterLength (), enterWidth (),enterHeight ());
        System.out.println("Объём коробки " + box2.getName()+ " = "+ box.getVolume());
        Box box3 = new Box(enterName (), enterLength (), enterWidth (),enterHeight ());
        System.out.println("Объём коробки " + box3.getName()+ " = "+ box.getVolume());
        Box box4 = new Box(enterName (), enterLength (), enterWidth (),enterHeight ());
        System.out.println("Объём коробки " + box4.getName()+ " = "+ box.getVolume());
        Box box5 = new Box(enterName (), enterLength (), enterWidth (),enterHeight ());
        System.out.println("Объём коробки " + box5.getName()+ " = "+ box.getVolume());
    }
//    небольшие проверки
    public static int enterLength () {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину коробки:");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            if (a > 1){
                return a;
            } else{
                System.out.print("Вы ввели слишком маленькое значение должно быть больше 1, попробуйте ещё раз ");
                return enterLength();
            }
        } else {
            System.out.print("Вы ввели некорректные данные,нужно целое число больше 1, давайте попробуем ещё раз ");
            return enterLength();
        }
    }
    public static int enterWidth () {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ширину коробки:");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            if (a > 1){
                return a;
            } else{
                System.out.print("Вы ввели слишком маленькое значение должно быть больше 1, попробуйте ещё раз ");
                return enterWidth ();
            }
        } else {
            System.out.print("Вы ввели некорректные данные,нужно целое число больше 1, давайте попробуем ещё раз ");
            return enterWidth ();
        }
    }
    public static int enterHeight () {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту коробки:");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            if (a > 1){
                return a;
            } else{
                System.out.print("Вы ввели слишком маленькое значение должно быть больше 1, попробуйте ещё раз ");
                return enterHeight ();
            }
        } else {
            System.out.print("Вы ввели некорректные данные,нужно целое число больше 1, давайте попробуем ещё раз ");
            return enterHeight ();
        }
    }
    public static String enterName () {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название коробки:");
        if (scanner.hasNext()) {
            return scanner.next();
            } else {
                System.out.print("Вы ввели недопустимое имя, попробуйте ещё раз ");//не уверен, что можно вообще ввести что-то не то в стринг, но защита от дурака должна быть всегда)
                return enterName ();
            }
    }
}
