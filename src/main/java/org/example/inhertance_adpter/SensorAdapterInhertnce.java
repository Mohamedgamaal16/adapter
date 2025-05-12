package org.example.inhertance_adpter;

import org.example.GetTempInCel;
import org.example.Sensor;

public class SensorAdapterInhertnce extends Sensor implements GetTempInCel {

    @Override
    public double getTemperatureCelsius() {
        return (super.getTemperatureCelsius() - 32) * 5 / 9;
    }


}
