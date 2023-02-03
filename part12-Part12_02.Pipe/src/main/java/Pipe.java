import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    private List<T> list;

    public Pipe(){
        this.list=new ArrayList<>();
    }

    public void putIntoPipe(T value) //puts an object with a type in accordance
    // with the type parameter given to the the class into the pipe.
    {
        this.list.add(value);
    }

    public T takeFromPipe() {
        if(this.list.isEmpty()){return null;
    }
        T temp;
        temp=this.list.get(0);
        this.list.remove(0);
        return temp;
}

    public boolean isInPipe() {
        return !this.list.isEmpty();
    }
}
