package com.clinic.queue;

public class MedicalVitals{
    private double temperature;
    private String bloodPressure;
    private int heartRate;

    public MedicalVitals(double temperature, String bloodPressure, int heartRate){
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
    }
    @Override
    public String toString() {
        return "[Temp: " + temperature + " °C, BP: " + bloodPressure + ", HR: " heartRate + "bpm]";
    }
}