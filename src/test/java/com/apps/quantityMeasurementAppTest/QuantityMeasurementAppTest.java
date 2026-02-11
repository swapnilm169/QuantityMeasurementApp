package com.apps.quantityMeasurementAppTest;

import com.apps.quantityMeasurementApp.*;
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
        Length length1 = new Length(12.0 , LengthUnit.FEET);
        Length length2 = new Length( 12.0, LengthUnit.FEET);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_InchToInch_SameValue(){
        Length length1 = new Length(12.0 , LengthUnit.INCHES);
        Length length2 = new Length( 12.0, LengthUnit.INCHES);
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
        Length length1 = new Length(null, LengthUnit.INCHES);
        Length length2 = new Length( null, LengthUnit.INCHES);
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
        Length length1 = new Length(12.0d, LengthUnit.INCHES);
        Length length2 = new Length( 1.0d, LengthUnit.FEET);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_FeetToFeet_DifferentValue(){
        Length length1 = new Length(13.0 ,LengthUnit.FEET);
        Length length2 = new Length( 12.0,LengthUnit.FEET);
        assertFalse(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }

    @Test
    public void testEquality_InchToInch_DifferentValue(){
        Length length1 = new Length(13.0 ,LengthUnit.INCHES);
        Length length2 = new Length( 12.0,LengthUnit.INCHES);
        assertFalse(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_InvalidUnit(){
        Length length1 = new Length(13.0 , LengthUnit.INCHES);
        assertThrows(Exception.class,()->QuantityMeasurementApp.demonstrateLengthEquality(length1, (Length) new Object()));
    }
    /*Test Case UC4*/
    @Test
    public void testEquality_YardToYard_SameValue (){
        Length length1 = new Length(1.0d,LengthUnit.YARDS);
        Length length2 = new Length( 1.0d,LengthUnit.YARDS);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_YardToYard_DifferentValue(){
        Length length1 = new Length(13.0 ,LengthUnit.YARDS);
        Length length2 = new Length( 12.0,LengthUnit.YARDS);
        assertFalse(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }

    @Test
    public void testEquality_YardToFeet_EquivalentValue(){
        Length length1 = new Length(1.0 ,LengthUnit.YARDS);
        Length length2 = new Length( 3.0,LengthUnit.FEET);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_FeetToYard_EquivalentValue(){
        Length length1 = new Length(1.0 ,LengthUnit.YARDS);
        Length length2 = new Length( 3.0,LengthUnit.FEET);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_YardToInches_EquivalentValue(){
        Length length1 = new Length(1.0 ,LengthUnit.YARDS);
        Length length2 = new Length( 36.0,LengthUnit.INCHES);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_InchesToYard_EquivalentValue(){
        Length length1 = new Length(36.0 ,LengthUnit.INCHES);
        Length length2 = new Length( 1.0,LengthUnit.YARDS);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_YardToFeet_NonEquivalentValue(){
        Length length1 = new Length(1.0 ,LengthUnit.YARDS);
        Length length2 = new Length( 2.0,LengthUnit.FEET);
        assertFalse(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_CentimeterToInches_EquivalentValue(){
        Length length1 = new Length(1.0 ,LengthUnit.CENTIMETERS);
        Length length2 = new Length( 0.393701,LengthUnit.INCHES);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_CentimeterToFeet_NonEquivalentValue(){
        Length length1 = new Length(1.0 ,LengthUnit.YARDS);
        Length length2 = new Length( 1.0,LengthUnit.FEET);
        assertFalse(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
    }
    @Test
    public void testEquality_MultiUnit_TransitiveProperty(){
        Length length1 = new Length(1.0 ,LengthUnit.YARDS);
        Length length2 = new Length( 3.0,LengthUnit.FEET);
        Length length4 = new Length( 36.0,LengthUnit.INCHES);

        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length2));
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length2,length4));
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(length1,length4));
    }

    @Test
    public void testEquality_YardWithNullUnit(){
        Length length1 = new Length(null , LengthUnit.YARDS);
        assertThrows(Exception.class,()->QuantityMeasurementApp.demonstrateLengthEquality(length1, (Length) new Object()));
    }
    @Test
    public void testEquality_YardWithSameReference(){
        Length length1 = new Length(10.0 , LengthUnit.YARDS);
        Length length2 = length1;
        var result= length1.equals(length2);
        assertTrue(result);
    }
    @Test
    public void testEquality_YardWithNullComparison(){
        Length length1 = new Length(10.0 , LengthUnit.YARDS);
        Length length2 = new Length(null , LengthUnit.YARDS);
        var result= length1.equals(length2);
        assertFalse(result);
    }
    @Test
    public void testEquality_CentimetersWithNullUnit(){
        Length length1 = new Length(null , LengthUnit.CENTIMETERS);
        assertThrows(Exception.class,()->QuantityMeasurementApp.demonstrateLengthEquality(length1, (Length) new Object()));
    }
    @Test
    public void testEquality_CentimetersWithSameReference(){
        Length length1 = new Length(10.0 ,LengthUnit.CENTIMETERS);
        Length length2 = length1;
        var result= length1.equals(length2);
        assertTrue(result);
    }
    @Test
    public void testEquality_CentimetersWithNullComparison(){
        Length length1 = new Length(null , LengthUnit.CENTIMETERS);
        Length length2 = new Length(10.0 , LengthUnit.CENTIMETERS);
        var result= length1.equals(length2);
        assertFalse(result);
    }
    @Test
    public void testEquality_AllUnit_ComplexScenario(){
        Length length1 = new Length(2.0 ,LengthUnit.YARDS);
        Length length2 = new Length(6.0 ,LengthUnit.FEET);
        Length length3 = new Length(6.0 ,LengthUnit.FEET);
        Length length4 = new Length(72.0 ,LengthUnit.INCHES);
        assertAll(
                ()->assertEquals(length1,length2),
                ()->assertEquals(length2,length3),
                ()->assertEquals(length3,length4)
        );

    }
    /*UC5 test case*/
    @Test
    public void testConversion_FeetToInches(){
        assertEquals(new Length(12.0 , LengthUnit.INCHES),
                QuantityMeasurementApp.demonstrateLengthCoversion(1.0,LengthUnit.FEET, LengthUnit.INCHES));
    }
    @Test
    public void testConversion_InchesToFeet(){
        assertEquals(new Length(2.0 , LengthUnit.FEET),
                QuantityMeasurementApp.demonstrateLengthCoversion(24.0,LengthUnit.INCHES, LengthUnit.INCHES));

    }
    @Test
    public void testConversion_YardToInches(){
        assertEquals(new Length(36.0 , LengthUnit.INCHES),
                QuantityMeasurementApp.demonstrateLengthCoversion(1.0,LengthUnit.YARDS, LengthUnit.INCHES));

    }
    @Test
    public void testConversion_InchesToYard(){
        assertEquals(new Length(2.0 ,LengthUnit.YARDS),
                QuantityMeasurementApp.demonstrateLengthCoversion(72.0,LengthUnit.INCHES, LengthUnit.YARDS));
    }
    @Test
    public void testConversion_CentimeterToInches(){
        assertEquals(new Length(1.0 ,LengthUnit.INCHES),
                QuantityMeasurementApp.demonstrateLengthCoversion(2.54,LengthUnit.CENTIMETERS,LengthUnit.INCHES));

    }
    @Test
    public void testConversion_FeetToYard(){
        assertEquals(new Length(2.0 , LengthUnit.YARDS),
                QuantityMeasurementApp.demonstrateLengthCoversion(6.0,LengthUnit.FEET,LengthUnit.YARDS));
    }


    @Test
    public void testConversion_RoundTrip_PreservesValue(){
        Length length = new Length(6.0 ,LengthUnit.FEET);
        Length v= length.convertTo(LengthUnit.YARDS);
        assertEquals(length,demonstrateLengthCoversion(v, LengthUnit.YARDS));
    }
    @Test
    public void testConversion_ZeroValue(){
        assertEquals(new Length(0.0 ,LengthUnit.YARDS),
                QuantityMeasurementApp.demonstrateLengthCoversion(0.0,LengthUnit.FEET, LengthUnit.YARDS));
    }
    @Test
    public void testConversion_NegativeValue(){
        assertEquals(new Length(2.0 ,LengthUnit.YARDS),
                QuantityMeasurementApp.demonstrateLengthCoversion(6.0,LengthUnit.FEET, LengthUnit.YARDS));
    }
    @Test
    public void testConversion_InvalidUnit_ThrowException(){
        assertEquals(new Length(-12.0 ,LengthUnit.INCHES),
                QuantityMeasurementApp.demonstrateLengthCoversion(-1.0,LengthUnit.FEET,LengthUnit.INCHES));
    }
    @Test
    public void testConversion_NaNOrInfinite_ThrowException(){
        assertThrows(Exception.class,() ->QuantityMeasurementApp.demonstrateLengthCoversion(Double.NaN,LengthUnit.FEET,LengthUnit.YARDS)) ;
    }
    @Test
    public void testConversion_PrecisionTolerance(){
        assertEquals(new Length(2.54e-6 , LengthUnit.CENTIMETERS),
                QuantityMeasurementApp.demonstrateLengthCoversion(0.000001,LengthUnit.INCHES, LengthUnit.CENTIMETERS));
    }
    /*Test Case UC6*/
    @Test
    public void testAddition_SameUnit_FeetPlusFeet(){
        assertEquals(new Length(3.0 , LengthUnit.FEET),
                demonstrateLengthAddition(new Length(1.0,LengthUnit.FEET),
                        new Length(2.0,LengthUnit.FEET)));
    }
    @Test
    public void testAddition_SameUnit_InchPlusInch(){
        assertEquals(new Length(12.0 ,LengthUnit.INCHES),
                demonstrateLengthAddition(new Length(6.0,LengthUnit.INCHES),
                        new Length(6.0,LengthUnit.INCHES)));
    }
    @Test
    public void testAddition_CrossUnit_FeetPlusInch(){
        assertEquals(new Length(2.0 ,LengthUnit.FEET),
                demonstrateLengthAddition(new Length(12.0,LengthUnit.INCHES),
                        new Length(1.0,LengthUnit.FEET)));
    }
    @Test
    public void testAddition_CrossUnit_YardToFeet(){
        assertEquals(new Length(2.0 ,LengthUnit.YARDS),
                demonstrateLengthAddition(new Length(1.0,LengthUnit.YARDS),
                        new Length(3.0,LengthUnit.FEET)));
    }
    @Test
    public void testAddition_CrossUnit_CentimeterToInch(){
        assertEquals(new Length(5.08 ,LengthUnit.CENTIMETERS),
                demonstrateLengthAddition(new Length(2.54,LengthUnit.CENTIMETERS),
                        new Length(1.0,LengthUnit.INCHES)));
    }
    @Test
    public void testAddition_Commutativity(){
        Length length1 = new Length(1.0 ,LengthUnit.FEET);
        Length length2 = new Length( 12.0,LengthUnit.INCHES);
        assertEquals(demonstrateLengthAddition(length1,length2),
                demonstrateLengthAddition(length2,length1));
    }
    @Test
    public void testAddition_WithZero(){
        assertEquals(new Length(5.0 ,LengthUnit.FEET),
                demonstrateLengthAddition(new Length(5.0,LengthUnit.FEET),
                        new Length(0.0,LengthUnit.INCHES)));
    }
    @Test
    public void testAddition_NegativeValue(){
        assertEquals(new Length(3.0 ,LengthUnit.FEET),
                demonstrateLengthAddition(new Length(5.0,LengthUnit.FEET),
                        new Length(-2.0,LengthUnit.FEET)));
    }
    @Test
    public void testAddition_NullSecondOperand(){
        assertThrows(Exception.class,()-> demonstrateLengthAddition
                (new Length(3.0 , LengthUnit.FEET),null));
    }

    @Test
    public void testAddition_LargeValues(){
        assertEquals(new Length(2e6 ,LengthUnit.FEET),
                demonstrateLengthAddition(new Length(1e6,LengthUnit.FEET),
                        new Length(1e6,LengthUnit.FEET)));
    }
    @Test
    public void testAddition_SmallValues(){
        assertEquals(new Length(0.003 ,LengthUnit.FEET),
                demonstrateLengthAddition(new Length(0.001,LengthUnit.FEET),
                        new Length(0.002,LengthUnit.FEET)));
    }
    /*Test Case UC7*/
    @Test
    public void testAddition_ExplicitTargetUnit_Feet(){
        assertEquals(new Length(2.0 ,LengthUnit.FEET),
                demonstrateLengthAddition(new Length(1.0,LengthUnit.FEET),
                        new Length(12.0,LengthUnit.INCHES),LengthUnit.FEET));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_Inches(){
        assertEquals(new Length(24.0 ,LengthUnit.INCHES),
                demonstrateLengthAddition(new Length(1.0,LengthUnit.FEET),
                        new Length(12.0,LengthUnit.INCHES),LengthUnit.INCHES));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_Yards(){
        assertEquals(new Length(0.67 , LengthUnit.YARDS),
                demonstrateLengthAddition(new Length(1.0,LengthUnit.FEET),
                        new Length(12.0,LengthUnit.INCHES),LengthUnit.YARDS));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_Centimeter(){
        assertEquals(new Length(5.08 ,LengthUnit.CENTIMETERS),
                demonstrateLengthAddition(new Length(1.0,LengthUnit.INCHES),
                        new Length(1.0,LengthUnit.INCHES),LengthUnit.CENTIMETERS));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_SameAsFirstOperand(){
        assertEquals(new Length(3.0 ,LengthUnit.YARDS),
                demonstrateLengthAddition(new Length(2.0,LengthUnit.YARDS),
                        new Length(3.0,LengthUnit.FEET),LengthUnit.YARDS));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_SameAsSecondOperand(){
        assertEquals(new Length(9.0 ,LengthUnit.FEET),
                demonstrateLengthAddition(new Length(2.0,LengthUnit.YARDS),
                        new Length(3.0,LengthUnit.FEET),LengthUnit.FEET));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_Commutativity(){
        Length length1 = demonstrateLengthAddition(new Length(2.0,LengthUnit.FEET),new Length(3.0,LengthUnit.INCHES),LengthUnit.FEET);
        Length length2 = demonstrateLengthAddition(new Length(3.0,LengthUnit.INCHES),new Length(2.0,LengthUnit.FEET),LengthUnit.FEET);
        assertEquals(length1,length2);
    }
    @Test
    public void testAddition_ExplicitTargetUnit_WithZero(){
        assertEquals(new Length(1.67 ,LengthUnit.YARDS),
                demonstrateLengthAddition(new Length(5.0,LengthUnit.FEET),
                        new Length(0.0,LengthUnit.INCHES),LengthUnit.YARDS));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_NegativeZero(){
        assertEquals(new Length(36.0 , LengthUnit.INCHES),
                demonstrateLengthAddition(new Length(5.0,LengthUnit.FEET),
                        new Length(-2.0,LengthUnit.FEET),LengthUnit.INCHES));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_NullTargetUnit(){
            assertThrows(Exception.class,() ->demonstrateLengthAddition(new Length(2.0,LengthUnit.YARDS),new Length(3.0,LengthUnit.FEET), null)) ;
        }
    @Test
    public void testAddition_ExplicitTargetUnit_LargeToSmall(){
        assertEquals(new Length(18000.0 , LengthUnit.INCHES),
                demonstrateLengthAddition(new Length(1000.0,LengthUnit.FEET),
                        new Length(500.0,LengthUnit.FEET),LengthUnit.INCHES));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_SmallToLarge(){
        assertEquals(new Length(0.67 ,LengthUnit.YARDS),
                demonstrateLengthAddition(new Length(12.0,LengthUnit.INCHES),
                        new Length(12.0,LengthUnit.INCHES),LengthUnit.YARDS));
    }
    @Test
    public void testAddition_ExplicitTargetUnit_AllUnitCombination(){
//        assertEquals(new Length(1.334 , Length.LengthUnit.YARDS),
//                demonstrateLengthAddition(new Length(12.0,Length.LengthUnit.INCHES),
//                        new Length(12.0,Length.LengthUnit.INCHES),Length.LengthUnit.YARDS),
//                new Length(12.0,Length.LengthUnit.INCHES),
//                demonstrateLengthAddition((new Length(12.0,Length.LengthUnit.INCHES),Length.LengthUnit.YARDS),Length.LengthUnit.YARDS);
    }

    /*Test Case UC9*/
    @Test
    public void testEquality_kilogramToKilogram_SameValue(){
        Weight w1= new Weight(1.0 ,WeightUnit.KILOGRAM);
        Weight w2= new Weight(1.0 ,WeightUnit.KILOGRAM);
        assertTrue(QuantityMeasurementApp.demonstrateWeightEquality(w1,w2));
    }
    @Test
    public void testEquality_kilogramToKilogram_DifferentValue(){
        Weight w1= new Weight(1.0 ,WeightUnit.KILOGRAM);
        Weight w2= new Weight(2.0 ,WeightUnit.KILOGRAM);
        assertFalse(QuantityMeasurementApp.demonstrateWeightEquality(w1,w2));
    }
    @Test
    public void testEquality_kilogramToGram_EquivalentValue(){
        Weight w1= new Weight(1.0 ,WeightUnit.KILOGRAM);
        Weight w2= new Weight(1000.0 ,WeightUnit.GRAM);
        assertTrue(demonstrateWeightEquality(w1,w2));
    }
    @Test
    public void testEquality_GramToKilogram_EquivalentValue(){
        Weight w2= new Weight(1000.0 ,WeightUnit.GRAM);
        Weight w1= new Weight(1.0 ,WeightUnit.KILOGRAM);
        assertTrue(demonstrateWeightEquality(w2,w1));
    }
    /*@Test
    public void testEquality_WeightVsLength_Incompatible(){
        assertTrue(demonstrateWeightEquality(new Weight(1.0 ,WeightUnit.KILOGRAM).equals(new Length(1.0,LengthUnit.FEET)));
    }*/
    @Test
    public void testEqualityWeight_WeightVsLength_Incompatible(){
        assertFalse(new Weight(1.0,WeightUnit.KILOGRAM).equals(null));
    }
    @Test
    public void testEqualityWeight_SameReference(){

    }
    @Test
    public void testEqualityWeight_NullUnit(){
        Weight weight = new Weight(1.0 , null);
        assertThrows(Exception.class,()->demonstrateWeightEquality(weight, (Weight) new Object()));
    }
    @Test
    public void testEqualityWeight_TransitiveProperties(){

    }
    @Test
    public void testEqualityWeight_ZeroValues(){
    assertTrue(new Weight(0.0 ,WeightUnit.KILOGRAM).equals(new Weight(0.0 ,WeightUnit.GRAM)));
    }
    @Test
    public void testEqualityWeight_NegativeValues(){
        assertTrue(new Weight(-1.0 ,WeightUnit.KILOGRAM).equals(new Weight(-1000.0 ,WeightUnit.GRAM)));
    }
    @Test
    public void testEqualityWeight_LargeWeightValues(){
        assertTrue(new Weight(1000.0 ,WeightUnit.KILOGRAM).equals(new Weight(1000000.0 ,WeightUnit.GRAM)));
    }
    @Test
    public void testEqualityWeight_SmallWeightValues(){
        assertTrue(new Weight(0.001 ,WeightUnit.KILOGRAM).equals(new Weight(1.0 ,WeightUnit.GRAM)));
    }
    @Test
    public void testConversion_PoundToKilogram(){
    assertEquals(new Weight(1.0,WeightUnit.KILOGRAM),demonstrateWeightConversion(new Weight(2.20462 ,WeightUnit.POUND),(WeightUnit.KILOGRAM)));
    }
    @Test
    public void testConversion_KilogramToPound(){
        assertEquals(new Weight(2.20462,WeightUnit.POUND),demonstrateWeightConversion(new Weight(1.0 ,WeightUnit.KILOGRAM),(WeightUnit.POUND)));
    }
    @Test
    public void testConversion_SameUnit(){
        assertEquals(new Weight(5.0,WeightUnit.KILOGRAM),demonstrateWeightConversion( new Weight(5.0,WeightUnit.KILOGRAM),(WeightUnit.KILOGRAM)));
    }
    @Test
    public void testConversionWeight_ZeroValue(){
        assertEquals(new Weight(0.0,WeightUnit.GRAM),demonstrateWeightConversion( new Weight(0.0,WeightUnit.KILOGRAM),(WeightUnit.GRAM)));
    }
    @Test
    public void testConversionWeight_NegativeValue(){
        assertEquals(new Weight(-1000.0,WeightUnit.GRAM),demonstrateWeightConversion( new Weight(-1.0,WeightUnit.KILOGRAM),(WeightUnit.GRAM)));
    }
    /*@Test
    public void testConversionWeight_RoundTrip(){
        assertEquals(new Weight(-1000.0,WeightUnit.GRAM),demonstrateWeightConversion( new Weight(-1.0,WeightUnit.KILOGRAM),(WeightUnit.GRAM)));
    }*/

    @Test
    public void testAdditionWeight_Commutativity(){
        Weight weight1 = new Weight(1.0 ,WeightUnit.KILOGRAM);
        Weight weight2 = new Weight( 1000.0,WeightUnit.GRAM);
        assertEquals(demonstrateWeightAddition(weight1,weight2),
                demonstrateWeightAddition(weight2,weight1));

    }
    @Test
    public void testAdditionWeight_ZeroValue(){
        assertEquals(new Weight(5.0 ,WeightUnit.KILOGRAM),
                demonstrateWeightAddition(new Weight(5.0,WeightUnit.KILOGRAM),
                        new Weight(0.0,WeightUnit.GRAM)));
    }
    @Test
    public void testAdditionWeight_NegativeValue(){
        assertEquals(new Weight(3.0 ,WeightUnit.KILOGRAM),
                demonstrateWeightAddition(new Weight(5.0,WeightUnit.KILOGRAM),
                        new Weight(-2000.0,WeightUnit.GRAM)));
    }
    @Test
    public void testAddition_LargeValue(){
        assertEquals(new Weight(2e6 ,WeightUnit.KILOGRAM),
                demonstrateWeightAddition(new Weight(1e6,WeightUnit.KILOGRAM),
                        new Weight(1e6,WeightUnit.KILOGRAM)));
    }
}
