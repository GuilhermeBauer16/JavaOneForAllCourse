package br.com.JavaOneForAll.lesson61StaticModifier.domain;

public class Anime {
    private String name;
    private static int[] episodes;

    static{
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;

        }

    }

//    public Anime() {
//
//        for (int episode : Anime.episodes) {
//            System.out.print(episode + " ");
//        }
//    }

    public Anime(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int[] getEpisodes() {
        return Anime.episodes;
    }


}
