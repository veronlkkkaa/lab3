package holderr;

public enum HolderState {
    EMPTY("пустой"),
    FOOL("полный");

    private String title;

    HolderState(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
