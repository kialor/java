package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readingsList;


    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.readingsList = new ArrayList<>();
    }
    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors){
            if(!sensor.isOn()){
                return false;
            }
        }
        return !sensors.isEmpty();
    }

    @Override
    public void setOn() {
        for(Sensor sensor : sensors) {
            sensor.setOn();
        }

    }

    @Override
    public void setOff() {
        for(Sensor sensor : sensors) {
            sensor.setOff();
        }

    }

    @Override
    public int read() {
        if(!isOn() || sensors.isEmpty()) {
            throw new IllegalStateException("No sensors, or average sensor is off.");
        }

        int total = 0;
        for (Sensor sensor : sensors) {
            int reading = sensor.read();
            total += reading;
        }
        int average = total / sensors.size();
        readingsList.add(average);
        return average;
    }

    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return readingsList;
    }
}
