//Add the Interface to your program. Adding a new Interface is quite similar to adding a new class.
// Instead of selecting new Java class just select new Java interface.
//Create classes Book and CD, which implement the Interface. Book has a constructor which is given the author (String),
// name of the book (String), and the weight of the book (double) as parameters.
// CD has a constructor which is given the artist (String), name of the CD (String), and the publication year (int).
// The weight of all CDs is 0.1 kg.
////Remember to implement the Interface Packable in both of the classes. The classes must work as follows:

public class Book implements Packable {
    private String author;
    private String name;
    private double weight;

    public Book (String author, String name, double weight) {
        this.author=author;
        this.name=name;
        this.weight=weight;
    }

    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.name;
    }
}
