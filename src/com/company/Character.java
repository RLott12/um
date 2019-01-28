package com.company;

public class Character {
    int health;
    int defense;
    int strength;
    int level;

    public Character(int Health, int Defense, int Strength, int Level) {
        this.health = Health;
        this.defense = Defense;
        this.strength = Strength;
        this.level = Level;
    }

    public void Train() {
        this.strength += 50;
    }

    public void levelUp() {
        this.defense += 50;
        this.strength += 50;
        this.health = 1000;
    }

    public void TakeDamage(Enemy enemy) {
        if (enemy.strength <= this.strength) {
            System.out.println("The enemy's strength is too low.");

            try {
                Thread.sleep(2000L);
            } catch (Exception var5) {
            }

            enemy.Train();
            System.out.println("The enemy picked up a stick.");

            try {
                Thread.sleep(2000L);
            } catch (Exception var4) {
            }

            System.out.println("+40 Strength.");

            try {
                Thread.sleep(2000L);
            } catch (Exception var3) {
            }
        } else {
            this.health -= enemy.strength - this.defense;
        }

    }
}
