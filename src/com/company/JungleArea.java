package com.company;

import java.util.ArrayList;
import java.util.Random;

public class JungleArea extends Area {
    public JungleArea() {
        this.type = "Jungle";
        this.rand = new Random();
        this.monsterType = new ArrayList();
        this.monsterType.add(new Enemy(200, 380, 260, "Lion"));
        this.monsterType.add(new Enemy(200, 380, 260, "Tiger"));
        this.monsterType.add(new Enemy(300, 400, 290, "Angry Monkey"));
        this.monsterType.add(new Enemy(580, 570, 443, "Rabid Tiger"));
        this.monsterType.add(new Enemy(610, 589, 422, "Big Fat Snek"));
        this.monsterType.add(new Enemy(850, 750, 683, "Panther"));
        this.monsterType.add(new Enemy(890, 763, 663, "Liger"));
    }
}

