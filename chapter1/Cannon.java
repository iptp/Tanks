import greenfoot.*;

public class Cannon extends Actor
{
    private int turnSpeed = 8;
    
    public void act()
    {
        aim();
        
        if(Greenfoot.isKeyDown("space"))
        {
            fire();
        }
    }
    
    public void aim()
    {
        if(Greenfoot.isKeyDown("x"))
        {
            turn(turnSpeed);
        }
        else if(Greenfoot.isKeyDown("z"))
        {
            turn(-turnSpeed);
        }
    }
    
    public void fire()
    {
        Bullet b = new Bullet();
        
        getWorld().addObject(b, getX(), getY());
        b.setRotation(getRotation());
    }
}
