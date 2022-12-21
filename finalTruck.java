public class finalTruck {
    private String name = "";
    private int currentFuel = 0;
    private int maxFuel = 0;

    
    public finalTruck(String name, int currentFuel, int maxFuel) {
        this.name = name;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setCurrentFuel(int currentFuel){
        this.currentFuel = currentFuel;
    }
    public int getCurrentFuel(int currentFuel){
        return currentFuel;
    }
    public void setMaxFuel(int maxFuel){
        this.maxFuel = maxFuel;
    }
    public int getMaxFuel(int maxFuel){
        return maxFuel;
    }
    public String toString(){
        return " " + name + "\n Current Fuel :" + currentFuel + "\n Max Fuel :" + maxFuel;
    }
    
}
