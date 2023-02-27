package com.example.projetcleancodegroupe5.functional.service;

import com.example.projetcleancodegroupe5.functional.model.Deck;
import com.example.projetcleancodegroupe5.functional.model.Hero;

import java.util.List;

public class HeroFinderService {
    public static List<Hero> findHero(Deck deck, int level){
        if(deck == null || deck.getCards().size() == 0)
            throw new RuntimeException("Vous ne pouvez pas recherche dans un deck vide");
        if(level <= 0)
            throw new IllegalArgumentException("Vous ne pouvez pas rechercher un hero avec un niveau inférieur ou égale à 0");
        if(deck.getCards().stream().filter(hero-> hero.getLevel() >= level) == null)
            throw new RuntimeException("Il n'y a pas de heros avec ce niveau");
        return deck.getCards().stream().filter(hero-> hero.getLevel() >= level).toList();
    }
}
