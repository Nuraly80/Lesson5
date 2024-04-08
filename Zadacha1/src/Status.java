public enum Status {
    AVAILABLE("AVAILABLE"),
    ARCHIVED("ARCHIVED"),
    BORROWED("BORROWED"),
    OVERDUED("OVERDUED");

    private String title;

    Status(String title) {
        this.title = title;
    }
}
