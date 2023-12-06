package br.com.JavaOneForAll.lesson108String.test;

public class StringTest02 {
    public static void main(String[] args) {

        String name = "Luffy";
        String name2 = "               luffy             ";
        String numbers = "012345";
        name2 = name2.concat("Monkey D. ");
        System.out.println(name.charAt(0));
        String[] names = {"Me", "John", "Zoro"};
        System.out.println(names.length);
        System.out.println(name.length());
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name.replace('f' , 'd'));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(numbers.substring(0, numbers.length()));
        System.out.println(name2);
        System.out.println(name.trim());

    }
}
