package br.com.JavaOneForAll.lesson161Collections.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("kevboard","keyboard");
        map.put("mousw","mouse");
        map.put("yow","you");
        System.out.println(map);
    }
}
