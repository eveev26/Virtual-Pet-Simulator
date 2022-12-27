import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    private GreenfootImage text; // Text image
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    // Text constructor
    public Text(GreenfootImage text){
        this.text = text;
    }
    
    /*
     * Getters and Setters
     */
    
    /**
     * getText - Returns the current text image
     */
    public GreenfootImage getText(){
        return this.text;
    }
    
    /**
     * setText - Sets the text image
     */
    public void setText(GreenfootImage text){
        this.text = text;
    }
}
