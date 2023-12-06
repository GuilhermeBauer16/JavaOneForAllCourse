package br.com.JavaOneForAll.lesson58MethodOverloading.test;

import br.com.JavaOneForAll.lesson58MethodOverloading.doMain.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime01 = new Anime("Akuma Drive", "TV" , 12 , "finished","BR");
//        anime01.init("Akudama Drive","TV",12);
        anime01.print();

        Anime anime02 = new Anime("Akuma Drive", "TV" , 12 , "finished");
        anime02.print();
    }
}
