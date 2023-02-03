public enum Education {
    PHD("Doctoral degree"),
    MA("Masters degree"),
    BA("Bachelors degree"),
    HS("High School diploma");

    private String abbrev;

    private Education (String abbrev) {
        this.abbrev=abbrev;
    }

    public String getAbbrev() {
        return this.abbrev;
    }
}
