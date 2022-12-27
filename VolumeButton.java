import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class VolumeButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VolumeButton extends Button
{
    private boolean volumeOn; // Volume state (on/off)

    // VolumeButton Constructor
    public VolumeButton(){
        volumeOn = true;
    }

    /*
     * Getters and Setters
     */
    
    /**
     * getVolumeOn - Returns if the volume is on
     */
    public boolean getVolumeOn(){
        return this.volumeOn;
    }

    /**
     * setVolumeOn - Sets the state of the volume
     */
    public void setVolumeOn(boolean volumeOn){
        this.volumeOn = volumeOn;
    }

    /**
     * Act - do whatever the VolumeButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        volumeOnOff();
    }

    /**
     * volumeOnOff - Turns music off if volume is off. Turns music on if volume in on
     */
    public void volumeOnOff(){
        MyWorld m = (MyWorld) getWorld();
        
        // If user clicks volume button to turn music off, music will stop
        if (Greenfoot.mouseClicked(this) && getVolumeOn()){
            Greenfoot.playSound("buttonpop.wav");
            m.getbgMusic().pause();
            setVolumeOn(false);
            setImage(new GreenfootImage("volumeoff.png"));
        }
        
        // If user clicks volume button to turn music on, music will start
        else if (Greenfoot.mouseClicked(this) && !getVolumeOn()){
            m.getbgMusic().play();
            Greenfoot.playSound("buttonpop.wav");
            setVolumeOn(true);
            setImage(new GreenfootImage("volumeon.png"));
        }
    }
}
