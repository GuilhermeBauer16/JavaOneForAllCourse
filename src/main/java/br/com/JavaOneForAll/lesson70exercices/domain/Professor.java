package br.com.JavaOneForAll.lesson70exercices.domain;

public class Professor {

    private String name;
    private String researchField;

    private Seminar[] seminars;

    public Professor(String name, String researchField) {
        this.name = name;
        this.researchField = researchField;
    }

    public Professor(String name, String researchField, Seminar[] seminars) {
        this.name = name;
        this.researchField = researchField;
        this.seminars = seminars;
    }

    public void print() {

        System.out.println("name: " + this.name);
        System.out.println("researchField: " + this.researchField);

        if (seminars == null || seminars.length == 0) {
            System.out.println("This professor don't have seminars");
            return;
        }
        for (Seminar seminar : seminars) {
            System.out.println("Seminar: ");
            seminar.print();

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
