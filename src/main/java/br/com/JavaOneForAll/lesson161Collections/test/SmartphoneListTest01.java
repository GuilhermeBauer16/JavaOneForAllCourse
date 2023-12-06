package br.com.JavaOneForAll.lesson161Collections.test;

import br.com.JavaOneForAll.lesson161Collections.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        List<Smartphone> smartphones = new ArrayList<>();
        Smartphone smartphone1 = new Smartphone("12111", "iphone");
        Smartphone smartphone2 = new Smartphone("2222", "pixel");
        Smartphone smartphone3 = new Smartphone("13333", "Motorola");
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);

        for(Smartphone smartphone : smartphones){
            System.out.println(smartphone.toString());
        }
    }
}
