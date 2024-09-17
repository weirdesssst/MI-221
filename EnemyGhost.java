// EnemyGhost.java
public class EnemyGhost extends Ghost {

    public EnemyGhost(String name, String color, int scareLevel) {
        super(name, color, scareLevel);
    }

    @Override
    void scare() {
        System.out.println(name + " este o fantomă dușmănoasă! Culoare: " + color + ", Nivel de sperietură: " + scareLevel);
    }
}