package com.bridgelabz.junit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringMethodsTest {

    @Test
    public void toUpperCaseTest(){
        String result = StringUtilityMethods.toUpperCase("level");
        String expected = "LEVEL";
        Assertions.assertEquals(result,expected);
    }

    @Test
    public void isPalindromeTest(){
        boolean result = StringUtilityMethods.isPalindrome("level");
        boolean expectedResult = true;

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void reverseTest(){
        String result = StringUtilityMethods.reverse("pranav");
        String expected = "vanarp";
        Assertions.assertEquals(expected,result);
    }

}
