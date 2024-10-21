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
import cs2.TextShape;
import student.TestableRandom;
import cs2.Window;
import cs2.Button;
import cs2.WindowSide;
import java.awt.Color;

// -------------------------------------------------------------------------
/**
 * The ShapeWindow class contains the Graphical User Interface (GUI)
 * functionality for this project. It assigns the methods reacting to the
 * buttons being clicked.
 * 
 * @author aanchalp
 * @version Sep 15, 2024
 */
public class ShapeWindow
{
    // ~ Fields ................................................................
    private Window window;
    private Button quitButton;
    private Button chooseButton;
    private BagInterface<String> itemBag;
    private TextShape textShape;

    // ~ Constructors ..........................................................
    /**
     * Create a new ShapeWindow object.
     * 
     * @param itemBag
     */
    public ShapeWindow(BagInterface<String> itemBag)
    {
        window = new Window();
        window.setTitle("Project 1");
        this.itemBag = itemBag;

        quitButton = new Button("Quit");
        quitButton.onClick(this, "clickedQuit");
        window.addButton(quitButton, WindowSide.NORTH);

        chooseButton = new Button("Choose");
        chooseButton.onClick(this, "clickedChoose");
        window.addButton(chooseButton, WindowSide.SOUTH);

        textShape = new TextShape(0, 0, "");
        window.addShape(textShape);
    }


    // ~Public Methods ........................................................
    /**
     * This allows the user to click on the quit button to quit the window
     * 
     * @param quitButton
     */
    public void clickedQuit(Button quitButton)
    {
        System.exit(0);
    }


    /**
     * This allows the user to click on the choose button
     * 
     * @param chooseButton
     */
    public void clickedChoose(Button chooseButton)
    {
        if (!itemBag.isEmpty())
        {
            String string = itemBag.remove();
            textShape.setText(string);
            window.repaint();
            colorText(string);
            centerText();
        }
        else
        {
            textShape.setText("No more items");
        }
    }


    /**
     * Based on the text, this method sets the color for the text
     * 
     * @param textColor
     */
    public void colorText(String textColor)
    {
        if (textColor.contains("red"))
        {
            textShape.setForegroundColor(Color.RED);
        }
        else if (textColor.contains("blue"))
        {
            textShape.setForegroundColor(Color.BLUE);
        }
        else
        {
            textShape.setForegroundColor(Color.BLACK);
        }
    }


    /**
     * This method moves the text to the center of the window
     */
    public void centerText()
    {
        int width = (window.getGraphPanelWidth() - textShape.getWidth()) / 2;
        int height = (window.getGraphPanelHeight() - textShape.getHeight()) / 2;
        textShape.moveTo(width, height);
    }
}
