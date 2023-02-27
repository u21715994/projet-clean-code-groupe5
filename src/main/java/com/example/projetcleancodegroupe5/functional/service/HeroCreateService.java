package com.example.projetcleancodegroupe5.functional.service;

import com.example.projetcleancodegroupe5.functional.model.Hero;
import com.example.projetcleancodegroupe5.functional.model.HeroFactory;
import com.example.projetcleancodegroupe5.functional.model.Rarity;
import com.example.projetcleancodegroupe5.functional.model.Speciality;

public class HeroCreateService {
    public static Hero createHero(Speciality speciality, Rarity rarity, String name){
        return HeroFactory.createHero(speciality, rarity, name);
    }
}
