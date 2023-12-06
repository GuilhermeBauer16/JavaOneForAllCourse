package br.com.JavaOneForAll.lesson70exercices.test;

import br.com.JavaOneForAll.lesson70exercices.domain.Place;
import br.com.JavaOneForAll.lesson70exercices.domain.Professor;
import br.com.JavaOneForAll.lesson70exercices.domain.Seminar;
import br.com.JavaOneForAll.lesson70exercices.domain.Student;

public class SeminarTest01 {

    public static void main(String[] args) {
        Place place01 = new Place("São Paulo");
        Place place02 = new Place("Minas Gerais");

        Student student01 = new Student("Guilherme", 21);
        Student student02 = new Student("Pedro", 30);
        Student[] students = {student01};
        Student[] allStudents = {student01,student02};

        Seminar seminar01 = new Seminar("About IA" , place01 , allStudents);
        Seminar seminar02 = new Seminar("About Java", place02 , students);
        Seminar[] allSeminars = {seminar01 , seminar02};
        Seminar[] seminars = {seminar01};

        Professor professor01 = new Professor("Ana", "English" , allSeminars);
        Professor professor02 = new Professor("John", "Biology" , seminars);

        System.out.println("--------");
        student01.print();
        System.out.println("--------");
        student02.print();
        System.out.println("--------");
        professor01.print();
        System.out.println("--------");
        professor02.print();
        System.out.println("--------");
        seminar01.print();
        System.out.println("--------");
        seminar02.print();
    }
}
