package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LeapYearTestAlaa {
    private LeapYearAlaa leap;

    @BeforeEach
    public void initialization(){
        this.leap = new LeapYearAlaa();
    }

    @Test
    public void leapYear(){
        boolean isLeap = this.leap.isLeapYear(2020);
        Assertions.assertTrue(isLeap);
    }

    @Test
    public void nonLeapYear(){
        boolean isLeap = this.leap.isLeapYear(2019);
        Assertions.assertFalse(isLeap);
    }

    @Test
    public void leapCenturialYear(){
        boolean isLeap = this.leap.isLeapYear(2000);
        Assertions.assertTrue(isLeap);
    }

    @Test
    public void nonLeapCenturialYear(){
        boolean isLeap = this.leap.isLeapYear(1700);
        Assertions.assertFalse(isLeap);
    }
}
