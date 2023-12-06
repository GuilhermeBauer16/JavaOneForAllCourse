package br.com.JavaOneForAll.classExercice02;

public class Student {

    private String name;
    private int age;
    private String gender;
    private CreateParameter createParameter = new CreateParameter();

    public void newStudent() {

        this.name = createParameter.createString("Name: ");
        this.age = createParameter.createInt("Age: ");
        this.gender = createParameter.createString("Gender: ");

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;

    }

    public String getGender() {
        return gender;
    }

    public void showStudent() {

        System.out.println("name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());

    }
}
