import java.util.HashMap;
import java.util.Locale;

public class Abbreviations {
private HashMap<String, String> mapa;
    public Abbreviations () {
        this.mapa = new HashMap<>();

    }
    public void addAbbreviation(String abbreviation, String explanation) {
        this.mapa.put(abbreviation, explanation);
    }
public static String sanitizedStr (String cisticka) {
     cisticka = cisticka.toLowerCase();
     return cisticka.trim();
}

    public boolean hasAbbreviation(String abbreviation) {
       String sanitized = sanitizedStr(abbreviation);
        if (this.mapa.containsKey(sanitized)) {
            return true;
        }
        else return false;
    }
    public String findExplanationFor(String abbreviation) {
        String sanitized = sanitizedStr(abbreviation);
        if (!this.mapa.containsKey(sanitized)) {
            return null;
        }
        else return this.mapa.get(sanitized);
    }
}
