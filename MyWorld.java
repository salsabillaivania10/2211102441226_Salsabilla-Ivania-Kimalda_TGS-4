import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(400, 600, 1); 
        prepare();
    }
    private void prepare()
    {
        MobilMerah MobilMerah = new MobilMerah();
        addObject(MobilMerah,307,557);
    }
     public void act(){
     if(Greenfoot.getRandomNumber(100)<1){
     addObject(new Ambulance(), Greenfoot.getRandomNumber(200) + 30, 0);
     }
     if(Greenfoot.getRandomNumber(200)<1){
     addObject(new MobilHijau(), Greenfoot.getRandomNumber(200) + 20, 600);
     }
     if(Greenfoot.getRandomNumber(200)<1){
     addObject(new Koin(), Greenfoot.getRandomNumber(200) + 30, 0);
     }
    }
}
