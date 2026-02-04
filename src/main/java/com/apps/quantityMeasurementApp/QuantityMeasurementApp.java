package com.apps.quantityMeasurementApp;

public class QuantityMeasurementApp {
    public static class Feet {
        private final Double value;

        public Feet(Double value) {
            this.value = value;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Feet feet = (Feet) obj;
            if (this.value == null && feet.value == null) {
                return true;
            }
            if (this.value == null || feet.value == null) {
                return false;
            }
            return Double.compare(this.value, feet.value) == 0;
        }
    }

    public static class Inches {
        private final Double value;

        public Inches(Double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Inches inches = (Inches) obj;
            if (this.value == null && inches.value == null) {
                return true;
            }
            if (this.value == null || inches.value == null) {
                return false;
            }
            return Double.compare(this.value, inches.value) == 0;
        }
    }

    public static void demonstrateFeetEquality() {
        Feet feet_first_Val = new Feet(1.0d);
        Inches inches_first_Val = new Inches(12.0d);

        Double converted = convertInchedToFeet(inches_first_Val);

        boolean result_feet = feet_first_Val.equals(new Feet(converted));
        System.out.println(result_feet ? " Feet ::Equal(true)" : " Feet ::: not-Equal(false)");
    }

    private static double convertInchedToFeet(Inches inchesConverted) {
        return inchesConverted.value / 12;
    }

    public static void demonstrateInchesEquality() {
        QuantityMeasurementApp.Inches inches_first_Val = new QuantityMeasurementApp.Inches(12.0);
        QuantityMeasurementApp.Inches inches_second_Val = new QuantityMeasurementApp.Inches(12.0);

        boolean result_Inches = inches_first_Val.equals(inches_second_Val);
        System.out.println(result_Inches ? "Inches :: Equal(true)" : "Inches:: not-Equal(false)");
    }

    public static void demonstrateFeetInchesComparison() {
        Length length1 = new Length(1.0, Length.LengthUnit.FEET);
        Length length2 = new Length(12.0, Length.LengthUnit.INCHES);

        boolean result = demonstrateLengthEquality(length1, length2);
        System.out.println(result ? "Inches :: Equal(true)" : "Inches:: not-Equal(false)");
    }

    public static boolean demonstrateLengthEquality(Length length1, Length length2) {
        return length1.equals(length2);
    }

    public static boolean demonstrateLengthComparison(Double first_value, Length.LengthUnit first_unit,
                                                      Double second_value, Length.LengthUnit second_unit) {
        Length length1 = new Length(first_value, first_unit);
        Length length2 = new Length(second_value, second_unit);
        return length1.equals(length2);
    }
    public static Length demonstrateLengthCoversion( Double value, Length.LengthUnit fromUnit,Length.LengthUnit toUnit) throws IllegalArgumentException{
        Length length= new Length(value,fromUnit);
        return length.convertTo(toUnit);
    }
    public static Length demonstrateLengthCoversion( Length fromLength,Length.LengthUnit toUnit){
        return fromLength.convertTo(toUnit);
    }
//    public static Length demonstrateLengthComparison(Length.LengthUnit fromUnit ,Length.LengthUnit toUnit){
//        Double v = (double) fromUnit.compareTo(toUnit);
//        return  new Length(v,toUnit);
//    }
    public static Length demonstrateLengthAddition(Length length1,Length length2){
        return length1.add(length2);
    }

    public static void main(String[] args) {
        /*Feet To Inches*/
        demonstrateLengthComparison(1.0, Length.LengthUnit.FEET,
                12.0, Length.LengthUnit.INCHES);
        System.out.println(demonstrateLengthComparison(1.0, Length.LengthUnit.FEET,
                12.0, Length.LengthUnit.INCHES)
                ? " Equal(true) " : "not-Equal(false)");

        /*Yards To Inches*/
        demonstrateLengthComparison(1.0, Length.LengthUnit.YARDS,
                36.0, Length.LengthUnit.INCHES);
        System.out.println(demonstrateLengthComparison(1.0, Length.LengthUnit.YARDS,
                36.0, Length.LengthUnit.INCHES)
                ? "Equal(true)" : "not-Equal(false)");

        /*CENTIMETERS To Inches*/
        demonstrateLengthComparison(100.0, Length.LengthUnit.CENTIMETERS,
                39.3701, Length.LengthUnit.INCHES);
        System.out.println(demonstrateLengthComparison(100.0, Length.LengthUnit.CENTIMETERS,
                39.3701, Length.LengthUnit.INCHES)
                ? "Equal(true)" : "not-Equal(false)");

        /*Feet To Yards*/
        demonstrateLengthComparison(3.0, Length.LengthUnit.FEET,
                1.0, Length.LengthUnit.YARDS);
        System.out.println(demonstrateLengthComparison(3.0, Length.LengthUnit.FEET,
                1.0, Length.LengthUnit.YARDS)
                ? "Equal(true)" : "not-Equal(false)");

        /*CENTIMETERS To Feet*/
        demonstrateLengthComparison(30.48, Length.LengthUnit.CENTIMETERS,
                1.0, Length.LengthUnit.FEET);
        System.out.println(demonstrateLengthComparison(30.48, Length.LengthUnit.CENTIMETERS,
                1.0, Length.LengthUnit.FEET)
                ? "Equal(true)" : "not-Equal(false)");
//        demonstrateLengthComparison()
        Length l1= new Length(1.0 , Length.LengthUnit.YARDS);
        System.out.println( demonstrateLengthCoversion(1.0,Length.LengthUnit.INCHES, Length.LengthUnit.FEET));

        Length l8= new Length(1.0 , Length.LengthUnit.YARDS);
        Length l9= new Length(3.0 , Length.LengthUnit.FEET);
    }
}
