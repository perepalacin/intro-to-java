package application;

import java.util.ArrayList;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;

    public AverageSensor () {
        this.sensors = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn () {
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn () {
        for (Sensor sensor : this.sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (sensors.isEmpty() || !this.isOn()) {
            throw new IllegalStateException("No sensors added.");
        }
    
        return this.sensors.stream()
        .mapToInt(Sensor::read)
        .average();

    }
}
