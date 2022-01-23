package com.company.classesHomework5;

import com.company.classesHomework5.Box;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Начнём создание коробок");
        Scanner input = new Scanner(System.in);
        Box box = new Box(input.next(), input.nextInt(),input.nextInt(),input.nextInt());
        System.out.println("Объём коробки " + box.getName()+ " = "+ box.getVolume());
        Box box2 = new Box(input.next(), input.nextInt(),input.nextInt(),input.nextInt());
        System.out.println("Объём коробки " + box2.getName()+ " = "+ box.getVolume());
        Box box3 = new Box(input.next(), input.nextInt(),input.nextInt(),input.nextInt());
        System.out.println("Объём коробки " + box3.getName()+ " = "+ box.getVolume());
        Box box4 = new Box(input.next(), input.nextInt(),input.nextInt(),input.nextInt());
        System.out.println("Объём коробки " + box4.getName()+ " = "+ box.getVolume());
        Box box5 = new Box(input.next(), input.nextInt(),input.nextInt(),input.nextInt());
        System.out.println("Объём коробки " + box5.getName()+ " = "+ box.getVolume());
    }
}
