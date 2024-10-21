// Project 1 Fall 2024
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Aanchal Paranthaman (aanchalp)
package project1;

// -------------------------------------------------------------------------
/**
 * The ProjectRunner class can be used to demonstrate the functionality of both
 * the ShapeWindow and DisplayCollection classes.
 * 
 * @author aanchalp
 * @version Sep 15, 2024
 */
public class ProjectRunner
{
    // ~ Fields ................................................................

    // ~ Constructors ..........................................................

    // ~Public Methods ........................................................
    /**
     * Main method that creates a DisplayCollection object and a shapeWindow
     * object
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        DisplayCollection displayCollection = new DisplayCollection();
        ShapeWindow shapeWindow =
            new ShapeWindow(displayCollection.getItemBag());
    }
}
