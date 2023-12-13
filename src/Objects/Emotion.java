package Objects;

public enum Emotion {
    CAREFUL("осторожно"),
    NOTCAREFUL("не очень осторожно"),
    RUDE("грубовато");

    private String title;

    Emotion(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
