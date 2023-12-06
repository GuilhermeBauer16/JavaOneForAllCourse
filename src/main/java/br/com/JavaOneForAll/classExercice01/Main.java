package br.com.JavaOneForAll.classExercice01;

public class Main {

    public static void main(String[] args) {
        System.out.println(("=").repeat(50) + "\n" + "Cars"+ "\n" + ("=").repeat(50));
        Car car01 = new Car();
        Car car02 = new Car();
        car01.setName("Honda");
        car01.setModel("Civic");
        car01.setYear(2021);

        car02.setName("FIAT");
        car02.setModel("Palio");
        car02.setYear(2023);

        System.out.printf("Name: %s , model: %s , year: %d", car01.getName(),
                car01.getModel(), car01.getYear());

        System.out.println();
        System.out.printf("Name: %s , model: %s , year: %d", car02.getName(),
                car02.getModel(), car02.getYear());
    }

}
