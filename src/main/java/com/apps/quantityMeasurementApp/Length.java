package com.apps.quantityMeasurementApp;

import java.text.DecimalFormat;
import java.util.Objects;

public class Length {
    private Double value;
    private LengthUnit unit;

    public enum LengthUnit{
        FEET(12.0),
        INCHES(1.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }
        private Double getConversionFactor(){
            return conversionFactor;
        }
    }

    @Override
    public String toString() {
        return "Length{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
    public Length(Double value ,LengthUnit unit){
    this.value=value;
    this.unit=unit;
    }
    private double convertToBaseUnit(){
        DecimalFormat df =new DecimalFormat("#.##");
        return Double.parseDouble(df.format(value * unit.getConversionFactor()));
    }
    private boolean compare(Length thatlength){
    if(thatlength==null){
        return false;
    }
        return Double.compare(convertToBaseUnit(),thatlength.convertToBaseUnit())==0;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj == null||getClass()!= obj.getClass())return false;
        Length length = (Length) obj;
        if(this.value== null && length.value==null && this.unit == null && length.unit== null){
            return true;
        }
        if(this.value == null || length.value==null || this.unit == null || length.unit== null){
            return false;
        }
        return this.compare(length);
    }
    public Length convertTo( LengthUnit targetUnit)throws IllegalArgumentException{
        if(!Double.isFinite(this.value)){
            throw new IllegalArgumentException("Value must me Numeric");
        }
        if(Objects.isNull(unit)|| (Objects.isNull(targetUnit))){
            throw new IllegalArgumentException("Value must me Not null");
        }
        DecimalFormat df= new DecimalFormat("#.###");
        double sourceValue= value * unit.getConversionFactor();
        return new Length(Double.parseDouble(df.format(sourceValue/targetUnit.getConversionFactor())),targetUnit);

    }
    public Length add(Length targetLength) throws IllegalArgumentException{
        if (targetLength==null) {
            throw new IllegalArgumentException("Length must have value not Null");
        }
        if(!Double.isFinite(this.value)|| (!Double.isFinite(targetLength.value))){
            throw new IllegalArgumentException("Value must have Numeric");
        }
        Length length=new Length(convertToBaseUnit() + targetLength.convertToBaseUnit(),LengthUnit.INCHES);
        return length.convertTo(this.unit);
    }
    public static void main(String[] args) {
        Length length1= new Length(1.0, LengthUnit.FEET);
        Length length2= new Length(12.0 ,LengthUnit.INCHES);
        System.out.println("Are Length Equal ?:  " +length1.equals(length2));

        Length length3 =new Length(1.0,LengthUnit.YARDS);
        Length length4 = new Length(36.0,LengthUnit.INCHES);
        System.out.println("Are Length Equal ?: " +length3.equals(length4));

        Length length5 =new Length(1.0,LengthUnit.CENTIMETERS);
        Length length6 = new Length(0.393701,LengthUnit.INCHES);
        System.out.println("Are Length Equal ?: " +length5.equals(length6));

        Length l1 = new Length(1.0, LengthUnit.YARDS);
        System.out.println(" Converted value:: "+l1.convertTo(LengthUnit.FEET));

        Length l122 = new Length(1.0, LengthUnit.YARDS);
        Length l12 = new Length(1.0, LengthUnit.YARDS);
        System.out.println("Add ::"+ l122.add(l12) );


    }
}
