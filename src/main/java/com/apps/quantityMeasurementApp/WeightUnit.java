package com.apps.quantityMeasurementApp;


import java.text.DecimalFormat;

public enum WeightUnit implements IMeasurable{
    MILLIGRAM(0.001),
    GRAM(1.0),
    KILOGRAM(1000.0),
    POUND(453.592),
    TONNE(1_000_000.0);

    private final double conversionFactor;

    WeightUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
    public  double getConversionFactor(){
      return conversionFactor;
    }
    public  double convertToBaseUnit(double value){
        DecimalFormat df =new DecimalFormat("#.##");
        return Double.parseDouble(df.format(value * this.getConversionFactor()));
//    return value* this.getConversionFactor();
    }
    public double convertFromBaseUnit(double baseValue){
        DecimalFormat df =new DecimalFormat("#.##");
        return Math.round((baseValue/ this.conversionFactor) *100.0)/100.0;
    }

    public static void main(String[] args) {
        Double killogram = 40000.0;
        Double gram=WeightUnit.KILOGRAM.convertFromBaseUnit(killogram);
        System.out.println("In Killo ::" + gram);
    }
}
