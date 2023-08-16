public class Main {

    public static Hero[] createHeroes() {
        Hero aether = new Hero(280, 50, "Physical");
        Hero dottore = new Hero(270, 40, "Magical");
        Hero lynette = new Hero(300, 45);
        Hero[] heroes = {aether, dottore, lynette};
        return heroes;

    }

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(100);
        boss.setDefenseType("Physical");
        System.out.println("Boss Health: " + boss.getHealth() + " Damage: " + boss.getDamage()
                + " Defense type: " + boss.getDefenseType());
        Hero[] myHeroes = createHeroes();
        for (int i = 0; i < myHeroes.length; i++)
            System.out.println("Health: "+ myHeroes[i].getHealth() + " Damage:" + myHeroes[i].getDamage()
                    + " Attribute:" + myHeroes[i].getAttribute());

    }
}