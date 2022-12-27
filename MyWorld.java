import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private final GreenfootSound bgmusic = new GreenfootSound("bgmusic.mp3"); // Background music
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 1300 x 850 cells with a cell size of 1x1 pixels.
        super(1300, 850, 1); 

        // Sets background to a picture of the library
        GreenfootImage bg = new GreenfootImage("library.png");
        setBackground(bg);

        // Displays a blank toolbar
        GreenfootImage toolbar = new GreenfootImage("toolbar.png");
        toolbar.scale(1300, 150);
        getBackground().drawImage(toolbar, 0, 0);

        // Adds "Change Background" button to the world
        BackgroundButton button = new BackgroundButton();
        addObject(button, 1150, 800);

        // Adds "Volume On/Off" button to the world
        VolumeButton volume = new VolumeButton();
        addObject(volume, 1000, 800);

        // Adds a bunny to the world
        Bunny bunny = new Bunny();
        addObject(bunny, 800, 650);

        // Adds petfood to the world
        PetFood petFood = new PetFood();
        addObject(petFood, 100, 85);

        // Adds coffee to the world
        Coffee coffee = new Coffee();
        addObject(coffee, 325, 80);

        // Adds a ukulele to the world
        Ukulele ukulele = new Ukulele();
        addObject(ukulele, 525, 85);

        // Adds a camera to the world
        Camera camera = new Camera();
        addObject(camera, 725, 70);

        // Adds a scooter to the world
        Scooter scooter = new Scooter();
        addObject(scooter, 975, 80);

        // Adds a cape to the world
        Cape cape = new Cape();
        addObject(cape, 1175, 85);

        // Adds the stats to the world
        Stats stats = new Stats();
        addObject(stats, 175, 825);

        // Adds the hunger stats to the world
        HungerText hungerStat = new HungerText(new GreenfootImage("Hunger: " + bunny.getHunger() + "%", 30, Color.PINK, null));
        addObject(hungerStat, 115, 735);

        // Adds the energy stat to the world
        EnergyText energyStat = new EnergyText(new GreenfootImage("Energy: " + bunny.getEnergy() + "%", 30, Color.PINK, null));
        addObject(energyStat, 113, 775);

        // Adds the happiness stat to the world
        HappinessText happinessStat = new HappinessText(new GreenfootImage("Happiness: " + (int) Math.floor(bunny.getHappiness()) + "%", 30, Color.PINK, null));
        addObject(happinessStat, 135, 815);

        // Sets the order each class will be displayed in the world
        setPaintOrder(Text.class, Button.class, Stats.class, Food.class, Toy.class, Bunny.class);
    }

    /**
     * getbgMusic - Returns the background music
     */
    public GreenfootSound getbgMusic(){
        return this.bgmusic;
    }

    /**
     * stopped - Overrides the stopped() void method to pause background music when user presses 'pause'
     */
    public void stopped(){
        bgmusic.pause();
    }

    /**
     * started - Overrides the started() void method to play background music when user presses 'play'
     */
    public void started(){
        bgmusic.setVolume(25);
        bgmusic.playLoop();
    }
}
