package com.example.projetcleancodegroupe5.functional.model;


import java.util.ArrayList;
import java.util.List;


public class Deck {
    private String ID = "1";
    List<Hero> cards;

    public Deck() {
        this.cards = new ArrayList<Hero>();
    }

    public String getID() {
        return ID;
    }

    public List<Hero> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }
}
