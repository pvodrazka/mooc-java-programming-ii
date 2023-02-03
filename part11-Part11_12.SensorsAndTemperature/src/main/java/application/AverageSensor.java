package application;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor{

    private List<Sensor> seznam;
    private List<Integer> readings;

    public AverageSensor() {
        this.seznam=new ArrayList<>();
        this.readings= new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.seznam.add(toAdd);

    }

    public boolean isOn() {
        boolean isOn= true;
        for (Sensor sensor: this.seznam
             ) {if (!sensor.isOn()){
                 isOn=false;
        }

        }
        return isOn;
    }    // returns true if the sensor is on

    public void setOn() {
        this.seznam.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        this.seznam.forEach(Sensor::setOff);
    }
    public int read() {
        if (!isOn()|| this.seznam.isEmpty()) {
            throw new IllegalStateException();
        }
        else {

            double averageTemperature = this.seznam.stream()
                    .mapToInt(s -> Integer.valueOf(s.read()))
                    .average().getAsDouble();

            this.readings.add((int)averageTemperature);
            return (int) averageTemperature;
            }



    }
    public List<Integer> readings() {
        return this.readings;
    }
}
