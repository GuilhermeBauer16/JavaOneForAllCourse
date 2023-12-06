package br.com.JavaOneForAll.lesson64Association.test;

import br.com.JavaOneForAll.lesson64Association.domain.Player;
import br.com.JavaOneForAll.lesson64Association.domain.Team;

public class PlayerTest03 {

    public static void main(String[] args) {
        Player player = new Player("Pelé");
        Player player2 = new Player("Cafu");
        Team team = new Team("Brazilian's national team");

        player.setTeam(team);
        player2.setTeam(team);
        Player[] players = {player, player2};
        team.setPlayers(players);

        System.out.println("---Player---");
        player.print();
        player2.print();

        System.out.println("---Team---");
        team.print();
    }
}
