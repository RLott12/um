package com.company;

import java.util.ArrayList;
import java.util.Random;

public class PlainsArea extends Area {
    public PlainsArea() {
        this.type = "Plains";
        this.rand = new Random();
        this.monsterType = new ArrayList();
        this.monsterType.add(new Enemy(190, 400, 270, "Cow"));
        this.monsterType.add(new Enemy(220, 500, 250, "Bad Tree Boy"));
        this.monsterType.add(new Enemy(190, 400, 270, "Moss Rock"));
        this.monsterType.add(new Enemy(593, 570, 413, "Big Ol Cow"));
        this.monsterType.add(new Enemy(626, 581, 422, "Rude Tree Boy"));
        this.monsterType.add(new Enemy(850, 736, 682, "Moss Monster"));
        this.monsterType.add(new Enemy(880, 700, 679, "Rabid Cow"));
    }
}

