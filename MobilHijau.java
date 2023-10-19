import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MobilHijau here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MobilHijau extends Pendukung
{
    int speed = -12;
    public void act()
    {
        MobilHijau a = new MobilHijau();
        Actor i = getOneIntersectingObject(MobilHijau.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
