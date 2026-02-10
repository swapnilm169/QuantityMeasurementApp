package com.apps.quantityMeasurementApp;

import java.text.DecimalFormat;
import java.util.Objects;

public class Weight {
    private Double value;
    private WeightUnit unit;

    public Weight(double value, WeightUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public WeightUnit getUnit() {
        return unit;
    }


    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Weight weight = (Weight) object;
        return Double.compare(getValue(), weight.getValue()) == 0 && getUnit() == weight.getUnit();
    }

    public Weight convertTo(WeightUnit targetUnit) throws IllegalArgumentException{

        if(!Double.isFinite(this.value)){
            throw new IllegalArgumentException("Value must me Numeric");
        }
        if(Objects.isNull(unit)|| (Objects.isNull(targetUnit))){
            throw new IllegalArgumentException("Value must me Not null");
        }
        DecimalFormat df= new DecimalFormat("#.###");
        double sourceValue= value * unit.getConversionFactor();
        return new Weight(Double.parseDouble(df.format(sourceValue/targetUnit.getConversionFactor())),targetUnit);
    }
    public Weight add (Weight thatWeight) throws IllegalArgumentException{
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
        return  addAndConvert(targetWeight,targetUnit);
    }

    public double convertToBaseUnit(){
        return  unit.convertToBaseUnit(value);
    }
    private boolean compare(Weight thatWeight){
        if(thatWeight==null){
            return false;
        }
        return Double.compare(convertToBaseUnit(),thatWeight.convertToBaseUnit())==0;
    }
    private Weight addAndConvert(Weight targetWeight, WeightUnit targetUnit){
        Weight weight = new Weight(convertToBaseUnit() + targetWeight.convertToBaseUnit(), WeightUnit.GRAM);
        return  weight.convertFromBaseToTargetUnit(weight.value,targetUnit);
    }

    private Weight convertFromBaseToTargetUnit(double value, WeightUnit targetUnit) {
        return new Weight(targetUnit.convertFromBaseUnit(value),targetUnit);
    }

}
