package br.com.JavaOneForAll.lesson161Collections.test;

import br.com.JavaOneForAll.lesson161Collections.domain.Smartphone;

public class EqualsTest01 {

    public static void main(String[] args) {
        String name = "Guilherme Bauer";
        String name2 = new String("Guilherme Bauer");
        System.out.println(name.equals(name2));

        Smartphone smartphone1 = new Smartphone("12fdef", "iphone");
        Smartphone smartphone2 = new Smartphone("12fdef", "pixel");

        System.out.println(smartphone1.equals(smartphone2));
    }
}
