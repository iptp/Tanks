import greenfoot.*;

public class Cannon extends Actor
{
    private int turnSpeed = 8;
    private boolean firePressed = false;
    
    public void act()
    {
        aim();
        
        if(Greenfoot.isKeyDown("space"))
        {
            if(firePressed == false)
            {
                firePressed = true;
                fire();
            }
        }
        else
        {
            firePressed = false;
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
        
        // Position the bullet at the tip of the barrel
        b.move(38);
        b.turn(-90);
        b.move(2);
        b.turn(90);
        
        FireBlast f = new FireBlast();
        
        getWorld().addObject(f, b.getX(), b.getY());
        f.setRotation(b.getRotation());
    }
}
