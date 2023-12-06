package br.com.JavaOneForAll.lesson161Collections.test;

import br.com.JavaOneForAll.lesson161Collections.domain.Customer;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {

    public static void main(String[] args) {

        Customer customer = new Customer("Guilherme Bauer");
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("A" , "Letter A");
        map.put("E" , "Letter E");
        map.put("D" , "Letter D");
        map.put("B" , "Letter B");
        map.put("C" , "Letter C");


        for(Map.Entry<String , String > entry : map.entrySet()){
            System.out.println(entry.getKey() + "- " + entry.getValue());
        }

        System.out.println(map.headMap("C"));




    }
}
