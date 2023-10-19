import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ambulance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ambulance extends Pendukung
{
    int speed = -12;
    public void act()
    {
        Ambulance a = new Ambulance();
        Actor i = getOneIntersectingObject(Ambulance.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
