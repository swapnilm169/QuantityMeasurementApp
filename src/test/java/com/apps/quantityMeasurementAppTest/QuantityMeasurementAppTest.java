package com.apps.quantityMeasurementAppTest;

import com.apps.quantityMeasurementApp.Length;
import com.apps.quantityMeasurementApp.QuantityMeasurementApp;
import org.junit.Test;

import static com.apps.quantityMeasurementApp.QuantityMeasurementApp.*;
import static org.junit.jupiter.api.Assertions.*;

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
        assertTrue(result);
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
    /*Test Case UC4*/
    @Test
    public void testEquality_YardToYard_SameValue (){
        Length length1 = new Length(1.0d, Length.LengthUnit.YARDS);
        Length length2 = new Length( 1.0d, Length.LengthUnit.YARDS);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_YardToYard_DifferentValue(){
        Length length1 = new Length(13.0 , Length.LengthUnit.YARDS);
        Length length2 = new Length( 12.0, Length.LengthUnit.YARDS);
        assertFalse(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }

    @Test
    public void testEquality_YardToFeet_EquivalentValue(){
        Length length1 = new Length(1.0 , Length.LengthUnit.YARDS);
        Length length2 = new Length( 3.0, Length.LengthUnit.FEET);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_FeetToYard_EquivalentValue(){
        Length length1 = new Length(1.0 , Length.LengthUnit.YARDS);
        Length length2 = new Length( 3.0, Length.LengthUnit.FEET);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_YardToInches_EquivalentValue(){
        Length length1 = new Length(1.0 , Length.LengthUnit.YARDS);
        Length length2 = new Length( 36.0, Length.LengthUnit.INCHES);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_InchesToYard_EquivalentValue(){
        Length length1 = new Length(36.0 , Length.LengthUnit.INCHES);
        Length length2 = new Length( 1.0, Length.LengthUnit.YARDS);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_YardToFeet_NonEquivalentValue(){
        Length length1 = new Length(1.0 , Length.LengthUnit.YARDS);
        Length length2 = new Length( 2.0, Length.LengthUnit.FEET);
        assertFalse(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_CentimeterToInches_EquivalentValue(){
        Length length1 = new Length(1.0 , Length.LengthUnit.CENTIMETERS);
        Length length2 = new Length( 0.393701, Length.LengthUnit.INCHES);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_CentimeterToFeet_NonEquivalentValue(){
        Length length1 = new Length(1.0 , Length.LengthUnit.YARDS);
        Length length2 = new Length( 1.0, Length.LengthUnit.FEET);
        assertFalse(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_MultiUnit_TransitiveProperty(){
        Length length1 = new Length(1.0 , Length.LengthUnit.YARDS);
        Length length2 = new Length( 3.0, Length.LengthUnit.FEET);
        Length length4 = new Length( 36.0, Length.LengthUnit.INCHES);

        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length2,length4));
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length4));
    }

    @Test
    public void testEquality_YardWithNullUnit(){
        Length length1 = new Length(null , Length.LengthUnit.YARDS);
        assertThrows(Exception.class,()->QuantityMeasurementApp.demonstrateLengthEquality(length1, (Length) new Object()));
    }
    @Test
    public void testEquality_YardWithSameReference(){
        Length length1 = new Length(10.0 , Length.LengthUnit.YARDS);
        Length length2 = length1;
        var result= length1.equals(length2);
        assertTrue(result);
    }
    @Test
    public void testEquality_YardWithNullComparison(){
        Length length1 = new Length(10.0 , Length.LengthUnit.YARDS);
        Length length2 = new Length(null , Length.LengthUnit.YARDS);
        var result= length1.equals(length2);
        assertFalse(result);
    }
    @Test
    public void testEquality_CentimetersWithNullUnit(){
        Length length1 = new Length(null , Length.LengthUnit.CENTIMETERS);
        assertThrows(Exception.class,()->QuantityMeasurementApp.demonstrateLengthEquality(length1, (Length) new Object()));
    }
    @Test
    public void testEquality_CentimetersWithSameReference(){
        Length length1 = new Length(10.0 , Length.LengthUnit.CENTIMETERS);
        Length length2 = length1;
        var result= length1.equals(length2);
        assertTrue(result);
    }
    @Test
    public void testEquality_CentimetersWithNullComparison(){
        Length length1 = new Length(null , Length.LengthUnit.CENTIMETERS);
        Length length2 = new Length(10.0 , Length.LengthUnit.CENTIMETERS);
        var result= length1.equals(length2);
        assertFalse(result);
    }
    @Test
    public void testEquality_AllUnit_ComplexScenario(){
        Length length1 = new Length(2.0 , Length.LengthUnit.YARDS);
        Length length2 = new Length(6.0 , Length.LengthUnit.FEET);
        Length length3 = new Length(6.0 , Length.LengthUnit.FEET);
        Length length4 = new Length(72.0 , Length.LengthUnit.INCHES);
        assertAll(
                ()->assertEquals(length1,length2),
                ()->assertEquals(length2,length3),
                ()->assertEquals(length3,length4)
        );

    }
    /*UC5 test case*/
    @Test
    public void testConversion_FeetToInches(){
        assertEquals(new Length(12.0 , Length.LengthUnit.INCHES),
                QuantityMeasurementApp.demonstrateLengthCoversion(1.0,Length.LengthUnit.FEET, Length.LengthUnit.INCHES));
    }
    @Test
    public void testConversion_InchesToFeet(){
        assertEquals(new Length(2.0 , Length.LengthUnit.FEET),
                QuantityMeasurementApp.demonstrateLengthCoversion(24.0,Length.LengthUnit.INCHES, Length.LengthUnit.INCHES));

    }
    @Test
    public void testConversion_YardToInches(){
        assertEquals(new Length(36.0 , Length.LengthUnit.INCHES),
                QuantityMeasurementApp.demonstrateLengthCoversion(1.0,Length.LengthUnit.YARDS, Length.LengthUnit.INCHES));

    }
    @Test
    public void testConversion_InchesToYard(){
        assertEquals(new Length(2.0 , Length.LengthUnit.YARDS),
                QuantityMeasurementApp.demonstrateLengthCoversion(72.0,Length.LengthUnit.INCHES, Length.LengthUnit.YARDS));
    }
    @Test
    public void testConversion_CentimeterToInches(){
        assertEquals(new Length(1.0 , Length.LengthUnit.INCHES),
                QuantityMeasurementApp.demonstrateLengthCoversion(2.54,Length.LengthUnit.CENTIMETERS, Length.LengthUnit.INCHES));

    }
    @Test
    public void testConversion_FeetToYard(){
        assertEquals(new Length(2.0 , Length.LengthUnit.YARDS),
                QuantityMeasurementApp.demonstrateLengthCoversion(6.0,Length.LengthUnit.FEET, Length.LengthUnit.YARDS));
    }


    @Test
    public void testConversion_RoundTrip_PreservesValue(){
        Length length = new Length(6.0 , Length.LengthUnit.FEET);
        Length v= length.convertTo(Length.LengthUnit.YARDS);
        assertEquals(length,demonstrateLengthCoversion(v, Length.LengthUnit.YARDS));
    }
    @Test
    public void testConversion_ZeroValue(){
        assertEquals(new Length(0.0 , Length.LengthUnit.YARDS),
                QuantityMeasurementApp.demonstrateLengthCoversion(0.0,Length.LengthUnit.FEET, Length.LengthUnit.YARDS));
    }
    @Test
    public void testConversion_NegativeValue(){
        assertEquals(new Length(2.0 , Length.LengthUnit.YARDS),
                QuantityMeasurementApp.demonstrateLengthCoversion(6.0,Length.LengthUnit.FEET, Length.LengthUnit.YARDS));
    }
    @Test
    public void testConversion_InvalidUnit_ThrowException(){
        assertEquals(new Length(-12.0 , Length.LengthUnit.INCHES),
                QuantityMeasurementApp.demonstrateLengthCoversion(-1.0,Length.LengthUnit.FEET, Length.LengthUnit.INCHES));
    }
    @Test
    public void testConversion_NaNOrInfinite_ThrowException(){
        assertThrows(Exception.class,() ->QuantityMeasurementApp.demonstrateLengthCoversion(Double.NaN,Length.LengthUnit.FEET, Length.LengthUnit.YARDS)) ;
    }
    @Test
    public void testConversion_PrecisionTolerance(){
        assertEquals(new Length(2.54e-6 , Length.LengthUnit.CENTIMETERS),
                QuantityMeasurementApp.demonstrateLengthCoversion(0.000001,Length.LengthUnit.INCHES, Length.LengthUnit.CENTIMETERS));
    }
    /*Test Case UC6*/
    @Test
    public void testAddition_SameUnit_FeetPlusFeet(){
        assertEquals(new Length(3.0 , Length.LengthUnit.FEET),
                demonstrateLengthAddition(new Length(1.0,Length.LengthUnit.FEET),
                        new Length(2.0,Length.LengthUnit.FEET)));
    }
    @Test
    public void testAddition_SameUnit_InchPlusInch(){
        assertEquals(new Length(12.0 , Length.LengthUnit.INCHES),
                demonstrateLengthAddition(new Length(6.0,Length.LengthUnit.INCHES),
                        new Length(6.0,Length.LengthUnit.INCHES)));
    }
    @Test
    public void testAddition_CrossUnit_FeetPlusInch(){
        assertEquals(new Length(2.0 , Length.LengthUnit.FEET),
                demonstrateLengthAddition(new Length(12.0,Length.LengthUnit.INCHES),
                        new Length(1.0,Length.LengthUnit.FEET)));
    }
    @Test
    public void testAddition_CrossUnit_YardToFeet(){
        assertEquals(new Length(2.0 , Length.LengthUnit.YARDS),
                demonstrateLengthAddition(new Length(1.0,Length.LengthUnit.YARDS),
                        new Length(3.0,Length.LengthUnit.FEET)));
    }
    @Test
    public void testAddition_CrossUnit_CentimeterToInch(){
        assertEquals(new Length(5.08 , Length.LengthUnit.CENTIMETERS),
                demonstrateLengthAddition(new Length(2.54,Length.LengthUnit.CENTIMETERS),
                        new Length(1.0,Length.LengthUnit.INCHES)));
    }
    @Test
    public void testAddition_Commutativity(){
        Length length1 = new Length(1.0 , Length.LengthUnit.FEET);
        Length length2 = new Length( 12.0, Length.LengthUnit.INCHES);
        assertEquals(demonstrateLengthAddition(length1,length2),
                demonstrateLengthAddition(length2,length1));
    }
    @Test
    public void testAddition_WithZero(){
        assertEquals(new Length(5.0 , Length.LengthUnit.FEET),
                demonstrateLengthAddition(new Length(5.0,Length.LengthUnit.FEET),
                        new Length(0.0,Length.LengthUnit.INCHES)));
    }
    @Test
    public void testAddition_NegativeValue(){
        assertEquals(new Length(3.0 , Length.LengthUnit.FEET),
                demonstrateLengthAddition(new Length(5.0,Length.LengthUnit.FEET),
                        new Length(-2.0,Length.LengthUnit.FEET)));
    }
    @Test
    public void testAddition_NullSecondOperand(){
        assertThrows(Exception.class,()-> demonstrateLengthAddition
                (new Length(3.0 , Length.LengthUnit.FEET),null));
    }

    @Test
    public void testAddition_LargeValues(){
        assertEquals(new Length(2e6 , Length.LengthUnit.FEET),
                demonstrateLengthAddition(new Length(1e6,Length.LengthUnit.FEET),
                        new Length(1e6,Length.LengthUnit.FEET)));
    }
    @Test
    public void testAddition_SmallValues(){
        assertEquals(new Length(0.003 , Length.LengthUnit.FEET),
                demonstrateLengthAddition(new Length(0.001,Length.LengthUnit.FEET),
                        new Length(0.002,Length.LengthUnit.FEET)));
    }
    /*Test Case UC7*/
    @Test
    public void testAddition_ExplicitTargetUnit_Feet(){
        assertEquals(new Length(2.0 , Length.LengthUnit.FEET),
                demonstrateLengthAddition(new Length(1.0,Length.LengthUnit.FEET),
                        new Length(12.0,Length.LengthUnit.INCHES),Length.LengthUnit.FEET));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_Inches(){
        assertEquals(new Length(24.0 , Length.LengthUnit.INCHES),
                demonstrateLengthAddition(new Length(1.0,Length.LengthUnit.FEET),
                        new Length(12.0,Length.LengthUnit.INCHES),Length.LengthUnit.INCHES));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_Yards(){
        assertEquals(new Length(0.667 , Length.LengthUnit.YARDS),
                demonstrateLengthAddition(new Length(1.0,Length.LengthUnit.FEET),
                        new Length(12.0,Length.LengthUnit.INCHES),Length.LengthUnit.YARDS));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_Centimeter(){
        assertEquals(new Length(5.08 , Length.LengthUnit.CENTIMETERS),
                demonstrateLengthAddition(new Length(1.0,Length.LengthUnit.INCHES),
                        new Length(1.0,Length.LengthUnit.INCHES),Length.LengthUnit.CENTIMETERS));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_SameAsFirstOperand(){
        assertEquals(new Length(3.0 , Length.LengthUnit.YARDS),
                demonstrateLengthAddition(new Length(2.0,Length.LengthUnit.YARDS),
                        new Length(3.0,Length.LengthUnit.FEET),Length.LengthUnit.YARDS));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_SameAsSecondOperand(){
        assertEquals(new Length(9.0 , Length.LengthUnit.FEET),
                demonstrateLengthAddition(new Length(2.0,Length.LengthUnit.YARDS),
                        new Length(3.0,Length.LengthUnit.FEET),Length.LengthUnit.FEET));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_Commutativity(){
        Length length1 = demonstrateLengthAddition(new Length(2.0,Length.LengthUnit.FEET),new Length(3.0,Length.LengthUnit.INCHES),Length.LengthUnit.FEET);
        Length length2 = demonstrateLengthAddition(new Length(3.0,Length.LengthUnit.INCHES),new Length(2.0,Length.LengthUnit.FEET),Length.LengthUnit.FEET);
        assertEquals(length1,length2);
    }
    @Test
    public void testAddition_ExplicitTargetUnit_WithZero(){
        assertEquals(new Length(1.667 , Length.LengthUnit.YARDS),
                demonstrateLengthAddition(new Length(5.0,Length.LengthUnit.FEET),
                        new Length(0.0,Length.LengthUnit.INCHES),Length.LengthUnit.YARDS));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_NegativeZero(){
        assertEquals(new Length(36.0 , Length.LengthUnit.INCHES),
                demonstrateLengthAddition(new Length(5.0,Length.LengthUnit.FEET),
                        new Length(-2.0,Length.LengthUnit.FEET),Length.LengthUnit.INCHES));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_NullTargetUnit(){
            assertThrows(Exception.class,() ->demonstrateLengthAddition(new Length(2.0,Length.LengthUnit.YARDS),new Length(3.0,Length.LengthUnit.FEET), null)) ;
        }
    @Test
    public void testAddition_ExplicitTargetUnit_LargeToSmall(){
        assertEquals(new Length(18000.0 , Length.LengthUnit.INCHES),
                demonstrateLengthAddition(new Length(1000.0,Length.LengthUnit.FEET),
                        new Length(500.0,Length.LengthUnit.FEET),Length.LengthUnit.INCHES));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_SmallToLarge(){
        assertEquals(new Length(0.667 , Length.LengthUnit.YARDS),
                demonstrateLengthAddition(new Length(12.0,Length.LengthUnit.INCHES),
                        new Length(12.0,Length.LengthUnit.INCHES),Length.LengthUnit.YARDS));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_AllUnitCombination(){
//        assertEquals(new Length(1.334 , Length.LengthUnit.YARDS),
//                demonstrateLengthAddition(new Length(12.0,Length.LengthUnit.INCHES),
//                        new Length(12.0,Length.LengthUnit.INCHES),Length.LengthUnit.YARDS),
//                new Length(12.0,Length.LengthUnit.INCHES),
//                demonstrateLengthAddition((new Length(12.0,Length.LengthUnit.INCHES),Length.LengthUnit.YARDS),Length.LengthUnit.YARDS);
    }
}
