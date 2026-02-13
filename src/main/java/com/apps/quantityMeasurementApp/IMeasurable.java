package com.apps.quantityMeasurementApp;

public interface IMeasurable {

    public double getConversionFactor();

    public double convertToBaseUnit(double value);

    public double convertFromBaseUnit(double value);

    public static void main(String[] args) {
        System.out.println("IMeasurable Interface");
    }
}
