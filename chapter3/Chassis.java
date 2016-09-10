import greenfoot.*;

public class Chassis extends Solid
{
    private int turnSpeed = 8;
    private int moveSpeed = 4;
    
    private Cannon turret;
    private Controller player;
    
    public Chassis(int playerNumber)
    {
        // Calls Solid constructor
        super(20, 20);
        
        if(playerNumber == 1)
        {
            player = new Controller("up", "down", "left", "right", "k", "l", "/");
        }
        else
        {
            player = new Controller("w", "s", "a", "d", "f", "g", "c");
        }
        
        turret = new Cannon(this, player);
    }
    
    public void addedToWorld(World w)
    {
        spawnHealthBar();
        w.addObject(turret, getX(), getY());
    }
    
    public void act()
    {
        drive();
    }
    
    public void drive()
    {
        if(player.isKeyDown("turn right"))
        {
            turn(turnSpeed);
            turret.turn(turnSpeed);
        }
        else if(player.isKeyDown("turn left"))
        {
            turn(-turnSpeed);
            turret.turn(-turnSpeed);
        }
        
        if(player.isKeyDown("forward"))
        {
            move(moveSpeed);
        }
        else if(player.isKeyDown("reverse"))
        {
            move(-moveSpeed);
        }
        
        turret.setLocation(getX(), getY());
    }
    
    public void die()
    {
        getWorld().removeObject(turret);
        getWorld().removeObject(this);
    }
}
