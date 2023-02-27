package com.example.projetcleancodegroupe5.functional.model;

public interface Hero {
    String getName();

    String getRarity();
    public String getSpeciality();
    int getLifePoint();
    int getArmor();
    int getLevel();
    int getPower();
    String getID();
    void setId(String id);
    Hero setLifePoint(int lifePoint);

    Hero levelUp();
    Hero defend(Hero hero);

    Hero battleWin();
    boolean isDead();

    int getExperiencePoint();

    boolean equals(Object o);

    int hashCode();
}