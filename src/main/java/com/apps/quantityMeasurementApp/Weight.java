package com.apps.quantityMeasurementApp;
import java.util.Objects;

public class Weight {
    private final Double value;
    private final WeightUnit unit;

    public Weight(Double value, WeightUnit unit) {
        if(Objects.isNull(value)|| Objects.isNull(unit)){
            throw new IllegalArgumentException("null value is not allowed");
        }
        if(Double.isNaN(value)){
            throw new IllegalArgumentException("null Unit is not allowed");
        }
        this.value = value;
        this.unit = unit;
    }

    private boolean compare(Weight thatWeight){
        if(thatWeight==null){
            return false;
        }
        return Double.compare(convertToBaseUnit(),thatWeight.convertToBaseUnit())==0;
    }

    public Double convertToBaseUnit(){
        return  unit.convertToBaseUnit(value);
    }

    public Weight convertTo(WeightUnit targetUnit) throws IllegalArgumentException{
        if(!Double.isFinite(this.value)){
            throw new IllegalArgumentException("Value must me Numeric");
        }
        if(Objects.isNull(unit)|| (Objects.isNull(targetUnit))){
            throw new IllegalArgumentException("Value must me Not null");
        }
        Double sourceValue= value * unit.getConversionFactor();
        return convertFromBaseToTargetUnit(sourceValue,targetUnit);
    }
    @Override
    public String toString() {
        return "Weight{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }

    public Double getValue() {
        return value;
    }
    public WeightUnit getUnit() {
        return unit;
    }

    public Weight add (Weight thatWeight){
        if (thatWeight==null) {
            throw new IllegalArgumentException("Length must have value not Null");
        }
        if(Objects.isNull(thatWeight.unit)|| Objects.isNull(this.unit)){
            throw new IllegalArgumentException("unit is not Null");
        }
        if(!Double.isFinite(this.value)|| !Double.isFinite(thatWeight.value)){
            throw new IllegalArgumentException("Value must have Numeric");
        }
        Weight weight=new Weight(convertToBaseUnit() + thatWeight.convertToBaseUnit(),WeightUnit.GRAM);
        return weight.convertTo(this.unit);
    }

    public Weight add (Weight targetWeight, WeightUnit targetUnit){
        if (targetWeight==null) {
            throw new IllegalArgumentException("targetLength must have value not Null");
        }if (Objects.isNull(this.value) || Objects.isNull(targetWeight.unit)) {
            throw new IllegalArgumentException("Length's must have value not Null");
        }
        if(!Double.isFinite(this.value) || (!Double.isFinite(targetWeight.value))){
            throw new IllegalArgumentException("length  and targetLength must have Finite");
        }
        return addAndConvert(targetWeight,targetUnit);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj == null||getClass()!= obj.getClass())return false;
        Weight weight = (Weight) obj;
        if(this.value== null && weight.value==null && this.unit == null && weight.unit== null){
            return true;
        }
        if(this.value == null || weight.value==null || this.unit == null || weight.unit== null){
            return false;
        }
        return this.compare(weight);
    }
    private Weight addAndConvert(Weight targetWeight, WeightUnit targetUnit){
        Weight weight = new Weight(convertToBaseUnit() + targetWeight.convertToBaseUnit(), WeightUnit.GRAM);
        return  weight.convertFromBaseToTargetUnit(weight.value,targetUnit);
    }

    private Weight convertFromBaseToTargetUnit(Double value, WeightUnit targetUnit) {
        return new Weight(targetUnit.convertFromBaseUnit(value),targetUnit);
    }

    public static void main(String[] args) {
        Weight w1= new Weight(1000.0 ,WeightUnit.GRAM);
        System.out.println(""+ w1.convertTo(WeightUnit.KILOGRAM));
//        System.out.println("add" +new Weight(3.0 ,WeightUnit.GRAM).add(new Weight(2.0 ,WeightUnit.KILOGRAM)));
    }
}
