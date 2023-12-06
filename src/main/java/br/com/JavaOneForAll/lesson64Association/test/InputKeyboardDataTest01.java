package br.com.JavaOneForAll.lesson64Association.test;

import java.util.Scanner;

public class InputKeyboardDataTest01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type your name: ");
        String name = scanner.nextLine();

        System.out.println("Please type your age: ");
        int age = scanner.nextInt();

        System.out.println("Please type M or F for your gender: ");
        char gender = scanner.next().charAt(0);
        System.out.println("------------");
        System.out.println("name: " + name);
        System.out.println("age: " +age);
        System.out.println("gender: " +gender);



    }
}
