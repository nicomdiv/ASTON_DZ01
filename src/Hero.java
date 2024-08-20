public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println(name + " атакует врага.");
        enemy.takeDamage(10);
    }
}
