public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print("Маг " + this.getName() + " атакует врага.");
        enemy.takeDamage(30);
    }
}
