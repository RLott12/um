package com.company;

import java.util.ArrayList;
import java.util.Random;

public class FrostArea extends Area {
    public FrostArea() {
        this.type = "Frost";
        this.rand = new Random();
        this.monsterType = new ArrayList();
        this.monsterType.add(new Enemy(270, 352, 270, "Icicle"));
        this.monsterType.add(new Enemy(270, 343, 280, "Pingu"));
        this.monsterType.add(new Enemy(360, 350, 275, "Frosty Boy"));
        this.monsterType.add(new Enemy(589, 560, 443, "Sharp Icicle"));
        this.monsterType.add(new Enemy(610, 559, 432, "Fat Pingu"));
        this.monsterType.add(new Enemy(850, 753, 681, "Bad Frosty Boy"));
        this.monsterType.add(new Enemy(880, 770, 689, "Haunted Snowman"));
    }
}
