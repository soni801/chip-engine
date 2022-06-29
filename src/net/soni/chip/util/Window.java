package net.soni.chip.util;

import javax.swing.*;

/**
 * @author Soni
 */
public class Window
{
    private JFrame frame;

    public String title;
    public int[] size;

    /**
     * @param title the title of the window
     * @param size the size of the window, index 0: width, index 1: height
     */
    public Window(String title, int[] size)
    {
        // Save the window metadata
        this.title = title;
        this.size = size;

        // Create a frame with sensible settings
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(size[0], size[1]);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    /**
     * Sets the size of the window to the given value
     *
     * @param size the size of the window
     * @return the Window object this was called on
     */
    public Window setSize(int[] size)
    {
        // Set and update window size
        this.size = size;
        frame.setSize(size[0], size[1]);

        // Return the object this was called on
        return this;
    }
}
