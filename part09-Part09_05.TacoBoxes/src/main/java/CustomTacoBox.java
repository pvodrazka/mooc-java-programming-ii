//Implement the class CustomTacoBox, that implements the TacoBox interface.
// CustomTacoBox has a constructor with one parameter defining the initial number of tacos in the box(int tacos).


public class CustomTacoBox implements TacoBox{
    private int tacos;
    public CustomTacoBox(int tacos) {
this.tacos=tacos;
    }

    @Override
    public int tacosRemaining() {
        return tacos;

    }

    @Override
    public void eat() {
        if (this.tacos >0)
        {this.tacos-=1;}
    }
}
