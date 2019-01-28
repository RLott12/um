package com.company;

public class Enemy {
    int health;
    int strength;
    int defense;
    String name;

    public Enemy(int Health, int Strength, int Defense, String Name) {
        this.health = Health;
        this.defense = Defense;
        this.strength = Strength;
        this.name = Name;
    }

    public void Train() {
        this.strength += 40;
    }

    public void TakeDamage(Character character) {
        if (character.strength <= this.defense) {
            System.out.println("Your strength is too low to deal damage!");

            try {
                Thread.sleep(2000L);
            } catch (Exception var5) {
            }

            character.Train();
            System.out.println("You decide to train");

            try {
                Thread.sleep(2000L);
            } catch (Exception var4) {
            }

            System.out.println("+50 Strength.");

            try {
                Thread.sleep(2000L);
            } catch (Exception var3) {
            }
        }

        this.health -= character.strength - this.defense;
    }
}

