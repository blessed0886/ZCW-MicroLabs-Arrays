package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class ArrayPartyTest {

    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty party = new ArrayParty();
        String expected = "Mushrooms";

        //: When
        String acutal = party.lastElement(breakfast);

        //: Then
        Assert.assertEquals(expected, acutal);
    }

    @Test
    public void lastButOneTest() {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty party = new ArrayParty();
        String expected = "Tomatoes";

        //: When
        String acutal = party.lastButOne(breakfast);

        //: Then
        Assert.assertEquals(expected, acutal);
    }

    @Test
    public void reverseTest() {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Mushrooms\n" +
                "Tomatoes\n" +
                "Bacon\n" +
                "Beans\n" +
                "Eggs\n" +
                "Sausage";

        //: When
        String actual = arrayParty.reverse(breakfast);

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPalindromeTestFalse(){
        //: Given
        ArrayParty party = new ArrayParty();
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        Boolean expected = false;

        //; When
        Boolean actual = party.isPalindrome(breakfast);

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPalindromeTestTrue(){
        //: Given
        ArrayParty party = new ArrayParty();
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        Boolean expected = true;

        //; When
        Boolean actual = party.isPalindrome(breakfast);

        //: Then
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void compressTest(){
        //: Given
        ArrayParty party = new ArrayParty();
        String expected = "*** Output ***\n1\n3\n2\n1\n4";
        Integer[] numbers = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};

        //:When
        String actual = party.compress(numbers);

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void packTest(){
        //: Given
        ArrayParty party = new ArrayParty();
        String expected = "*** Output ***\naaaa, b, cc, aa, d, eeee";
        Character [] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'};

        //: When
        String actual = party.pack(letters);

        //: Then
        Assert.assertEquals(expected, actual);
    }

    //TODO Define the method lastButOneTest

    //TODO Define the method reverseTest

    //TODO Define the method isPalindromeTest

    //TODO Define the method compressTest

    //TODO Define the method packTest


}
