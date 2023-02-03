public class Dog extends Animal implements NoiseCapable {


    public Dog(String dogName) {
       super(dogName);






    }

    public Dog() {
        super("Dog");

    }

    void bark() {
        System.out.println(getName() + " barks" );
    }





    @Override
    public void makeNoise() {
        bark();
    }
}
