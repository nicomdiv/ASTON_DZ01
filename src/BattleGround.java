import enemies.Enemy;
import heroes.Archer;
import heroes.Hero;
import heroes.Mage;
import heroes.Warrior;

import java.util.ArrayList;
import java.util.List;

public class BattleGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(50);
        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Archer("Дмитрий"));
        heroes.add(new Mage("Петр"));
        heroes.add(new Warrior("Лев"));
        for (Hero hero : heroes) {
            System.out.println("Здоровье врага: " + enemy.getHealth());
            if (enemy.isAlive()) hero.attackEnemy(enemy);
        }
        if (enemy.isAlive()) System.out.println("Враг жив! Здоровье:" + enemy.getHealth());
        else System.out.println("Враг убит! Здоровье:" + enemy.getHealth());
    }
}
