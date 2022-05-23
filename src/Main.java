public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(700,50, " ");
        System.out.println("Boss health: "+boss.getHealth()+". Boss damage: "+boss.getDamage()+". Boss attack type def:  " +boss.getHeroAttackType());

        createHeroes();
    }
    public static Hero[] createHeroes(){
        Hero warrior = new Hero("Blade Storm", 400, 40);
        Hero paladin = new Hero("Shield of heaven", 400, 40);
        Hero roge = new Hero(250,50);

        Hero[] heroes = new Hero[3];
        heroes[0] = warrior;
        heroes[1] = paladin;
        heroes[2] = roge;
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Heroes health: "+heroes[i].getHealth()+". Heroes damage: "+heroes[i].getDamage()+". Heroes ability: "+heroes[i].getAbility());
        }

        return heroes;
    }

}