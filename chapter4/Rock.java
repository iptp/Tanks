import greenfoot.*;

public class Rock extends Solid
{
    public Rock()
    {
       super(0, 0);
    }
    
    public void addedToWorld(World w)
    {
        // Produce a random number in the range 0..359
        int angle = Greenfoot.getRandomNumber(360);
        setRotation(angle);
    }
    
    public void die()
    {
       // Never dies
    }
}
