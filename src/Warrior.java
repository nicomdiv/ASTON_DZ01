public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print("Воин " + this.getName() + " атакует врага.");
        enemy.takeDamage(20);
    }
}
