package Vecka43;

abstract class Monster {
    protected String name;
    protected int health;

    public Monster(String name) {
        this.name = name;
        this.health = 100;
    }

    public abstract int attack();

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }
}