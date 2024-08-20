public class TrainingGround {
    public static void main(String[] args) {
        Hero hero = new Hero("Дмитрий");
        hero.attackEnemy();
        Warrior warrior = new Warrior("Дмитрий");
        warrior.attackEnemy();
        Mage mage = new Mage("Дмитрий");
        mage.attackEnemy();
        Archer archer = new Archer("Дмитрий");
        archer.attackEnemy();
    }
}
