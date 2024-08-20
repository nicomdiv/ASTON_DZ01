import enemies.Enemy;
import heroes.Archer;
import heroes.Mage;
import heroes.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(100);
        //heroes.Hero hero = new heroes.Hero("Дмитрий");
        //hero.attackEnemy(enemy);
        Warrior warrior = new Warrior("Дмитрий");
        warrior.attackEnemy(enemy);
        Mage mage = new Mage("Дмитрий");
        mage.attackEnemy(enemy);
        Archer archer = new Archer("Дмитрий");
        archer.attackEnemy(enemy);
    }
}
