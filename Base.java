import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Base here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Base extends Actor
{
    
    int score = 0;
    private int lives = 5;
    /**
     * Act - do whatever the Base wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKey();
        end();
        getWorld().showText("score : " + score,70,30);
        addscore();
    }
    
    public void checkKey(){
        if(Greenfoot.isKeyDown("left")){
            if(getX()>= 180){
                setLocation(getX() -3, getY());}
            }
            
        if(Greenfoot.isKeyDown("right")){
            if(getX()<= 670){
                setLocation(getX() +3, getY());}
            }
            
        if(Greenfoot.isKeyDown("up")){{
                setLocation(getX(), getY()-3);}
            }
        
        if(Greenfoot.isKeyDown("down")){
                setLocation(getX(), getY()+3);}
            }
            
    public void end(){
        if(isTouching(Jet1.class)||isTouching(Jet2.class)){
            getWorld().showText(" Game Over \n score : " +score, 415,300);
            Greenfoot.stop();
        }
    }
    public void addscore(){
        if(isTouching(Coin.class)){
            score = score + 10;
            removeTouching(Coin.class);
    
        }
    }
    
}

