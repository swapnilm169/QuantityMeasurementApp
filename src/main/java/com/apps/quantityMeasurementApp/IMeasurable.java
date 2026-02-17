package com.apps.quantityMeasurementApp;

public interface IMeasurable {

     Double getConversionFactor();

     Double convertToBaseUnit(Double value);

     Double convertFromBaseUnit(Double value);

     static void main(String[] args) {
        System.out.println("IMeasurable Interface");
    }
}
