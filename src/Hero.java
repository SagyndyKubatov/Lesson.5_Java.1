public class Hero {
    private  String ability;
    private  int health,damage;

    public Hero(String ability, int health, int damage) {
        this.ability = ability;
        this.health = health;
        this.damage = damage;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
