package com.apps.quantityMeasurementApp;

import java.text.DecimalFormat;

public enum LengthUnit {
    FEET(12.0),
    INCHES(1.0),
    YARDS(36.0),
    CENTIMETERS(0.393701);

    private final double conversionFactor;

    LengthUnit(Double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
    public Double getConversionFactor(){
        return conversionFactor;
    }
    public Double convertToBaseUnit(Double value){
        DecimalFormat df =new DecimalFormat("#.##");
        return Double.parseDouble(df.format(value * this.getConversionFactor()));
    }

    public Double convertFromBaseUnit(Double baseValue){
        DecimalFormat df =new DecimalFormat("#.##");
        return Double.parseDouble(df.format(baseValue / this.getConversionFactor()));
    }
}
