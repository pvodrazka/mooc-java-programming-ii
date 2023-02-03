package application;

public class StandardSensor implements Sensor{
    private int temp;


    public StandardSensor(int temp) {
this.temp=temp;

    }

    public boolean isOn(){
        return true;

    }
   public void setOn(){}      // sets the sensor on
    public void setOff(){}     // sets the sensor off
    public int read(){return this.temp;}       // returns the value of the sensor if it's on
    // if the sensor is not on, throw an IllegalStateException
}

