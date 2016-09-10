import greenfoot.*;

public class Target extends Actor
{
    // Initialize with 5 hp
    HealthBar hp = new HealthBar(this, 5, 5);
    
    public void addedToWorld(World w)
    {
        w.addObject(hp, 0, 0);
    }
    
    public void takeDamage(int amount)
    {
        hp.changeValue(-amount);
        if(hp.isZero())
        {
            getWorld().removeObject(this);
        }
    }
}
