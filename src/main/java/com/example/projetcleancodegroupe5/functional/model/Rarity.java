package com.example.projetcleancodegroupe5.functional.model;

public enum Rarity {
    COMMON(0),
    RARE(1),
    LEGENDARY(2);
    private final int value;

    private Rarity(int value){
        this.value = value;
    }

    int getValue(){
        return this.value;
    }
}
