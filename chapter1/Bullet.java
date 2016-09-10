import greenfoot.*;

public class Bullet extends Actor
{
    public void act()
    {
        Actor target = getOneIntersectingObject(Target.class);
        
        if(target != null) // Did I hit a target?
        {
            getWorld().removeObject(target);
            getWorld().removeObject(this);
        }
        else if(isAtEdge()) // Did I hit the edge?
        {
            getWorld().removeObject(this);
        }
        else
        {
            move(10);
        }
    }
}
