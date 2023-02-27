package com.example.projetcleancodegroupe5.functional.service;


import com.example.projetcleancodegroupe5.functional.model.Deck;
import com.example.projetcleancodegroupe5.functional.model.Player;

public class ShowDeckPlayerService {
    public static Deck showDeck(Player player){
        return player.getDeck();
    }
}
