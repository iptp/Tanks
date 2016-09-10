import greenfoot.*;
import java.awt.Color;

public class HealthBar extends Actor
{
    private final int maxSize = 50;
    private final int thickness = 5;
    
    private int maxValue;
    private int curValue;
    private Actor host;
    
    public HealthBar(Actor actor, int max, int cur)
    {
        host = actor;
        maxValue = max;
        curValue = cur;
        setImage(new GreenfootImage(maxSize, thickness));
    }
    
    public void addedToWorld(World w)
    {
        updateImage();
        updatePosition();
    }
    
    public void act()
    {
        updateImage();
        updatePosition();
    }
        
    public void updateImage()
    {
        if(curValue == 0)
        {
            getImage().clear();
        }
        else
        {
            int size = maxSize * curValue / maxValue;
            getImage().scale(size, thickness);
            
            int green = 255 * curValue / maxValue;
            int red = 255 - green;
            
            getImage().setColor(new Color(red, green, 0));
            getImage().fill();
        }
    }
    
    public void updatePosition()
    {
        if(host.getWorld() == null)
        {
            getWorld().removeObject(this);
        }
        else
        {
            setLocation(host.getX(), host.getY() - 40);
        }
    }
    
    public void changeValue(int amount)
    {
        curValue += amount;
        
        if(curValue < 0)
        {
            curValue = 0;
        }
        else if(curValue > maxValue)
        {
            curValue = maxValue;
        }
    }
    
    public boolean isZero()
    {
        if(curValue == 0)
			return true;
		else
			return false;
    }
}
