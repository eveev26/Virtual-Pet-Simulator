import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class BackgroundButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackgroundButton extends Button
{
    private int prevImg; // Contains the index of the previous background
    final private GreenfootImage [] bgImages = {new GreenfootImage("library.png"), // Library background
        new GreenfootImage("bedroom.jpg"), // Bedroom background
        new GreenfootImage("kitchen.jpg"), // Kitchen background
        new GreenfootImage("bathroom.jpg"), // Bathroom background
        new GreenfootImage("livingroom.jpg"), // Living room background
        new GreenfootImage("pool.jpg")}; // Pool background
    
    // BackgroundButton constructor
    public BackgroundButton(){
        prevImg = 0;
    }
    
    /*
     * Getters and Setters
     */
    
    /**
     * getBGImages - Returns all the background images
     */
    public GreenfootImage [] getBGImages(){
        return this.bgImages;
    }

    /**
     * get PrevImg - Returns the previous background image index in the bgImages array
     */
    public int getPrevImg(){
        return this.prevImg;
    }
    
    /**
     * setPrevImg - Sets the previous background image
     */
    public void setPrevImg(int prevImg){
        this.prevImg = prevImg;
    }

    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        changeBG();
    }

    /**
     * changeBG - Changes the background when the "Change Background" button is clicked
     */
    public void changeBG(){
        if (Greenfoot.mouseClicked(this)){
            // Generates random number
            int random = 0;
            while(random == getPrevImg()){
                random = Greenfoot.getRandomNumber(bgImages.length);
            }
            setPrevImg(random);
            Greenfoot.playSound("buttonpop.wav");
            
            // Sets new background image
            getWorld().setBackground(getBGImages()[random]);
            
            // Re-adds the toolbar
            GreenfootImage toolbar = new GreenfootImage("toolbar.png");
            toolbar.scale(1300, 150);
            getWorld().getBackground().drawImage(toolbar, 0, 0);
        }
    }
}
