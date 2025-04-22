public class Weapon extends Item{
    private final int damage;
    private final String type;

    //constructor
    public Weapon (String name, int quantity, int damage, String type
    ){
        super(name, quantity);
        this.damage = damage;
        this.type = type;
    }

    public int getDamage(){

        return damage;
    }

    public String getType(){

        return type;
    }

    /*
    @Override //performed runtime polymorphism
    public String toString(){
        return "Weapon: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + getDamage() + ", Type:" + getType();
    }*/

    //performing abstract method

    @Override
    public void displayInfo() {
        System.out.println("Weapon: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + getDamage() + ", Type:" + getType());
    }
}
