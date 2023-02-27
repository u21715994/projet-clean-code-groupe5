package com.example.projetcleancodegroupe5.functional.service;

import com.example.projetcleancodegroupe5.functional.model.Hero;
import com.example.projetcleancodegroupe5.functional.model.Player;

public class UpdateHeroInformation {
    public static Player updateHeroInformation(Hero hero_attacker, Hero hero_defender, Player attacker, Player defender){
        if(hero_defender.isDead()) {
            hero_attacker = hero_attacker.battleWin();
            attacker = PlayerWinBattle.playerWinBattle(attacker);
            LevelUpHeroService.levelHeroUpService(hero_attacker);
            ShowDeckPlayerService.showDeck(defender).getCards().remove(hero_defender);
            return attacker;
        }
        return attacker;
    }
}
