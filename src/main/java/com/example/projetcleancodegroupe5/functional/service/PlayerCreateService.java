package com.example.projetcleancodegroupe5.functional.service;

import com.example.projetcleancodegroupe5.functional.model.Hero;
import com.example.projetcleancodegroupe5.functional.model.Player;

import java.util.List;

public class PlayerCreateService {
    public static Player createPlayer(String name){
       return new Player(name);
    }

    public static Player createPlayer(Player player, int tokenRequired, List<Hero> heroesInDeck){
        return new Player(player, tokenRequired,heroesInDeck);
    }
}
