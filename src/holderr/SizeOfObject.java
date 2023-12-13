package holderr;

public enum SizeOfObject {
    BIG("большой"),
    SMALL("маленькие"),
    MIDDLE("средненький");

    private String title;

    SizeOfObject(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
