package net.soni.chip.main;

import net.soni.chip.util.Window;

import java.util.LinkedList;

/**
 * @author Soni
 */
public class Game
{
    public LinkedList<Window> windows = new LinkedList<Window>();

    public Game()
    {
        // Create and add a new window
        windows.add(new Window("A game", new int[]{400, 300}));
    }

    public static void main(String[] args)
    {
        new Game();
    }
}
