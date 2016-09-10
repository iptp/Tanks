import greenfoot.*;

public class Target extends Solid
{
    public Target()
    {
        // Calls Solid constructor
        super(5, 5);
    }
    
    public void addedToWorld(World w)
    {
        spawnHealthBar();
    }
}
