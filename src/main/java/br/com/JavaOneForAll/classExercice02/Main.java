package br.com.JavaOneForAll.classExercice02;

public class Main {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.newStudent();
        student01.showStudent();
        System.out.println(("=".repeat(50)));
        student02.newStudent();
        student02.showStudent();
    }
}
