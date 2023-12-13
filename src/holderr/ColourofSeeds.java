package holderr;

public enum ColourofSeeds {
    WHITE("белые"),
    BLACK("черные"),
    GREEN("зеленые");

    private String title;

    ColourofSeeds(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
