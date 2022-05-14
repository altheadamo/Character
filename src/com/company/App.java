package com.company;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Battle Begin!");
        System.out.println("Wizards and Warlocks");
        System.out.println("Both Fighter Have 200 HP and 200 Mana");
        System.out.println("~~~~~~~~~~~~~~~~~~");

        Wizard Merlin = new Wizard("Merlin");
        Warlock Saruman = new Warlock("Saruman");
        Merlin.fireStorm(Saruman);
    }
}
