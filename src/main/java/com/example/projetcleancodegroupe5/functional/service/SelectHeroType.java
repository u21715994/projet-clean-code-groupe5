package com.example.projetcleancodegroupe5.functional.service;

import com.example.projetcleancodegroupe5.functional.model.Hero;
import com.example.projetcleancodegroupe5.functional.model.Player;

import java.util.List;

public interface SelectHeroType {
    List<Hero> selectHero(Player attacker, Player defender);
}
