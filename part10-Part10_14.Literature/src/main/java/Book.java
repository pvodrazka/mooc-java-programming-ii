public class Book {
    private String name;
    private int age;

    public Book(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String toString() {
        return this.name + " (recommended for " + this.age + " year-olds or older)";
                //The Ringing Lullaby Book (recommended for 0 year-olds or older)
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
