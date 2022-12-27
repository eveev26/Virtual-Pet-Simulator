import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Bunny here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bunny extends Pet
{
    // Various images of Bunny
    private final GreenfootImage normal = new GreenfootImage("normal.png");
    private final GreenfootImage happy = new GreenfootImage("happy.png");
    private final GreenfootImage sleepy = new GreenfootImage("sleepy.png");
    private final GreenfootImage sleep = new GreenfootImage("sleep.png");
    private final GreenfootImage eat = new GreenfootImage("eat.png");
    private final GreenfootImage annoyed = new GreenfootImage("annoyed.png");
    private final GreenfootImage mad = new GreenfootImage("mad.png");
    private final GreenfootImage drink = new GreenfootImage("drink.png");
    private final GreenfootImage playUkulele = new GreenfootImage("playukulele.png");
    private final GreenfootImage photo = new GreenfootImage("photo.png");
    private final GreenfootImage ride = new GreenfootImage("ride.png");
    private final GreenfootImage hero = new GreenfootImage("hero.png");

    // Bunny constructor
    public Bunny(){
        happy.scale(250, 250);
        sleepy.scale(250, 250);
        sleep.scale(300, 250);
        eat.scale(225, 250);
        annoyed.scale(250, 250);
        mad.scale(250, 250);
        drink.scale(225, 275);
        playUkulele.scale(250, 250);
        photo.scale(300, 350);
        ride.scale(200, 300);
        hero.scale(275, 250);
    }

    /*
     * Getters and Setters
     */

    /**
     * getNormal - Returns the default bunny image
     */
    public GreenfootImage getNormal(){
        return this.normal;
    }

    /**
     * getHappy - Returns a happy bunny image
     */
    public GreenfootImage getHappy(){
        return this.happy;
    }

    /**
     * getSleepy - Returns a sleepy bunny image
     */
    public GreenfootImage getSleepy(){
        return this.sleepy;
    }

    /**
     * getSleep - Returns image of bunny sleeping
     */
    public GreenfootImage getSleep(){
        return this.sleep;
    }

    /**
     * getEat - Returns image of bunny eating
     */
    public GreenfootImage getEat(){
        return this.eat;
    }

    /**
     * getAnnoyed - Returns an annoyed bunny image
     */
    public GreenfootImage getAnnoyed(){
        return this.annoyed;
    }

    /**
     * getMad - Returns a mad bunny image
     */
    public GreenfootImage getMad(){
        return this.mad;
    }

    /**
     * getDrink - Returns image of bunny drinking
     */
    public GreenfootImage getDrink(){
        return this.drink;
    }

    /**
     * getPlayUkulele - Returns image of bunny playing the ukulele
     */
    public GreenfootImage getPlayUkulele(){
        return this.playUkulele;
    }

    /**
     * getPhoto - Returns image of bunny using a camera
     */
    public GreenfootImage getPhoto(){
        return this.photo;
    }

    /**
     * getRide - Returns image of bunny on a scooter
     */
    public GreenfootImage getRide(){
        return this.ride;
    }

    /**
     * getHero - Returns image of bunny wearing a cape
     */
    public GreenfootImage getHero(){
        return this.hero;
    }

    /**
     * Act - do whatever the Bunny wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        gameLoop();
    }

    /**
     * gameLoop - Updates variables and Bunny stats. Also displays result if game is over
     */
    public void gameLoop(){
        tick();
        walk(getNormal(), getRide(), getHero());
        sleep(getNormal(), getSleepy(), getSleep());
        eat(getEat(), getDrink());
        play(getHappy(), getAnnoyed(), getMad(), getPlayUkulele(), getPhoto());
        
        // If the bunny is dead, the game over screen will be displayed and all objects in the world will be removed
        if(isDead()){
            getWorld().setBackground(new GreenfootImage("gameover.jpg"));
            Greenfoot.playSound("gameover.wav");
            getWorld().stopped();
            List<Actor>allObjects = getWorld().getObjects(Actor.class);
            getWorld().removeObjects(allObjects);
        }
    }

}
