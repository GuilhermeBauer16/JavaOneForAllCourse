package br.com.JavaOneForAll.lesson64Association.test;

import br.com.JavaOneForAll.lesson64Association.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player01 = new Player("Pelé");
        Player player02 = new Player("Romário");
        Player player03 = new Player("Cafu");

        Player[] players = {player01 , player02 , player03};

        for(Player player: players) {
            player.print();
        }
    }
}
