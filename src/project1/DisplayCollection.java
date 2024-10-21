// Project 1 Fall 2024
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Aanchal Paranthaman (aanchalp)
package project1;

import bag.Bag;
import bag.BagInterface;
import student.TestableRandom;

// -------------------------------------------------------------------------
/**
 * The DisplayCollection class contains the functionality to create a randomly
 * generated Bag. The class contains a constant reference array of strings that
 * can serve as content of a Bag.
 * 
 * @author aanchalp
 * @version Sep 15, 2024
 */
public class DisplayCollection
{
    // ~ Fields ................................................................

    /**
     * This is a final static string array and it can not be changed. It holds
     * the 4 values presented on the window.
     */
    public static final String[] STRINGS =
        { "red circle", "blue circle", "red square", "blue square" };

    private BagInterface<String> itemBag;

    // ~ Constructors ..........................................................
    /**
     * Create a new DisplayCollection object.
     */
    public DisplayCollection()
    {
        this.itemBag = new Bag<>();
        TestableRandom random = new TestableRandom();

        int size = random.nextInt(11) + 5;

        for (int i = 0; i < size; i++)
        {
            int value = random.nextInt(STRINGS.length);
            String string = STRINGS[value];
            itemBag.add(string);
        }
    }


    // ~Public Methods ........................................................
    /**
     * This is a getter method for itemBag
     * 
     * @return the itemBag
     */
    public BagInterface<String> getItemBag()
    {
        return this.itemBag;
    }
}
