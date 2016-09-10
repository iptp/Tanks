import greenfoot.*;

public class Bullet extends Actor
{
    public void act()
    {
        Target target = (Target) getOneIntersectingObject(Target.class);
        
        if(target != null)
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
