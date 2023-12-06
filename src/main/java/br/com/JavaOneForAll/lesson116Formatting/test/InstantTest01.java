package br.com.JavaOneForAll.lesson116Formatting.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());
        System.out.println(instant);
        System.out.println(LocalDateTime.now());
        System.out.println(Instant.ofEpochSecond(3,100000));
        System.out.println(Instant.ofEpochSecond(1,-100000));
        System.out.println(Instant.ofEpochSecond(8,10_000_000));
        System.out.println(Instant.ofEpochSecond(3,100000));

    }
}
