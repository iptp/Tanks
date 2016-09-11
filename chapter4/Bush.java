import greenfoot.*;

public class Bush extends Actor
{    
    public void addedToWorld(World w)
    {
        // Produce a random number in the range 0..359
        int angle = Greenfoot.getRandomNumber(360);
        setRotation(angle);
    }
}
