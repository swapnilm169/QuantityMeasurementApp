package com.apps.quantityMeasurementApp;

import java.util.Scanner;

public class QuantityMeasurementApp {
    public static class Feet{
        private final Double value;

        public Feet(Double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this==obj) return true;
            if(obj == null||getClass()!= obj.getClass())return false;
            Feet feet =(Feet)obj;
            if(this.value== null && feet.value==null){
                return true;
            }
            if(this.value== null || feet.value==null){
                return false;
            }
            return Double.compare(this.value,feet.value)==0;
        }
    }

    public static void main(String[] args) {
        Scanner value_One= new Scanner(System.in);
        System.out.println("Enter First value ::");

        Scanner value_Two= new Scanner(System.in);
        System.out.println("Enter Second value ::");

        QuantityMeasurementApp.Feet scan_val1= new  Feet(Double.parseDouble(value_One.nextLine()));
        QuantityMeasurementApp.Feet scan_val2= new  Feet(Double.parseDouble(value_Two.nextLine())) ;

        boolean result= scan_val1.equals(scan_val2);
        System.out.println(result ? "Equal(true)" :"not-Equal(false)");
    }
}
