import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Pet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pet extends Actor
{
    private int time; // Counts number of acts
    private int hunger; // Hunger stat
    private int energy; // Energy stat
    private int impatience; // Impatience level
    private double happiness; // Happiness stat
    private boolean sleeping; // Sleeping state of the pet
    private boolean eating; // Eating state of the pet
    private boolean walking; // Walking state of the pet
    private boolean playing; // Playing state of the pet
    private int happyImgTime; // Counts how long a 'happy' image will display for
    private int eatImgTime; // Counts how long a 'eat' image will display for
    private int walkImgTime; // Counts how long a 'walk' image will display for
    private int mouseX; // x coordinates of mouse
    private int mouseY; // y coordinates of mouse
    private int speed; // speed of the pet

    private GreenfootImage imgPlay = new GreenfootImage("normal.png"); // Image that will be displayed when happiness stat changes

    // Pet constructor
    public Pet(){
        hunger = 100;
        impatience = 0;
        energy = 100;
        happiness = 100;
        sleeping = false;
        eating = false;
        playing = false;
        happyImgTime = 50;
        eatImgTime = 100;
        walkImgTime = 500;
        time = 0;
        speed = 1;
        mouseX = 0;
        mouseY = 0;
    }
    
    // Overloaded Pet constructor
    public Pet(int hunger, int impatience, int energy, int happiness, boolean sleeping, boolean eating, boolean playing, int happyImgTime, int eatImgTime, 
        int walkImgTime, int time, int speed, int mouseX, int mouseY){
            this.hunger = hunger;
            this.impatience = impatience;
            this.energy = energy;
            this.happiness = happiness;
            this.sleeping = sleeping;
            this.eating = eating;
            this.playing = playing;
            this.happyImgTime = happyImgTime;
            this.eatImgTime = eatImgTime;
            this.walkImgTime = walkImgTime;
            this.time = time;
            this.speed = speed;
            this.mouseX = mouseX;
            this.mouseY = mouseY;
        }

    /**
     * act - do whatever the Pet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){

    }

    /*
     * Getters and Setters
     */
    
    /**
     * getTime - Returns the current time
     */

    public int getTime(){
        return this.time;
    }

    /**
     * getHunger() - Returns the current hunger stat
     */

    public int getHunger(){
        return this.hunger;
    }

    /**
     * setHunger - Sets hunger stat
     */
    public void setHunger(int hunger){
        if (hunger <= 0){
            this.hunger = 0;
        }else if (hunger >= 100){
            this.hunger = 100;
        }else{
            this.hunger = hunger;
        }
    }

    /**
     * getEnergy - Returns the current energy stat
     */

    public int getEnergy(){
        return this.energy;
    }

    /**
     * setEnergy - Sets energy stat
     */

    public void setEnergy(int energy){
        if (energy <= 0){
            this.energy = 0;
        }else if (energy >= 100 && getSleeping() == true){
            setSleeping(false);
            setImpatience(0);
            this.energy = 100;
        }else{
            this.energy = energy;
        }
    }

    /**
     * getImpatience - Returns the current impatience level
     */

    public int getImpatience(){
        return this.impatience;
    }

    /**
     * setImpatience - Sets impatience level
     */
    public void setImpatience(int impatience){
        if (getTime() % 2500 == 0){
            this.impatience = 0;
        }else{
            this.impatience = impatience;
        }
    }

    /**
     * getHappiness - Returns current happiness stat
     */
    public double getHappiness(){
        return this.happiness;
    }

    /**
     * setHappiness - Sets happiness stat
     */
    public void setHappiness(double happiness){
        if (happiness <= 0){
            this.happiness = 0;
        }else if (happiness >= 100){
            this.happiness = 100;
        }else{
            this.happiness = happiness;
        }
    }

    /**
     * getSleeping - Returns sleeping state of pet
     */
    public boolean getSleeping(){
        return this.sleeping;
    }

    /** 
     * setSleeping - Sets sleeping state of pet
     */
    public void setSleeping(boolean sleeping){
        this.sleeping = sleeping;
    }

    /**
     * getEating - Returns eating state of pet
     */
    public boolean getEating(){
        return this.eating;
    }

    /**
     * setEating - Sets eating state of pet
     */
    public void setEating(boolean eating){
        this.eating = eating;
    }

    /**
     * getWalking - Returns walking state of pet
     */
    public boolean getWalking(){
        return this.walking;
    }

    /**
     * setWalking - Sets walking state of pet
     */
    public void setWalking(boolean walking){
        this.walking = walking;
    }

    /**
     * getPlaying - Returns playing state of pet
     */
    public boolean getPlaying(){
        return this.playing;
    }

    /**
     * setPlaying - Sets playing state of pet
     */
    public void setPlaying(boolean playing){
        this.playing = playing;
    }

    /**
     * getHappyImgTime - Returns amount of time left before image associated with the happy stat disappears
     */
    public int getHappyImgTime(){
        return this.happyImgTime;
    }

    /**
     * setHappyImgTime - Sets amount of time left before image associated with the happy stat disappears
     */
    public void setHappyImgTime(int happyImgTime){
        if (happyImgTime <= 0){
            this.happyImgTime = 50;
        }else{
            this.happyImgTime = happyImgTime;
        }
    }

    /**
     * getEatImgTime - Returns amount of time left before image associated with the hunger stat disappears
     */
    public int getEatImgTime(){
        return this.eatImgTime;
    }

    /**
     * setEatImgTime - Sets amount of time left before image associated with the hunger stat disappears
     */
    public void setEatImgTime(int eatImgTime){
        this.eatImgTime = eatImgTime;
    }

    /**
     * getWalkImgTime - Returns amount of time left before image associated with movement disappears
     */
    public int getWalkImgTime(){
        return this.walkImgTime;
    }

    /**
     * setWalkImgTime - Sets amount of time left before image associated with movement disappears
     */
    public void setWalkImgTime(int walkImgTime){
        this.walkImgTime = walkImgTime;
    }

    /**
     * getMouseX - Returns x position of mouse
     */
    public int getMouseX(){
        return this.mouseX;
    }

    /**
     * setMouseX - Sets x position of mouse
     */
    public void setMouseX(int mouseX){
        this.mouseX = mouseX;
    }

    /**
     * getMouseY - Returns y position of mouse
     */
    public int getMouseY(){
        return this.mouseY;
    }

    /**
     * setMouseY - Sets y position of mouse
     */
    public void setMouseY(int mouseY){
        // If the y coordinate of the mouse is less than 500 or greater than 750, it is considered out of bounds and will be adjusted accordingly
        if (mouseY <= 500){
            this.mouseY = 500;
        }else if (mouseY >= 750){
            this.mouseY = 750;
        }else{
            this.mouseY = mouseY;
        }
    }

    /**
     * getSpeed - Returns current speed of pet
     */
    public int getSpeed(){
        return this.speed;
    }

    /**
     * setSpeed - Sets speed of pet
     */
    public void setSpeed(int speed){
        this.speed = speed;
    }

    /**
     * getImgPlay - Returns current image that will be shown when the happiness stat increases
     */
    public GreenfootImage getImgPlay(){
        return this.imgPlay;
    }

    /**
     * setImgPlay - Sets the image that will be shown when the happiness stat increases
     */
    public void setImgPlay(GreenfootImage imgPlay){
        this.imgPlay = imgPlay;
    }

    /**
     * tick - Decreases the Pet Stats over time
     */
    public void tick(){
        // Energy stat will decrease every 50 acts
        if (getTime() % 50 == 0){
            if (getSleeping() == false){ 
                setEnergy(getEnergy() -1);
            }
        }
        
        // Happiness stat will decrease every 75 act
        if(getTime() % 75 == 0){
            setHappiness(getHappiness() - 1);
        }
        
        // Hunger stat will decrease every 100 acts
        if(getTime() % 100 == 0){
            setHunger(getHunger() - 1);
        }
        
        time++;
    }

    /**
     * play - If pet is clicked, happiness of the pet goes up and image changes.
     * However, if the impatience of the pet is high, pet will be mad and happiness stat will not change
     */
    public void play(GreenfootImage happy, GreenfootImage annoyed, GreenfootImage mad, GreenfootImage playUkulele, GreenfootImage photo){
        // If the mouse is clicked and pet is not currently eating or sleeping, a random number will be generated to determine if pet is mad or annoyed 
        // at you for clicking it.
        
        // The likihood of the pet getting upset at being clicked is directly tied to its energy levels and how many times it has been clicked before.
        // Low energy levels and high number of clicks will increase the chances of the pet being upset at being clicked.
        if (Greenfoot.mouseClicked(this) && canMove() && getEatImgTime() == 100 && getHappyImgTime() == 50){ 
            int random = Greenfoot.getRandomNumber(20);
            if (random <= getImpatience()){
                if (getImpatience() > 20){
                    setImgPlay(mad);
                }else{
                    setImgPlay(annoyed);
                }
            }else{
                setImgPlay(happy);
            }
            
            // Everytime the pet has been clicked, pet will become more impatient 
            setImpatience(getImpatience() + 1);
            
            // Happiness stat will only increase if pet is not mad
            if(Greenfoot.mouseClicked(this) && getImgPlay() != mad){
                setHappiness(getHappiness() + 5);
            }
            setHappyImgTime(49);
        }
        // If pet is interacting with things (objects) that make it happy, the pet image will change for 50 acts
        else if (getHappyImgTime() < 50 && getEatImgTime() == 100){
            setImage(getImgPlay());
            setHappyImgTime(getHappyImgTime() - 1);
        }if (getHappiness() >= 100 && getEatImgTime() == 100){ 
            setHappiness(100);
            setImage(getImgPlay());
        }

        //Pet will interact with the ukulele and the camera if they are dragged to the pet, and the happiness stat will increase
        dragObj(Ukulele.class, 525, 85, playUkulele);
        dragObj(Camera.class, 725, 70, photo);
    }

    /**
     * sleep - Pet will become sleepy when the energy stat is between 20 and 50. 
     * Pet will fall asleep when energy is less than 20
     */
    public void sleep(GreenfootImage normal, GreenfootImage sleepy, GreenfootImage sleep){
        // If pet's energy is greater than 50%, pet will look normal
        if (getEnergy() > 50 && getSleeping() == false && getEatImgTime() == 100 && getWalkImgTime() == 500){
            setImage(normal);
        }
        
        // If pet's energy is between 20% and 50%, pet will be sleepy and it will lose its patience
        else if (getEnergy() <= 50 && getEnergy() >= 20 && getSleeping() == false && getEatImgTime() == 100 && getWalkImgTime() == 500){
            setImage(sleepy);
            setImpatience(getImpatience() + 1);
        }
        
        // If pet's energy is less than 20%, pet will fall asleep until energy stat is restored back to 100%. During this time, pet cannot be disturbed
        else if (getEnergy() < 20 || getSleeping() == true){
            setSleeping(true);
            setImage(sleep);
            
            // Every 50 acts, the pets energy will increase by 5%
            if (getTime() % 50 == 0){
                setEnergy(getEnergy() + 5);
            }
        }
    }

    /**
     * walk - Pet will walk to wherever mouse is click. 
     * Pet will move when the up, down, right, left arrow keys are pressed. 
     * Pet will also change speed when it interacts with a Cape or Scooter object
     */
    public void walk(GreenfootImage normal, GreenfootImage ride, GreenfootImage hero){ //watch out, there might be an error; getting stuck
        MouseInfo mouse = Greenfoot.getMouseInfo();
        List<Button> buttons = getWorld().getObjects(Button.class);
        Button button = buttons.get(0);
        Button button2 = buttons.get(1);
        
        //If mouse is clicked, pet will move towards cursor
        if (Greenfoot.mouseClicked(null) && !Greenfoot.mouseClicked(this) && canMove() && !Greenfoot.mouseClicked(button) && !Greenfoot.mouseClicked(button2)){
            setMouseX(mouse.getX());
            setMouseY(mouse.getY());
            setWalking(true);
        }
        
        // If user does not make pet move by clicking or pressing the arrow keys, pet will move to a random spot on its own accord every 250 acts
        else if (!Greenfoot.isKeyDown("right") && !Greenfoot.isKeyDown("left") && !Greenfoot.isKeyDown("up") && !Greenfoot.isKeyDown("down")){
            if (time % 250 == 0 && canMove() && getWalking() == false){
                setMouseX(Greenfoot.getRandomNumber(1300)-1);
                setMouseY(Greenfoot.getRandomNumber(250) + 400-1);
                setWalking(true);
            }
        }

        // If pet is walking because the mouse was clicked, pet will move towards the designated spot
        if (getWalking()){
            if (getX() < getMouseX() && ((getX() + 5 * getSpeed()) <= getWorld().getWidth()) && !(Math.abs(getX()-getMouseX()) <= 5 * getSpeed())){
                move(5 * getSpeed()); // Moves right
            }else if (getX() > getMouseX() && (getX() - 5 * getSpeed()) >= 0 && !(Math.abs(getX()-getMouseX()) <= 5 * getSpeed())){
                move(-5 * getSpeed()); // Moves left
            }if (getY() < getMouseY() && !(Math.abs(getY() - getMouseY()) <= 5 * getSpeed())){
                setLocation(getX(),getY() + 5 * getSpeed()); // Moves down
            }if (getY() > getMouseY() && (getY() - 5 * getSpeed()) >= 500 && !(Math.abs(getY() - getMouseY()) <= 5 * getSpeed())){
                setLocation(getX(), getY() - 5 * getSpeed()); // Moves up
            }
        }
        if ((Math.abs(getX()-getMouseX()) <= 5 * getSpeed() && Math.abs(getY() - getMouseY()) <= 5 * getSpeed())){
            setWalking(false);
        }

        // Pet will move according to which arrow keys are pressed
        if (Greenfoot.isKeyDown("right") && (getX() + 5 * getSpeed()) <= getWorld().getWidth() && canMove()){
            move(5 * getSpeed()); // Moves right
            setWalking(false); 
        }else if(Greenfoot.isKeyDown("left") && (getX() - 5 * getSpeed()) >= 0 && canMove()){
            move(-5 * getSpeed()); // Moves left
            setWalking(false);
        }if (Greenfoot.isKeyDown("up") && (getY() - 5 * getSpeed()) >= 500 && canMove()){
            setLocation(getX(), getY() - 5 * getSpeed()); // Moves up
            setWalking(false);
        }else if (Greenfoot.isKeyDown("down") && getY() <= getWorld().getHeight()-100 && canMove()){
            setLocation(getX(),getY() + 5 * getSpeed()); // Moves down
            setWalking(false);
        }

        // Pet will interact with the Scooter and Cape objects if they are dragged onto the pet. Happiness stat and speed will increase by doing so
        dragObj(Scooter.class, 975, 80, ride);
        dragObj(Cape.class, 1175, 85, hero);

        // If Scooter and Cape objects are in use, pet image and speed will be changed accordingly. If they are not, pet image and speed will revert 
        // back to default values
        if (getWalkImgTime() < 500 && getWalkImgTime() >= 0 && getEatImgTime() == 100 && getHappyImgTime() == 50){ 
            // System.out.println(getWalkImgTime());
            setImage(getImgPlay());
            setWalkImgTime(getWalkImgTime() - 1);
        }else if (getImage() != ride && getImage() != normal && getImage() != hero){
            setWalkImgTime(500);
            setSpeed(1);
        }else{
            setImage(normal);
        }
    }

    /**
     * canMove - Checks if pet can move
     */
    public boolean canMove(){
        List<PetFood> petFoods = getWorld().getObjects(PetFood.class);
        PetFood petFood = petFoods.get(0);
        
        // If the pet is not sleeping or eating, then it can move
        if (sleeping == false && !Greenfoot.mouseDragEnded(petFood)){
            return true;
        }else{
            return false;
        }
    }

    /**
     * eat - If food is dragged to the pet, pet will eat the food and hunger stat will go up
     */
    public void eat(GreenfootImage eat, GreenfootImage drink){
        // Pet will interact with the Petfoot and Coffee objects if they are dragged to the pet. Hunger stat will go up by doing so
        dragObj(PetFood.class, 100, 85, eat);
        dragObj(Coffee.class, 325, 80, drink);
    }

    /**
     * dragObj - If an interactive object gets dragged to the pet, depending on the type of the object, pet stats will change accordingly.
     * Object will disappear once it has stopped being dragged and a new object will reappear
     */
    public void dragObj(Class b, int x, int y, GreenfootImage petImg){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        Actor a = getOneObjectAtOffset(0,0, b);
        List<Actor> objects = getWorld().getObjects(b);
        Actor object = objects.get(0);
        if (Greenfoot.mouseDragged(object)){
            // If the object is dragged, the object will move with the mouse
            object.setLocation(mouse.getX(), mouse.getY()); 
            if (a != null && canMove()){ 
                // If the object is a food and it hits the pet, hunger stat will go up and the pet image will change for 100 acts
                if (Food.class.isAssignableFrom(b)){
                    setHunger(getHunger() + 10);
                    setImage(petImg);
                    setEatImgTime(99);
                }
                // If the object is a toy and it hits the pet, happiness will go up and the pet image will change for 50 acts
                if (Toy.class.isAssignableFrom(b)){
                    setHappiness(getHappiness() + 5);
                    setImgPlay(petImg);
                    setHappyImgTime(49);
                    
                    // If the object is from the Scooter or Cape class specifically, the pet image will change for 500 acts 
                    // and speed of the pet will increase
                    if(Scooter.class.isAssignableFrom(b) || Cape.class.isAssignableFrom(b)){
                        setWalkImgTime(499);
                        if(Scooter.class.isAssignableFrom(b)){
                            setSpeed(2);
                        }else{
                            setSpeed(3);
                        }
                    }
                }
                // Object gets removed from the world once it interacts with pet
                getWorld().removeObject(object); 
            }
        }

        // If an object has been dragged, a new object will be placed in the original position
        objects = getWorld().getObjectsAt(x, y, b);
        if (objects.size() == 0){
            try{
                Actor obj = (Actor) b.newInstance();
                getWorld().addObject(obj, x, y);
            }catch(Exception e){}
        }
        else{
            objects = getWorld().getObjects(b);
            // Removes an object if the user has stopped dragging it and it doesn't interact with the pet
            for (Actor o : objects){
                if (o.getX() != x && o.getY() != y && Greenfoot.mouseDragEnded(o)){
                    getWorld().removeObject(o);
                }
            }
        }

        // If the object that touches the pet is from the Food class, the pet image will change for 100 acts
        if(Food.class.isAssignableFrom(b)){
            if((this.isTouching(b) && getSleeping() == false) || getEatImgTime() < 100){
                if (getImage() == petImg && getEatImgTime() < 100){
                    setImage(petImg); 
                }
                setEatImgTime(getEatImgTime() - 1);
            }if (this.isTouching(b) && getEating() == false && getSleeping() == false){
                setEating(true);
            }if (!this.isTouching(b)){
                setEating(false);
            }if (getHunger() <= 0){
                setHunger(0);
            }if (getEatImgTime() <= 0){
                setEatImgTime(100);
            }
        }

        // If the object that touches the pet is from the Toy class, the variable 'playing' will be set to true and false otherwise
        if(Toy.class.isAssignableFrom(b)){
            if (this.isTouching(b) && getPlaying() == false && getSleeping() == false){
                setPlaying(true);
            }if (!this.isTouching(b)){
                setPlaying(false);
            }
        }
    }

    /**
     * isDead - Returns 'true' if hunger is 0% and pet has died.
     * Returns false otherwise
     */
    public boolean isDead(){
        // If the hunger reaches 100%, the pet will die :'(
        if (getHunger() <= 0){
            return true;
        }return false;
    }
}
