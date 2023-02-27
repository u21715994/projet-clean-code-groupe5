package com.example.projetcleancodegroupe5.functional.service;


import com.example.projetcleancodegroupe5.functional.model.Hero;

public class LevelUpHeroService {
    public static void levelHeroUpService(Hero hero_attacker){
        if (hero_attacker.getExperiencePoint() % 5 == 0)
            hero_attacker = hero_attacker.levelUp();
    }
}
