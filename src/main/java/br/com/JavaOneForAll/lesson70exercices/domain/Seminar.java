package br.com.JavaOneForAll.lesson70exercices.domain;

public class Seminar {
    private String title;

    private Place place;

    private Student[] students;

    public Seminar(String title) {
        this.title = title;

    }

    public Seminar(String title, Place place, Student[] students) {
        this.title = title;
        this.place = place;
        this.students = students;
    }

    public void print() {
        System.out.println("title: " + this.title);
        place.print();

        if (students == null || students.length == 0 ) {
            System.out.println("That seminar don't have students");
            return;
        }
        for (Student student : students) {
            System.out.println("Student:");
            student.print();
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
