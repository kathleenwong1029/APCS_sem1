//The Coca-Cola Company: Ben Shapiro, Kathleen Wong, Aidan Griffin
//APCS1 pd1
//HW #28 - Ye Olde Role Playing Game
//2017-11-08

public class Monster{

    //variable creation

    public static String name;
    public static int HP;
    public static int strength;
    public static int defense;
    public static double attack;

    //Constructor: initializes variables/monster stats
    
    public Monster(){ 
        HP = 150;
    strength = (int)(Math.random()*45)+20;
    defense = 20;
    attack = 1;
    }

    //isAlive: checks if the monster is alive by checking if the monster's health is greater than 0: if not, the monster is dead (returns false)   
    
    public static boolean isAlive(){ 
    return (HP > 0);
    }

    //getDefense: returns the defense stat of the monster

    public static int getDefense(){

    return defense;
    }

    //getName: returns the name of the monster

    public static String getName (Monster a){

    return a.name;
    }

    //lowerHP: changes the monster's current HP based on how much damage it took in a turn. If HP reaches 0 or less, the monster is dead

    public static int lowerHP(int damage){
    
    HP = HP - damage;

    return HP;
    }

    //attack: Calculates damage done by the monster to the Protagonist, based on the monster's strength and attack and the protagonist's defense stat
    
    public static int attack(Protagonist b){

    int damage = ((int)(strength *  attack) - b.defense);
    b.lowerHP(damage);
    return damage;

    }

    //main: quick test

    public static void main(String [] args){
    Monster Ben = new Monster();
    System.out.println(Ben.strength);
    }
}
    
	
