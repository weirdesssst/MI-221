abstract class Ghost {
    String name;
    String color;
    int scareLevel;

    public Ghost(String name, String color, int scareLevel) {
        this.name = name;
        this.color = color;
        this.scareLevel = scareLevel;
    }

    abstract void scare();
}
