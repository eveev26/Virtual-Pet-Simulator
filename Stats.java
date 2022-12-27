import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Stats here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stats extends Actor
{
    /**
     * Act - do whatever the Stats wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        showStats();
    }
    
    /**
     * showStats - Displays a board of all the Pet Stats
     */
    public void showStats(){
        // Finds the bunny currently in the world
        List<Bunny> bunnies = getWorld().getObjects(Bunny.class);
        Bunny bunny = bunnies.get(0);
        
        // Displays and updates the hunger stat
        List<HungerText> hungerTexts = getWorld().getObjects(HungerText.class);
        HungerText hungerText = hungerTexts.get(0);
        hungerText.setImage(new GreenfootImage("Hunger: " + bunny.getHunger() + "%", 30, Color.PINK, null));
        
        // Displays and updates the energy stat
        List<EnergyText> energyTexts = getWorld().getObjects(EnergyText.class);
        EnergyText energyText = energyTexts.get(0);
        energyText.setImage(new GreenfootImage("Energy: " + bunny.getEnergy() + "%", 30, Color.PINK, null));
    
        // Displays and updates the happiness stat
        List<HappinessText> happinessTexts = getWorld().getObjects(HappinessText.class);
        HappinessText happinessText = happinessTexts.get(0);
        happinessText.setImage(new GreenfootImage("Happiness: " + (int) Math.floor(bunny.getHappiness()) + "%", 30, Color.PINK, null));
    }
}
