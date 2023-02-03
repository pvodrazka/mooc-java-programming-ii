package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean onOff = false;


    public boolean isOn() {
        return onOff == true;
    }
    // returns true if the sensor is on

    public void setOn() {
        this.onOff=true;
    }     // sets the sensor on
    public void setOff() {
        this.onOff=false;

    }     // sets the sensor off
    public int read(){
        if (this.onOff == false) {
            throw new IllegalStateException();

        }
        else {
            Random rand= new Random();
            return rand.nextInt(60)-30;
        }
    }
}
