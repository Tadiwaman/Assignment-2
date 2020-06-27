
/**
 * Write a description of class Hero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hero
{
    private String name;
    private String decription;
    
    private String description;
    private int currentStress;
    private int maxStress;
    private boolean isAwake;
    
    private int strength;
    private int intelligence;
    private int speed;
    
    public String getName(){
    return name;    
    }
    
    //Mutator method
    public String getDescription(String setDescription){
        description = setDescription;
        currentStress = 0;
        maxStress = 0;
        isAwake = true;
        return description;

    }
    
    public String profileToString(){
        return name + '\n' + description + '\n' + maxStress;
    }   
    
    static void setSkills(int strength, int intelligence, int speed){
        strength = 6;
        intelligence = 3;
        speed = 7;
    }
    
    // Checks a skill against the stat of the Hero.
    // If the difficulty is less than the skill plus a random value between 1-4, return true
    // Use strings for now to check type ( "mental", "physical", "social")
    // True means the hero passed the test, false means the hero failed.
}
