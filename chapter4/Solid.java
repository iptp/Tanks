import greenfoot.*;

public class Solid extends Actor
{
    private HealthBar hp;
    
    public Solid(int maxHp, int curHp)
    {
        hp = new HealthBar(this, maxHp, curHp);
    }
    
    public void spawnHealthBar()
    {
        getWorld().addObject(hp, getX(), getY());
    }
    
    public void takeDamage(int amount)
    {
        hp.changeValue(-amount);
        
        if(hp.isZero())
        {
            die();
        }
    }
    
    public void die()
    {
        getWorld().removeObject(this);
    }
}
