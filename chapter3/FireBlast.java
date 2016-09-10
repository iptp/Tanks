import greenfoot.*;

public class FireBlast extends Actor
{
    private int opacity = 255;
    private int fadePerFrame = 81;
    
    public void act()
    {
        if(opacity <= 0)
        {
            getWorld().removeObject(this);
        }
        else
        {
            getImage().setTransparency(opacity);
            opacity -= fadePerFrame;
        }
    }
}
