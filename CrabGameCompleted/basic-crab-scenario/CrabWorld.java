import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,244,295);
        Worm worm = new Worm();
        addObject(worm,303,137);
        Worm worm2 = new Worm();
        addObject(worm2,121,111);
        Worm worm3 = new Worm();
        addObject(worm3,117,498);
        Worm worm4 = new Worm();
        addObject(worm4,422,395);
        Worm worm5 = new Worm();
        addObject(worm5,451,173);
        Worm worm6 = new Worm();
        addObject(worm6,384,285);
        Worm worm7 = new Worm();
        addObject(worm7,80,298);
        Lobster lobster = new Lobster();
        addObject(lobster,177,478);
    }
}
