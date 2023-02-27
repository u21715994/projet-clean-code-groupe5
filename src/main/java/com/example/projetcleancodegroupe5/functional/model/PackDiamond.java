package com.example.projetcleancodegroupe5.functional.model;



import com.example.projetcleancodegroupe5.functional.service.HeroGenerationService;

import java.util.ArrayList;
import java.util.List;

public class PackDiamond implements Pack{
    List<Hero> heroes;
    public PackDiamond(){
        heroes = new ArrayList<Hero>(5);
        createPack();
    }

    @Override
    public void createPack(){
        for(int i = 0; i < 5; i++) {
            this.heroes.add(HeroGenerationService.generateHero());
        }
    }

    @Override
    public List<Hero> getHeroInPack() {
        return heroes;
    }
}
