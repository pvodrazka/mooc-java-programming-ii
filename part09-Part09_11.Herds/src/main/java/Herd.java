import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Movable> list;

    public Herd() {
        this.list= new ArrayList<>();
    }

    public String toString()
   // Returns a string representation of the positions of the members of the herd, each on its own line.
       {String vratit ="";
        for (Movable mov: this.list
             ) {vratit+= mov.toString()+"\n";


        }
        return vratit;
    }

    public void addToHerd(Movable movable)
    //Adds an object that implements the Movable interface to the herd.
    {
        this.list.add(movable);
    }

    public void move(int dx, int dy)
    //Moves the herd with by the amount specified by the parameters. Notice that here you have to move each member of the herd.
    {
        for (Movable mov: this.list
             ) {mov.move(dx, dy);

        }
    }
}
