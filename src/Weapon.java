public class Weapon extends Item{
    private final int damage;
    private final String type;

    //constructor
    private Weapon (String name, int quantity, int damage, String type
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
}
