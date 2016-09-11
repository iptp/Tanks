import greenfoot.*;

public class Bullet extends Actor
{
    Actor shooter;
    
    public Bullet(Actor s)
    {
        shooter = s;
    }
    
    public void act()
    {
        Solid target = (Solid) getOneIntersectingObject(Solid.class);
        
        if(target != null && target != shooter)
        {
            target.takeDamage(1);
            getWorld().removeObject(this);
        }
        else if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
        else
        {
            move(10);
        }
    }
}
