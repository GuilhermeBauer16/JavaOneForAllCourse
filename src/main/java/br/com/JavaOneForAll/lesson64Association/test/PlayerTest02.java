package br.com.JavaOneForAll.lesson64Association.test;

import br.com.JavaOneForAll.lesson64Association.domain.Player;
import br.com.JavaOneForAll.lesson64Association.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player01 = new Player("Pelé");
        Team team01 = new Team("Brazilian's national team");
        player01.setTeam(team01);
        player01.print();
    }
}
