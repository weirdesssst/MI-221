class FriendlyGhost extends Ghost {

    public FriendlyGhost(String name, String color, int scareLevel) {
        super(name, color, scareLevel);
    }

    @Override
    void scare() {
        System.out.println(name + " este o fantomă prietenoasă! Culoare: " + color + ", Nivel de sperietură: " + scareLevel);
    }
}
