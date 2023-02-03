public class Cat extends Animal implements NoiseCapable{


    public Cat(String catName) {
        super(catName);

    }

    public Cat() {
        super("Cat");

    }

    public void purr() {
        System.out.println(getName() + " purrs");
    }




    @Override
    public void makeNoise() {
        purr();
    }
}
