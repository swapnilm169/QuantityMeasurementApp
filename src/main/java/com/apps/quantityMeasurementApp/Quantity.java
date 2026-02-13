package com.apps.quantityMeasurementApp;

import java.util.Objects;

public class Quantity <U extends  IMeasurable>{
    private  Double value;
    private U unit;

    public U getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    public Quantity(Double value, U unit){

    }

    public Quantity(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
    private boolean compare(Quantity<U> quantity){
        if(quantity==null){
            return false;
        }
        return this.compare(quantity);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj == null||getClass()!= obj.getClass())return false;
        Quantity<?> quantity = (Quantity<U>) obj;
        if(this.value== null && quantity.value==null && this.unit == null && quantity.unit== null){
            return true;
        }
        if(this.value == null || quantity.value==null || this.unit == null || quantity.unit== null){
            return false;
        }
        return this.compare((Quantity<U>) quantity);
    }

    public <U extends IMeasurable> double convertTo(U targetUnit){
       if(Objects.isNull(targetUnit)){
            throw new IllegalArgumentException("Value must me Not null");
        }
        return targetUnit.convertToBaseUnit(this.value);
    }

    public Quantity<U> add(Quantity<U> others){
        if (others==null) {
            throw new IllegalArgumentException("others must have value not Null");
        }
        Double baseValue =unit.convertToBaseUnit(value) + others.unit.convertToBaseUnit(others.getValue());
        return new Quantity<> (unit.convertToBaseUnit(baseValue),unit);
    }

    public Quantity<U> add(Quantity<U> others,U targetUnit){
        if (others==null) {
            throw new IllegalArgumentException("Value must have value not Null");
        }
        Double convertValue= unit.convertToBaseUnit(others.value) + targetUnit.convertToBaseUnit(others.getValue());
        return new Quantity<>(unit.convertFromBaseUnit(convertValue),targetUnit);
    }

    public static void main(String[] args) {
        System.out.println("All Done");
    }
}
