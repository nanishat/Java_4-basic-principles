        //public class Fruit implements ItemStuff
        public class Fruit extends Item{

    //to know, which type of fruits
    private final String type;
    //private final String name; //trying out abstract method
    //private final int quantity; //trying out abstract method

    //constructor
    public Fruit(String name, int quantity, String type){
        super(name, quantity);
        //this.name = name; //trying out abstract method
        //this.quantity = quantity; //trying out abstract method
        this.type = type;
    }

    //trying out abstract method
    /*public String getName() {

            return name;
        }

    public int getQuantity() {

            return quantity;
        }*/

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
