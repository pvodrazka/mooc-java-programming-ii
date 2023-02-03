public class Organism implements Movable {
    private int initialX;
    private int initialY;

    public Organism(int x, int y) {
        this.initialX = x;
        this.initialY = y;
    }

    public String toString()
    //Creates and returns a string representation of the organism. That representation should remind the following: "x: 3; y: 6".
    // Notice that a semicolon is used to separate the coordinates.
    {return "x: " + this.initialX + "; y: " + this.initialY;
    }

    public void move(int dx, int dy)
    //Moves the object by the values it receives as parameters.
    // The dx variable contains the change to coordinate x, and the dy variable ontains the change to the coordinate y.
    //For example, if the value of dx is 5, the value of the object variable x should be incremented by five.
    {
        this.initialX+=dx;
        this.initialY+=dy;
    }
}
