package com.example.projetcleancodegroupe5.functional.service;

import com.example.projetcleancodegroupe5.functional.model.Hero;
import com.example.projetcleancodegroupe5.functional.model.Player;

public class UpdateInformationPlayerDefender {
    public static void informationPlayerDefender(Player defender, Hero hero_defender, int index){
        defender.getDeck().getCards().set(index, hero_defender);
    }
}
