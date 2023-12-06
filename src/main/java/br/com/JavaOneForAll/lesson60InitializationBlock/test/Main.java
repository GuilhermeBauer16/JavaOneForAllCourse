package br.com.JavaOneForAll.lesson60InitializationBlock.test;

import br.com.JavaOneForAll.lesson60InitializationBlock.domain.Anime;

public class Main {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");

        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }
    }
}
