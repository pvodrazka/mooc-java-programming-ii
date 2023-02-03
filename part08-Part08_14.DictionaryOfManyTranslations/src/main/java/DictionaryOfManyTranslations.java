import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> mapa;
    private ArrayList<String> list;

    public DictionaryOfManyTranslations() {
        this.mapa = new HashMap<String, ArrayList<String>>();
        this.list = new ArrayList<String>();
    }


    public void add(String word, String translation) //adds the translation for the word and preserves the old translations.
    {
        if (this.mapa.containsKey(word)) {
            this.mapa.get(word).add(translation);
        } else {
            this.mapa.put(word, new ArrayList<String>());
            this.mapa.get(word).add(translation);
        }
    }

    public ArrayList<String> translate(String word) /*returns a list of the translations added for the word.
    If the word has no translations, the method should return an empty list.*/
    {if (!this.mapa.containsKey(word)) {
        return new ArrayList<>();
    }


        return this.mapa.get(word);
    }

    public void remove(String word) //removes the word and all its translations from the dictionary.
     {this.mapa.

    }



}


