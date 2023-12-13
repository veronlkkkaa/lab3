package Objects;

public enum Location {
    GROUNG("землю"),

    GRASS("лужайку"),

    FENCE("Сквозь рейки ограды");

    private String title;

    Location(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
