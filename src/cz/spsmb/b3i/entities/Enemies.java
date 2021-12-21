package cz.spsmb.b3i.entities;

import java.util.Random;

public enum Enemies {

    MINOTAUR(new Entity("MINOTAUR", 200, 30, 0.5)),
    SKELETON(new Entity("SKELETON", 120, 20, 0.4)),
    SPIDER(new Entity("SPIDER", 80, 20, 0.35)),
    ORG(new Entity("ORG", 50, 15, 0.3));

    private Random random = new Random();

    private Entity entity;

    Enemies(Entity entity) {
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }
}
