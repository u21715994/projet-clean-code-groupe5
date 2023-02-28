package com.example.projetcleancodegroupe5.port;

import com.example.projetcleancodegroupe5.functional.model.Deck;
import com.example.projetcleancodegroupe5.functional.model.Player;

public interface PlayerDAO {
    void addPlayer(Player player);

    void updatePlayer(String id, Player player);
    Player findPlayer(String id);
    void addDeck(Player player);
    void addHero(Player player);
}
