package com.example.projetcleancodegroupe5.functional.model;

public final class HeroFactory {
    public static Hero createHero(Speciality speciality, Rarity rarity, String name){
        if(speciality == Speciality.TANK)
            return new HeroTank(name, rarity);
        if(speciality == Speciality.ASSASSIN)
            return new HeroAssassin(name, rarity);
        return new HeroWizard(name, rarity);
    }
}
