import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanWorld extends World
{
    
    private static final int WIDTH_WALL=28;
    private static final int HEIGHT_WALL=28;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PacmanWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Wall wall = new Wall();

        //int widthWall=wall.getImage().getWidth();
        //int heightWall=wall.getImage().getHeight();

        for(int x=50;x<550;x+=WIDTH_WALL)
        {
            wall = new Wall();
            addObject(wall,x,30);
            wall = new Wall();
            addObject(wall,x,350);
        }

        for(int y=58;y<200;y+=HEIGHT_WALL)
        {
            wall = new Wall();
            addObject(wall,50,y);
            wall = new Wall();
            addObject(wall,526,y);
        }

        //Pacman pacman=new Pacman();

        Banana banana = new Banana();
        addObject(banana,365,94);
        Cherry cherry = new Cherry();
        addObject(cherry,241,192);
        SmallBall smallBall = new SmallBall();
        addObject(smallBall,251,97);
        banana.setLocation(447,94);
        cherry.setLocation(106,278);
        smallBall.setLocation(463,259);
        BigBall ball = new BigBall();
        addObject(ball,300,121);
        Strawberry strawberry = new Strawberry();
        addObject(strawberry,291,277);
        SmallBall smallBall2 = new SmallBall();
        addObject(smallBall2,411,192);
        SmallBall smallBall3 = new SmallBall();
        addObject(smallBall3,179,200);
        BigBall ball2 = new BigBall();
        addObject(ball2,383,257);
        Banana banana2 = new Banana();
        addObject(banana2,347,82);
        Cherry cherry2 = new Cherry();
        addObject(cherry2,500,282);
        Balon balon = new Balon();
        addObject(balon,233,97);
        
        
        PacmanHud hud = new PacmanHud();
        addObject(hud,0,0);
        
        Pacman pacman = new Pacman(hud);
        
        addObject(pacman,110,90);
        
    }
}
