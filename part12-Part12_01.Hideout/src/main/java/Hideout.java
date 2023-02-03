import java.util.ArrayList;
import java.util.List;

public class Hideout<T> {

    private List<T> list;

    public Hideout() {
this.list=new ArrayList<>();
    }

    public void putIntoHideout(T toHide) //puts an object with a type in accordance with the type parameter given to
    // the the class into the hideout.
    // In case an object is already in the hideout, it will disappear.
    {if (this.list.isEmpty()){
            this.list.add(toHide);}
else {this.list.remove(0);
    this.list.add(toHide);
}
    }


    public T takeFromHideout()// takes out the object with a type in accordance with the type parameter given to the
    // the class from the hideout. In case there is nothing in the hideout, we return null.
    // Calling the method returns the object in the hideout and removes the object from the hideout.
    {if (this.list.isEmpty()){
        return null;}
        else {
            ArrayList<T> temp = new ArrayList<>();
            temp.add(this.list.get(0));
        this.list.remove(0);
        return temp.get(0);

    }
    }

    public boolean isInHideout() {
        return !this.list.isEmpty();
    }
}
