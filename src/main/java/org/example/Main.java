package org.example;

import org.example.inhertance_adpter.SensorAdapterInhertnce;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        GetTempInCel celsiusSensor = new SensorAdapter(sensor);

        sensor.setTemp(200);
        System.out.println("Temperature in celsius from Composition: " + celsiusSensor.getTemperatureCelsius());


        SensorAdapterInhertnce sensorAdapterInhertnce= new SensorAdapterInhertnce();
        sensorAdapterInhertnce.setTemp(200);
        System.out.println("Temperature in celsius from Inheritance: " + celsiusSensor.getTemperatureCelsius());

    }
}