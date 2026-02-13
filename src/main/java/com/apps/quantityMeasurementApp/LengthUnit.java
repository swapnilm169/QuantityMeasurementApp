package com.apps.quantityMeasurementApp;

import java.text.DecimalFormat;

public enum LengthUnit implements IMeasurable{
    FEET(12.0),
    INCHES(1.0),
    YARDS(36.0),
    CENTIMETERS(0.393701);

    private final double conversionFactor;

    LengthUnit(Double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
    public double getConversionFactor(){
        return conversionFactor;
    }
    public double convertToBaseUnit(double value){
        DecimalFormat df =new DecimalFormat("#.##");
        return Double.parseDouble(df.format(value * this.getConversionFactor()));
    }

    public double convertFromBaseUnit(double baseValue){
        DecimalFormat df =new DecimalFormat("#.##");
        return Double.parseDouble(df.format(baseValue / this.getConversionFactor()));
    }
}
