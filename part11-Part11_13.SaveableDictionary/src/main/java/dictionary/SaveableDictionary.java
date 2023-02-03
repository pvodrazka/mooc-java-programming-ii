package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {

    private String file;
    private Map<String, String> toFinish;
    private Map<String, String> fromFinish;

    public SaveableDictionary() {
        this.toFinish = new HashMap<>();
        this.fromFinish = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.file = file;
        this.toFinish = new HashMap<>();
        this.fromFinish = new HashMap<>();
    }

    public void add(String words, String translation) {

        if (this.toFinish.containsKey(words) || this.fromFinish.containsKey(translation)) {

        } else {
            this.toFinish.put(words, translation);
            this.fromFinish.put(translation, words);
        }
    }

    public String translate(String word) {
        if (this.toFinish.containsKey(word)) {
            return this.toFinish.get(word);

        } else return this.fromFinish.getOrDefault(word, null);
    }

    public void delete(String word) {
        String tran1 = this.toFinish.get(word);
        this.toFinish.remove(word);
        this.fromFinish.remove(tran1);

        String tran2 = this.fromFinish.get(word);
        this.fromFinish.remove(word);
        this.toFinish.remove(tran2);

    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(Paths.get(this.file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // split the line based on the ':' character

                add(parts[0], parts[1]);


            }
        } catch (Exception e) {
            System.out.println("cant read the file");
            return false;
        }
        return true;
    }


    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.file);
            for (String string : this.toFinish.keySet()
            ) {
                writer.println(string + ":" + this.toFinish.get(string));

            }


            writer.close();

        } catch (Exception e) {
            System.out.println("coouldnt write to a file");
            return false;
        }
        return true;
    }
}


