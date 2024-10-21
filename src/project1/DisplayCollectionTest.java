// Project 1 Fall 2024
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions
// of those who do.
// -- Aanchal Paranthaman (aanchalp)
package project1;

import bag.BagInterface;
import student.TestableRandom;

/**
 * This is the test class for the DisplayCollection class.
 * 
 * @author aanchalp
 * @version Sep 15, 2024
 */
public class DisplayCollectionTest
    extends student.TestCase
{
    // ~ Fields ................................................................

    // ~ Constructors ..........................................................

    // ~Public Methods ........................................................

    /**
     * This is the setUp method which has been intentionally left empty.
     */
    public void setUp()
    {
        // The setUp has been intentionally left empty since the
        // DisplayCollectionTest class does not contain any fields.
    }


    /**
     * This method tests whether every String the bag contains is one of the
     * four legal strings: "blue square", "red square", "blue circle", or "red
     * circle" in the STRINGS constant.
     */
    public void testBagContents()
    {
        boolean isInTheArray = false;
        DisplayCollection dc = new DisplayCollection();
        BagInterface<String> bag = dc.getItemBag();
        int bagSize = bag.getCurrentSize();
        for (int i = 0; i < bagSize; i++)
        {
            String string = bag.remove();
            for (int j = 0; j < 4; j++)
            {
                if (DisplayCollection.STRINGS[j].equals(string))
                {
                    isInTheArray = true;
                    assertTrue(isInTheArray);
                }
            }
        }
    }


    /**
     * Tests for every possible integer the DisplayCollection can hold
     */
    public void testBagSize()
    {
        for (int i = 5; i <= 15; i++)
        {
            TestableRandom.setNextInts(i - 5);
            DisplayCollection dc = new DisplayCollection();
            BagInterface<String> bag = dc.getItemBag();
            assertEquals(i, bag.getCurrentSize());
        }
    }

}
