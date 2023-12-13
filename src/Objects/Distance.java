package Objects;

public enum Distance {
    FAR("далеко"),
    NOTFAR("не очень далеко");

    private String title;

    Distance(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
