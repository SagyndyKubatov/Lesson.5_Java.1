public class Boss {
    private int health, damage;
    private String heroAttackType;

    public Boss(int health, int damage, String heroAttackType) {
        this.health = health;
        this.damage = damage;
        this.heroAttackType = heroAttackType;
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

    public String getHeroAttackType() {
        return heroAttackType;
    }

    public void setHeroAttackType(String heroAttackType) {
        this.heroAttackType = heroAttackType;
    }
    
}
