package com.apps.quantityMeasurementApp;

import java.util.Objects;

public class Quantity <U extends  IMeasurable>{
    private final Double value;
    private final U unit;

    public U getUnit() {
        return unit;
    }

    public Quantity(Double value, U unit){
    if(Objects.isNull(value)|| (Objects.isNull(unit))){
        throw new IllegalArgumentException("Null value is not allowed");
    }
    if (!Double.isFinite(value)){
        throw new IllegalArgumentException("value must be numeric");
    }
    this.unit=unit;
    this.value=value;
    }
    public Double getValue() {
        return value;
    }
//    public Quantity(Double value) {
//        this.value = value;
//    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
    public <U extends IMeasurable> Quantity<U> convertTo(U targetUnit){
        if(Objects.isNull(targetUnit)){
            throw new IllegalArgumentException("Value must me Not null");
        }
        return new Quantity<>(targetUnit.convertFromBaseUnit(unit.convertToBaseUnit(value)),targetUnit);
    }

    public Quantity<U> add(Quantity<U> others){
        if (others==null) {
            throw new IllegalArgumentException("others must have value not Null");
        }
        Double baseValue =unit.convertToBaseUnit(value) + others.unit.convertToBaseUnit(others.getValue());
        return new Quantity<> (unit.convertFromBaseUnit(baseValue),unit);
    }

    public Quantity<U> add(Quantity<U> others,U targetUnit){
        if (others==null) {
            throw new IllegalArgumentException("Value must have value not Null");
        }
        Double convertValue= unit.convertToBaseUnit(others.value) + targetUnit.convertToBaseUnit(others.getValue());
        return new Quantity<>(unit.convertFromBaseUnit(convertValue),targetUnit);
    }

    private boolean compare(Quantity<U> quantity){
        if(quantity==null){
            return false;
        }
        return Double.compare(unit.convertToBaseUnit(value),quantity.unit.convertToBaseUnit(quantity.value))==0;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj == null||getClass()!= obj.getClass())return false;
        Quantity<U> quantity = (Quantity<U>) obj;
        if(this.value== null && quantity.value==null && this.unit == null && quantity.unit== null){
            return true;
        }
        if(this.value == null || quantity.value==null || this.unit == null || quantity.unit== null){
            return false;
        }
        return this.compare(quantity);
    }
    public static void main(String[] args) {
        System.out.println("All Done");
    }
}
