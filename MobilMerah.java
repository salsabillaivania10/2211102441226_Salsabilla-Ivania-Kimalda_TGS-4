import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MobilMerah extends Actor
{
   int score = 0; 
   public void act()
   {
       getWorld().showText("Score : " + score, 70, 30);
       checKey();
       end();
       addscore();
   }
    public void checKey(){
    if(Greenfoot.isKeyDown("up")){
       setLocation(getX(), getY()-2);
     }
    if(Greenfoot.isKeyDown("down")){
       setLocation(getX(), getY()+2);
    }
    if(Greenfoot.isKeyDown("left")){
       setLocation(getX()-2, getY());
    }
    if(Greenfoot.isKeyDown("right")){
       setLocation(getX()+2, getY());
    }
   }
    public void end(){
     if(isTouching(MobilMerah.class)||isTouching(MobilMerah.class)){
         getWorld().showText("Game Over \n Score : " + score, 300, 300);
         Greenfoot.stop();
         Greenfoot.playSound("a.wav");
    }
   }
   public void addscore(){
       if(isTouching(Koin.class)){
           score = score + 50 ;
           removeTouching(Koin.class);
           Greenfoot.playSound("a.wav");
       }
   }
}