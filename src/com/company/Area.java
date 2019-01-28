package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Area {
    String type;
    ArrayList<Enemy> monsterType = new ArrayList();
    Random rand = new Random();
    int randInt;

    public Area() {
    }

    public Enemy enemyEncounter(Character character) {
        if (character.level < 4) {
            this.randInt = this.rand.nextInt(3);
        } else if (character.level < 10 && character.level > 4) {
            while(this.randInt < 3) {
                this.randInt = this.rand.nextInt(5);
            }
        } else if (character.level > 10) {
            while(this.randInt < 5) {
                this.randInt = this.rand.nextInt(7);
            }
        }

        Enemy enemy = (Enemy)this.monsterType.get(this.randInt);
        return enemy;
    }
}
