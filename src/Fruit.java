public class Fruit extends Item{

    //to know, which type of fruits
    private final String type;


    //constructor
    public Fruit(String name, int quantity, String type){
        super(name, quantity);
        this.type = type;
    }

    public String getType(){

        return type;
    }

    /*
    @Override //performed runtime polymorphism
    public String toString(){
        return "Fruit: " + getName() + ", Quantity: " + getQuantity() + ", Type:" + type;
    }*/

    @Override
    public void displayInfo() {
        System.out.println("Weapon: " + getName() + ", Quantity: " + getQuantity() + ", Type:" + getType());
    }

}
