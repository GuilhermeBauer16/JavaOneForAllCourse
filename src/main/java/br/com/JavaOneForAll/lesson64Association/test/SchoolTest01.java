package br.com.JavaOneForAll.lesson64Association.test;

import br.com.JavaOneForAll.lesson64Association.domain.Professor;
import br.com.JavaOneForAll.lesson64Association.domain.School;

public class SchoolTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Jiraya");
        Professor professor02 = new Professor("Jiraya");
        Professor[] professors = {professor01,professor02};
        School school = new School("Konoha", professors);

        school.print();
    }
}
