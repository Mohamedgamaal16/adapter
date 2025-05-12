package org.example;

public class SensorAdapter implements GetTempInCel{

    private Sensor sensor ;

public  SensorAdapter ( Sensor sensor){
    this.sensor = sensor;
}
    @Override
    public double getTemperatureCelsius() {
        return (sensor.getTemperatureCelsius()-32) * 5 / 9;
    }
}
