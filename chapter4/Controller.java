import greenfoot.*;

public class Controller
{
    private String forwardKey;
    private String reverseKey;
    private String turnLeftKey;
    private String turnRightKey;

    private String cannonLeftKey;
    private String cannonRightKey;
    private String fireKey;
    
    public Controller(String fwd, String rev, String tl, String tr, String cl, String cr, String fire)
    {
        forwardKey = fwd;
        reverseKey = rev;
        turnLeftKey = tl;
        turnRightKey = tr;
        cannonLeftKey = cl;
        cannonRightKey = cr;
        fireKey = fire;
    }
    
    public boolean isKeyDown(String action)
    {
        if(action.equals("forward"))
        {
            return Greenfoot.isKeyDown(forwardKey);
        }
        else if(action.equals("reverse"))
        {
            return Greenfoot.isKeyDown(reverseKey);
        }
        else if(action.equals("turn left"))
        {
            return Greenfoot.isKeyDown(turnLeftKey);
        }
        else if(action.equals("turn right"))
        {
            return Greenfoot.isKeyDown(turnRightKey);
        }
        else if(action.equals("cannon left"))
        {
            return Greenfoot.isKeyDown(cannonLeftKey);
        }
        else if(action.equals("cannon right"))
        {
            return Greenfoot.isKeyDown(cannonRightKey);
        }
        else if(action.equals("fire"))
        {
            return Greenfoot.isKeyDown(fireKey);
        }
        else
        {
            // Invalid command
            return false;
        }
    }
}