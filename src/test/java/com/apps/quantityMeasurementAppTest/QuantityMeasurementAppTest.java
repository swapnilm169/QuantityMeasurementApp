package com.apps.quantityMeasurementAppTest;

import com.apps.quantityMeasurementApp.Length;
import com.apps.quantityMeasurementApp.QuantityMeasurementApp;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityMeasurementAppTest {
    @Test
    public void testFeetEquality_SameValue(){
        QuantityMeasurementApp.Feet feet_value_1 = new QuantityMeasurementApp.Feet( 10d);
        QuantityMeasurementApp.Feet feet_value_2 = new QuantityMeasurementApp.Feet(10d);
        var result= feet_value_1.equals(feet_value_2);
        assert (result);
    }
    @Test
    public void testFeetEquality_DifferentValue(){
        QuantityMeasurementApp.Feet feet_value_1 = new QuantityMeasurementApp.Feet(10d);
        QuantityMeasurementApp.Feet feet_value_2 = new QuantityMeasurementApp.Feet(11d);
        var result= feet_value_1.equals(feet_value_2);
        assertFalse(result);
    }
    @Test
    public void testFeetEquality_NullComparison_1ValueNull(){
        QuantityMeasurementApp.Feet feet_value_1 = new QuantityMeasurementApp.Feet(null);
        QuantityMeasurementApp.Feet feet_value_2 = new QuantityMeasurementApp.Feet(10d);
        var result= feet_value_1.equals(feet_value_2);
        assertFalse(result);
    }
    @Test
    public void testFeetEquality_NullComparison_2ValueNull(){
        QuantityMeasurementApp.Feet feet_value_1 = new QuantityMeasurementApp.Feet(10d);
        QuantityMeasurementApp.Feet feet_value_2 = new QuantityMeasurementApp.Feet(null);
        var result= feet_value_1.equals(feet_value_2);
        assertFalse(result);
    }
    @Test
    public void testFeetEquality_NullComparisonAllValueNull(){
        QuantityMeasurementApp.Feet feet_value_1 = new QuantityMeasurementApp.Feet(null);
        QuantityMeasurementApp.Feet feet_value_2 = new QuantityMeasurementApp.Feet(null);
        var result= feet_value_1.equals(feet_value_2);
        assertFalse(result);
    }

    @Test
    public void testFeetEquality_SameReference(){
        QuantityMeasurementApp.Feet feet_value_1 = new QuantityMeasurementApp.Feet(10d);
        QuantityMeasurementApp.Feet feet_value_null = feet_value_1;
        var result= feet_value_1.equals(feet_value_null);
        assertTrue(result);
    }
    @Test
    public void testFeetEquality_DifferentClass(){
        QuantityMeasurementApp.Feet feet_value_1 = new QuantityMeasurementApp.Feet(10d);
        Object obj="D1";
        assertThrows(ClassCastException.class, () -> new QuantityMeasurementApp.Feet((Double) obj));
    }

    /*For Inches UC2*/
    @Test
    public void testInchesEquality_SameValue(){
        QuantityMeasurementApp.Inches inches_value_1 = new QuantityMeasurementApp.Inches( 10d);
        QuantityMeasurementApp.Inches inches_value_2 = new QuantityMeasurementApp.Inches(10d);
        var result= inches_value_1.equals(inches_value_2);
        assert (result);
    }
    @Test
    public void testInchesEquality_DifferentValue(){
        QuantityMeasurementApp.Inches inches_value_1 = new QuantityMeasurementApp.Inches(10d);
        QuantityMeasurementApp.Inches inches_value_2 = new QuantityMeasurementApp.Inches(11d);
        var result= inches_value_1.equals(inches_value_2);
        assertFalse(result);
    }
    @Test
    public void testInchesEquality_NullComparison_1ValueNull(){
        QuantityMeasurementApp.Inches inches_value_1 = new QuantityMeasurementApp.Inches(null);
        QuantityMeasurementApp.Inches inches_value_2 = new QuantityMeasurementApp.Inches(10d);
        var result= inches_value_1.equals(inches_value_2);
        assertFalse(result);
    }
    @Test
    public void testInchesEquality_NullComparison_2ValueNull(){
        QuantityMeasurementApp.Inches inches_value_1 = new QuantityMeasurementApp.Inches(10d);
        QuantityMeasurementApp.Inches inches_value_2 = new QuantityMeasurementApp.Inches(null);
        var result= inches_value_1.equals(inches_value_2);
        assertFalse(result);
    }
    @Test
    public void testInchesEquality_NullComparisonAllValueNull(){
        QuantityMeasurementApp.Inches inches_value_1 = new QuantityMeasurementApp.Inches(null);
        QuantityMeasurementApp.Inches inches_value_2 = new QuantityMeasurementApp.Inches(null);
        var result= inches_value_1.equals(inches_value_2);
        assertTrue(result);
    }

    @Test
    public void testInchesEquality_SameReference(){
        QuantityMeasurementApp.Inches inches_value_1 = new QuantityMeasurementApp.Inches(10d);
        QuantityMeasurementApp.Inches inches_value_null = inches_value_1;
        var result= inches_value_1.equals(inches_value_null);
        assertTrue(result);
    }
    @Test
    public void testInchesEquality_DifferentClass(){
        QuantityMeasurementApp.Inches inches_value_1 = new QuantityMeasurementApp.Inches(10d);
        Object obj="D1";
        assertThrows(ClassCastException.class, () -> new QuantityMeasurementApp.Inches((Double) obj));
    }

    /*For UC3 Test Code*/
    @Test
    public void testEquality_FeetToFeet_SameValue(){
        Length length1 = new Length(12.0 , Length.LengthUnit.FEET);
        Length length2 = new Length( 12.0, Length.LengthUnit.FEET);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_InchToInch_SameValue(){
        Length length1 = new Length(12.0 , Length.LengthUnit.INCHES);
        Length length2 = new Length( 12.0, Length.LengthUnit.INCHES);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_NullComparison(){
        Length length1 = new Length(null, null);
        Length length2 = new Length( null, null);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_FirstVal_NullComparison(){
        Length length1 = new Length(null, Length.LengthUnit.INCHES);
        Length length2 = new Length( null, Length.LengthUnit.INCHES);
        assertFalse(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_SecondVal_NullComparison(){
        Length length1 = new Length(12.9d, null);
        Length length2 = new Length( 12.9d, null);
        assertFalse(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_InchToFeet_EquivalentValue(){
        Length length1 = new Length(12.0d, Length.LengthUnit.INCHES);
        Length length2 = new Length( 1.0d, Length.LengthUnit.FEET);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_FeetToFeet_DifferentValue(){
        Length length1 = new Length(13.0 , Length.LengthUnit.FEET);
        Length length2 = new Length( 12.0, Length.LengthUnit.FEET);
        assertFalse(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }

    @Test
    public void testEquality_InchToInch_DifferentValue(){
        Length length1 = new Length(13.0 , Length.LengthUnit.INCHES);
        Length length2 = new Length( 12.0, Length.LengthUnit.INCHES);
        assertFalse(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_InvalidUnit(){
        Length length1 = new Length(13.0 , Length.LengthUnit.INCHES);
        assertThrows(Exception.class,()->QuantityMeasurementApp.demonstrateLengthEquality(length1, (Length) new Object()));
    }
}
