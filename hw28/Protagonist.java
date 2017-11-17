//Kathleen Wong, Ben Shapiro, Aidan Griffin 
//Team : The CocaCola Company
//APCS1 pd1
//HW28 -- Ye Olde Role Playing Game
//2017-11-09

public class Protagonist {

    //variable creation
    
    public static String name;
    public static int healthP, strength, defense;
    public static double attackRating;

    //Constructor: initializes variables/stats of the protagonist

    public Protagonist(String a){
    name = a;
    healthP = 125;
    strength = 100;
    defense = 40;
    attackRating = 0.4;
    }

    //isAlive: checks to see if the protagonisit is alive. If the protagonist's health reaches 0 or less, the protagonist is dead (returns false)
    
    public static boolean isAlive(){
    return (healthP > 0);
    }

    //getDefense: returns the protagonist's defense stat
    
    public static int getDefense(){
    return defense;
    }

    //getName: returns the protagonist's name
    
    public static String getName(){
    return name;
    }

    //lowerHP: lowers the HP stat of the protagonist based on damage taken in a turn. If HP reaches 0 or less, the protagonist dies
    
    public static void lowerHP(int x){
       healthP -= x;
    }

    //attack: calculates and returns the damage done by the protagonist to the monster, based on the protagonist's strength and attackm and the monster's defense stat
    
    public static int attack(Monster x){
    int damage = (( strength * (int) attackRating) - x.getDefense());
    x.lowerHP(damage);
    return damage;
    }

    //Specialize: prepares the protagonist to perform a special attack. A special attack lowers the protagonist's defense but raises their attack

    public static void specialize() {
    defense -= 5;
    attackRating += .1;
    }

    //Normalize: prepares the protagonist to perform a normal attack, by resetting the changes made by performing a special attack
    
    public static void normalize() {
    defense = 40;
    attackRating= 0.4;
    }

    //quick tests
    
    public static void main (String[] args){
    Protagonist Kathleen = new Protagonist("Kathleen");
    System.out.println(Kathleen.isAlive());
    System.out.println(Kathleen.getDefense());
    System.out.println(Kathleen.getName());
    Kathleen.specialize();
    System.out.println(Kathleen.getDefense());
    }

}
