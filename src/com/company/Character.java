package com.company;

public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 200;
    public int manaPoints = 300;

    Character(String name){
        characterName = name;
    }

    public void damageTarget(Character enemyCharacter,int damagePoints){
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("enemy character HP Left = " + enemyCharacter.healthPoints);
    }
}
