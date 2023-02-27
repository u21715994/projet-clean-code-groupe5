package com.example.projetcleancodegroupe5.functional.service;

import com.example.projetcleancodegroupe5.functional.model.Hero;

public class DefendHeroPlayerService {
    public static Hero defendPlayer(Hero hero_attacker, Hero hero_defender){
        hero_defender = hero_defender.defend(hero_attacker);
        return hero_defender;
    }
}
