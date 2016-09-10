import greenfoot.*;

public class Tanks extends World
{
    public Tanks()
    {    
        super(800, 600, 1);
        
        setPaintOrder(
            HealthBar.class,
            FireBlast.class,
            Bullet.class,
            Cannon.class,
            Chassis.class,
            Target.class);
    }
    
    public void resetSpeed()
    {
        Greenfoot.setSpeed(43);
    }
}
