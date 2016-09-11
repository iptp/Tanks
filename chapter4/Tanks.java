import greenfoot.*;

public class Tanks extends World
{
    private Chassis player1;
    private Chassis player2;
    
    public Tanks()
    {    
        super(800, 600, 1);
        
        setPaintOrder(
            HealthBar.class,
            FireBlast.class,
            Bush.class,
            Bullet.class,
            Cannon.class,
            Solid.class,
            Oil.class);
            
        prepare();
    }

    public void resetSpeed()
    {
        Greenfoot.setSpeed(43);
    }

    public void act()
    {
        String text = "";
        if(player1.getWorld() == null)
        {
            text = "Player 2 wins!";
        }
        else if(player2.getWorld() == null)
        {
            text = "Player 1 wins!";
        }
        else
        {
            // No one won yet
            return;
        }
        
        // \n is a newline character
        text += "\nPress SPACE to restart.";
        showText(text, getWidth() / 2, getHeight() / 4);
        // Repaint to make the text appear immediately
        repaint();
        
        while(Greenfoot.isKeyDown("space") == false)
        {
            // Wait
        }
        
        // Remove the text by placing empty text at the same position
        showText("", getWidth() /2, getHeight() / 4);
        
        // Remove all objects.
        // getObjects(null) returns all objects of all classes in the world.
        removeObjects(getObjects(null));
        
        prepare();
    }
    
    private void prepare()
    {
        player1 = new Chassis(1);
        player2 = new Chassis(2);
        
        addObject(player1, 100, 100);
        addObject(player2, getWidth() - 100, getHeight() - 100);
        
        Rock rock = new Rock();
        addObject(rock,254,92);
        rock.setLocation(255,122);
        Rock rock2 = new Rock();
        addObject(rock2,260,213);
        Rock rock3 = new Rock();
        addObject(rock3,411,551);
        Rock rock4 = new Rock();
        addObject(rock4,560,320);
        Rock rock5 = new Rock();
        addObject(rock5,158,432);
        Bush bush = new Bush();
        addObject(bush,491,351);
        Bush bush2 = new Bush();
        addObject(bush2,502,287);
        Bush bush3 = new Bush();
        addObject(bush3,439,315);
        Oil oil = new Oil();
        addObject(oil,183,357);
        Oil oil2 = new Oil();
        addObject(oil2,737,388);
        Oil oil3 = new Oil();
        addObject(oil3,344,153);
        Bush bush4 = new Bush();
        addObject(bush4,691,162);
        Bush bush5 = new Bush();
        addObject(bush5,646,105);
    }
}
