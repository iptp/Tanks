import greenfoot.*;

public class Chassis extends Actor
{
    private int turnSpeed = 8;
    private int moveSpeed = 4;
    
    private Cannon turret = new Cannon();
    
    public void addedToWorld(World w)
    {
        w.addObject(turret, getX(), getY());
    }
    
    public void act()
    {
        drive();
    }
    
    public void drive()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            turn(turnSpeed);
            turret.turn(turnSpeed);
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            turn(-turnSpeed);
            turret.turn(-turnSpeed);
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            move(moveSpeed);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            move(-moveSpeed);
        }
        
        turret.setLocation(getX(), getY());
    }
}
