package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestAlaa {
   private RomanNumeral romanNumeral;

   @BeforeEach
    public void initialize(){
       this.romanNumeral = new RomanNumeral();
//       System.out.println("This is called BeforeEach1");
   }

//    @BeforeEach
//    public void initialize2(){
//        System.out.println("This is called BeforeEach2");
//    }


   @Test
   public void singleNumber(){
       int convertedValue = romanNumeral.convert("I");
       Assertions.assertEquals(1,convertedValue);

   }

   @Test
    public void numberWithManyDigits(){
       int convertedValue=romanNumeral.convert("VIII");
       Assertions.assertEquals(8,convertedValue);
   }

   @Test
    public void numberWithSubtractiveNotation(){
       int result = romanNumeral.convert("IV");
       Assertions.assertEquals(4,result);
   }

}
