package com.company;

import java.util.ArrayList;
import java.util.Random;

public class DesertArea extends Area {
    public DesertArea() {
        this.type = "Desert";
        this.rand = new Random();
        this.monsterType = new ArrayList();
        this.monsterType.add(new Enemy(210, 336, 270, "Cactus"));
        this.monsterType.add(new Enemy(210, 335, 265, "Snek"));
        this.monsterType.add(new Enemy(210, 334, 273, "Snek in a Boot"));
        this.monsterType.add(new Enemy(630, 570, 403, "Scary Snek"));
        this.monsterType.add(new Enemy(590, 585, 372, "Spiky Cactus"));
        this.monsterType.add(new Enemy(950, 750, 683, "Extra Scary Snek"));
        this.monsterType.add(new Enemy(900, 730, 693, "Spoopy Cactus"));
    }
}
