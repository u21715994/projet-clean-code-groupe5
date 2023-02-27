package com.example.projetcleancodegroupe5.database;

import com.example.projetcleancodegroupe5.functional.model.Hero;
import com.example.projetcleancodegroupe5.functional.model.Player;

interface Database {
    void connection();
    void close();

    void addHero(Hero hero);

    void updateHero(String id, Hero hero);

    void addPlayer(Player player);

    void updatePlayer(String id, Player player);
}
