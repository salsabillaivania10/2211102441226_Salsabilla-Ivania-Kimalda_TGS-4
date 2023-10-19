import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Base here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Coin extends Parent
{
    int speed = -3;
    public void act()
    {
        Jet1 a = new Jet1();
        Actor i = getOneIntersectingObject(Jet1.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
