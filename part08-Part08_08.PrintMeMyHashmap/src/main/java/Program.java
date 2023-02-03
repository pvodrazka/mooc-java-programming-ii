
import java.util.ArrayList;
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");


        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");


    }

    public static void printKeys(HashMap<String, String> hashmap) {
        ArrayList<String> list = new ArrayList<>();
        for (String neco : hashmap.keySet()
        ) {
            list.add(neco);

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text)
    //prints the keys in the hashmap given as a parameter, which contain the string given as a parameter.
    {
        ArrayList<String> list = new ArrayList<>();
        for (String neco : hashmap.keySet()
        ) {
            if (neco.contains(text)) {
                list.add(neco);
            }

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        //prints the values in the given hashmap whichs keys contain the given string.
        ArrayList<String> list = new ArrayList<>();
        for (String neco : hashmap.keySet()
        ) {
            if (neco.contains(text)) {
                list.add(hashmap.get(neco));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}


