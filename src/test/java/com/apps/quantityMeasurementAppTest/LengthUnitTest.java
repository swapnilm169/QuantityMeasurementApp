package com.apps.quantityMeasurementAppTest;

import com.apps.quantityMeasurementApp.Length;
import com.apps.quantityMeasurementApp.LengthUnit;
import com.apps.quantityMeasurementApp.QuantityMeasurementApp;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.*;

public class LengthUnitTest {
    @Test
    public void testLengthUnitEnum_FeetConstant(){
        assertEquals(12.0 , LengthUnit.FEET.getConversionFactor());
    }
    @Test
    public void testLengthUnitEnum_InchesConstant(){
        assertEquals(1.0 , LengthUnit.INCHES.getConversionFactor());
    }
    @Test
    public void testLengthUnitEnum_YardsConstant(){
        assertEquals(36.0 , LengthUnit.YARDS.getConversionFactor());
    }
    @Test
    public void testLengthUnitEnum_CentimeterConstant(){
        assertEquals(0.393701 , LengthUnit.CENTIMETERS.getConversionFactor());
    }
    @Test
    public void testConvertToBase_FeetToFeet(){
        assertEquals(1.97 , LengthUnit.CENTIMETERS.convertToBaseUnit(5.0));
    }
    @Test
    public void testConvertToBase_InchesToFeet(){
        assertEquals(1.0 , LengthUnit.INCHES.convertToBaseUnit(1.0));
    }
    @Test
    public void testConvertToBase_YardsToFeet(){
        assertEquals(36.0 , LengthUnit.YARDS.convertToBaseUnit(1.0));
    }
    @Test
    public void testConvertToBase_CentimeterToFeet(){
        assertEquals(12.0 , LengthUnit.CENTIMETERS.convertToBaseUnit(30.48));
    }
    @Test
    public void testConvertFromBase_FeetToFeet(){
        assertEquals(24.0 , LengthUnit.FEET.convertToBaseUnit(2.0));
    }
    @Test
    public void testConvertFromBase_FeetToInches(){
        assertEquals(1.0 , LengthUnit.INCHES.convertToBaseUnit(1.0));
    }
    @Test
    public void testConvertFromBase_FeetToYards(){
        assertEquals(36.0 , LengthUnit.YARDS.convertToBaseUnit(1.0));
    }
    @Test
    public void testConvertFromBase_FeetToCentimeter(){
        assertEquals(0.39 , LengthUnit.CENTIMETERS.convertToBaseUnit(1.0));
    }
//    13
    @Test
    public void quantityLengthRefactored_Equality(){
    Length length1 = new Length(12.0 ,LengthUnit.INCHES);
    Length length2 = new Length(1.0 ,LengthUnit.FEET);
    assertEquals(length1, length2);
    }
    @Test
    public void quantityLengthRefactored_ConvertTo(){
        assertTrue(new Length(12.0,LengthUnit.INCHES).equals(new Length(1.0,LengthUnit.FEET).convertTo(LengthUnit.INCHES)));
    }
    @Test
    public void quantityLengthRefactored_add(){
        assertEquals(new Length(2.0 , LengthUnit.FEET),(new Length(1.0,LengthUnit.FEET).add(new Length(12.0,LengthUnit.INCHES),LengthUnit.FEET)));
    }
    @Test
    public void quantityLengthRefactored_addWithTargetUnit(){
        assertEquals(new Length(0.67 , LengthUnit.YARDS),(new Length(1.0,LengthUnit.FEET).add(new Length(12.0,LengthUnit.INCHES),LengthUnit.YARDS)));
    }
    /*@Test
    public void quantityLengthRefactored_NullUnit(){
        assertThrows(Exception.class,() ->demonstrateLengthCoversion(1.0,null,LengthUnit.YARDS)) ;
    }
    @Test
    public void quantityLengthRefactored_InvalidValue(){
        assertThrows(Exception.class,() ->demonstrateLengthCoversion(new Length(Double.NaN,LengthUnit.FEET)));
    }
    @Test
    public void backwordCompatibility_UC1TestEqualityTest(){

    }*/
    @Test
    public void testUnitImmutability() throws InterruptedException, ExecutionException {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        List<Callable<Double>> task=new ArrayList<>();
        for(int i=0;i<1000;i++){
            task.add(LengthUnit.INCHES::getConversionFactor);
        }
        List<Future<Double>> results=executorService.invokeAll(task);
        for(Future<Double> result:results){
            assertEquals(1.0,result.get());
        }
        executorService.shutdown();
    }

}
