import greenfoot.*;

public class Cannon extends Actor
{
    private int turnSpeed = 8;
    private boolean firePressed = false;
    
    private Chassis tank;
    private Controller player;
    
    public Cannon(Chassis chassis, Controller ctrl)
    {
        tank = chassis;
        player = ctrl;
    }
    
    public void act()
    {
        aim();
        
        if(player.isKeyDown("fire"))
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
        if(player.isKeyDown("cannon right"))
        {
            turn(turnSpeed);
        }
        else if(player.isKeyDown("cannon left"))
        {
            turn(-turnSpeed);
        }
    }
    
    public void fire()
    {
        Bullet b = new Bullet(tank);
        
        getWorld().addObject(b, getX(), getY());
        b.setRotation(getRotation());
        
        b.move(38);
        b.turn(-90);
        b.move(2);
        b.turn(90);
        
        FireBlast f = new FireBlast();
        
        getWorld().addObject(f, b.getX(), b.getY());
        f.setRotation(b.getRotation());
    }
}
