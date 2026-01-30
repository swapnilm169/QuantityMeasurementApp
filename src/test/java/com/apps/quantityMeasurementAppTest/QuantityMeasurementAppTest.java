package com.apps.quantityMeasurementAppTest;

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

    /*For Inches*/
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
        assertFalse(result);
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
}
