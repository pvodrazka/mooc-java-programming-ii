//n the mainProgram class, implement a class method returnSize, which is given a List-object as a parameter,
// and returns the size of the list as an integer.
//
//The method should work as follows:

import java.util.ArrayList;
import java.util.List;

public class mainProgram {

    public static void main(String[] args) {
        // test your method here
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));

    }

    public static int returnSize (List list) {
        return list.size();
    }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
}
