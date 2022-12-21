public class Player {
    private String name;
    private int health;                         // fields
    private int maxDamage;
 
    public Player(String name, int health, int maxDamage){          //3. Constructors
        this.name = name;
        this.health = health;                    // call by main from other file
        this.maxDamage = maxDamage;              // method to assign values
    }
    public String toString(){
        return name + " (" +  health + ") ";       //5. method to return a string, represent object
    }
    public void hit (Player other){                   //6.
        int damage = (int)(Math.random() * maxDamage + 1);            // set dmg
        other.setHealth(other.health - damage);                      
    }
    // getter and setter
    public void setHealth(int health){
        if(health < 0){                              // if health is negative, make it zero
            this.health = 0;
        } else this.health = health;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getHealth(){
        return health;
    }  
    }


