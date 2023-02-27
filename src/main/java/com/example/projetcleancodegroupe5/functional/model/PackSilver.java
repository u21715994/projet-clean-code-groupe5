package com.example.projetcleancodegroupe5.functional.model;


import com.example.projetcleancodegroupe5.functional.service.HeroGenerationService;

import java.util.ArrayList;
import java.util.List;

public class PackSilver implements Pack{
    List<Hero> heroes;
    public PackSilver(){
        this.heroes = new ArrayList<Hero>();
        createPack();
    }

    @Override
    public void createPack(){
        for(int i = 0; i < 3; i++) {
            this.heroes.add(HeroGenerationService.generateHero());
        }
    }

    @Override
    public List<Hero> getHeroInPack() {
        return heroes;
    }
}
