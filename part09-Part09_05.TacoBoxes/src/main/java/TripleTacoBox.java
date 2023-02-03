//Implement the class TripleTacoBox, that implements the TacoBox interface.
// TripleTacobox has a constructor with no parameters.
// TripleTacobox has an object variable tacos which is initialized at 3 when the constructor is called.

public class TripleTacoBox implements TacoBox{
    private int tacos;

    public TripleTacoBox () {
        this.tacos=3;
    }
    public int tacosRemaining() {return this.tacos;};
    public void eat(){

        if (this.tacos> 0)
        {this.tacos-=1;}
    }

}
