package com.apps.quantityMeasurementApp;

public class Length {
    private Double value;
    private LengthUnit unit;

    public enum LengthUnit{
        FEET(12.0),
        INCHES(1.0);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }
        private Double getConversionFactor(){
            return conversionFactor;
        }
    }
    public Length(Double value ,LengthUnit unit){
    this.value=value;
    this.unit=unit;
    }
    private double convertToBaseUnit(){
        return value * unit.getConversionFactor();
    }
    private boolean compare(Length thatlength){
    if(thatlength==null){
        return false;
    }
        return Double.compare(convertToBaseUnit(),thatlength.convertToBaseUnit())==0;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj == null||getClass()!= obj.getClass()) return false;
        Length length = (Length) obj;
        if((this.value== null && length.value==null && this.unit == null && length.unit== null)){
            return true;
        }
        if((this.value == null || length.value==null || this.unit == null || length.unit== null)){
            return false;
        }
        return this.compare(length);
    }
    public static void main(String[] args) {
        Length length1= new Length(1.0, LengthUnit.FEET);
        Length length2= new Length(12.0 ,LengthUnit.INCHES);
        System.out.println("Are Length Equal ? " +length1.equals(length2));
    }
}
