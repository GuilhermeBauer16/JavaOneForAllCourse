package br.com.JavaOneForAll.lesson108String.test;

public class StringBuilder01 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Guilherme");
        sb.append(" Bauer");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0,10);
        System.out.println(sb);
    }

}
