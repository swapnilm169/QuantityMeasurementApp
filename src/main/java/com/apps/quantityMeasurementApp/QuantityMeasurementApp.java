package com.apps.quantityMeasurementApp;

public class QuantityMeasurementApp {
    public static class Feet {
        private final Double value;

        public Feet(Double value) {
            this.value = value;
        }
        @Override
        public boolean equals(Object obj) {
            if (this==obj) return true;
            if(obj == null||getClass()!= obj.getClass())return false;
            Feet feet =(Feet)obj;
            if(this.value== null || feet.value==null){
                return false;
            }
            return Double.compare(this.value,feet.value)==0;
        }
    }
        public static class Inches {
            private final Double value;

            public Inches(Double value) {
                this.value = value;
            }
            @Override
            public boolean equals(Object obj) {
                if (this==obj) return true;
                if(obj == null||getClass()!= obj.getClass())return false;
                Inches inches =(Inches)obj;
                if(this.value == null && inches.value==null){
                    return true;
                }
                if(this.value == null || inches.value==null){
                    return false;
                }
                return Double.compare(this.value,inches.value)==0;
            }
        }
        public  static void demonstrateFeetEquality(){
            Feet feet_first_Val= new Feet(1.0d);
            Inches inches_first_Val=new  Inches(12.0d);

            Double converted =  convertInchedToFeet(inches_first_Val);

            boolean result_feet= feet_first_Val.equals(new Feet(converted));
            System.out.println(result_feet ? " Feet ::Equal(true)" :" Feet ::: not-Equal(false)");
        }

        private static double convertInchedToFeet(Inches inchesConverted){
            return inchesConverted.value / 12;
        }

        public  static void demonstrateInchesEquality(){
            QuantityMeasurementApp.Inches inches_first_Val= new QuantityMeasurementApp.Inches(12.0d);
            QuantityMeasurementApp.Inches inches_second_Val=new  QuantityMeasurementApp.Inches(12.0d);

            boolean result_Inches= inches_first_Val.equals(inches_second_Val);
            System.out.println(result_Inches ? "Inches :: Equal(true)" :"Inches:: not-Equal(false)");
        }
        public static void demonstrateFeetInchesComparison(){
            Length length1 = new Length(1.0d , Length.LengthUnit.FEET);
            Length length2 = new Length( 12.0d, Length.LengthUnit.INCHES);

            boolean result= demonstrateLengthEquality(length1,length2);
            System.out.println(result ? "Inches :: Equal(true)" :"Inches:: not-Equal(false)");
        }

    public static boolean demonstrateLengthEquality(Length length1, Length length2) {
    return length1.equals(length2);
    }

    public static void main(String[] args) {
            demonstrateFeetEquality();
            demonstrateInchesEquality();
            demonstrateFeetInchesComparison();
    }
}
