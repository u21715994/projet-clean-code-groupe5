package com.example.projetcleancodegroupe5.functional.service;

import com.example.projetcleancodegroupe5.functional.model.Hero;
import com.example.projetcleancodegroupe5.functional.model.Rarity;

import java.util.Random;

public class HeroGenerationService {
    public static Hero generateHero(){
        Random random = new Random();
        int heroRarity = random.nextInt(1, 101);
        boolean probablyLegendary = heroRarity <= 5;
        boolean probablyRare = 5 < heroRarity && heroRarity <= 25;
        if(probablyLegendary)
            return HeroCreateService.createHero(HeroGenerationSpecialityService.generateSpeciality(), Rarity.LEGENDARY, GenerateNameHeroService.generateName());
        else if(probablyRare)
            return HeroCreateService.createHero(HeroGenerationSpecialityService.generateSpeciality(), Rarity.RARE, GenerateNameHeroService.generateName());
        return HeroCreateService.createHero(HeroGenerationSpecialityService.generateSpeciality(), Rarity.COMMON, GenerateNameHeroService.generateName());
    }
}
