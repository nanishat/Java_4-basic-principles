public abstract class Item {
    //declaring variables for item
    private final String name;
    private final int quantity;

    //constructor { The Java constructor, a simple method, is used to initialize Java objects. It is automatically invoked at the time of object creation to set the object's preliminary states. }
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    //building access modifier for declared variables { to get access outside from this class }
    public String getName() {

        return name;
    }

    public int getQuantity() {

        return quantity;
    }

    /*
    @Override //performed runtime polymorphism
    public String toString(){
        return "Item: " + name + ", Quantity: " + quantity;
    }*/

    public abstract void displayInfo();
}
