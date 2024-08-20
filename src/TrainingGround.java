public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(100);
        //Hero hero = new Hero("Дмитрий");
        //hero.attackEnemy(enemy);
        Warrior warrior = new Warrior("Дмитрий");
        warrior.attackEnemy(enemy);
        Mage mage = new Mage("Дмитрий");
        mage.attackEnemy(enemy);
        Archer archer = new Archer("Дмитрий");
        archer.attackEnemy(enemy);
    }
}
