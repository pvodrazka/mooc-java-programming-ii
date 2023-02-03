public class SanitizedString {
    private String abbrev;

    public SanitizedString (String abbrev) {
    this.abbrev=abbrev;
    }


    public String toString() {
        this.abbrev=this.abbrev.toLowerCase();

        return this.abbrev.trim();
    }
}
