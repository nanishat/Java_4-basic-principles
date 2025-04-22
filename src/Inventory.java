import java.util.ArrayList;

public class Inventory {

    //creating a ArrayList filed so that it can store some group of object.
    final private ArrayList<Item> items;

    //Constructor of Inventory.
    public Inventory() {
        //Assigning new object or arrays of item into the Items object
        items = new ArrayList<>();
    }

    //this method is adding item to the Inventory, Here we can see the reflection of encapsulation
    public void addItem(Item item){

        items.add(item);
    }

    //we are overloading the addItem method to do other thing than just adding items

    public void addItem(String name, int quantity, String type){
        items.add(new Fruit(name, quantity, type));
    }

    public void addItem(String name, int quantity, int damage, String type){
        items.add(new Weapon(name, quantity, damage, type));
    }

    //just like that, I have created two addItem method for Overloading to perform compile time polymorphism.


    //example of method overriding AKA runtime polymorphism
    public void displayInventory (){
        //Java enhanced for loop (also called a "for-each" loop), and it's iterating through a collection named 'items'
        for (Item item : items) {
            //System.out.println(item.toString());
            item.displayInfo();
        }

    /*
    //example of method overloading AKA compile time polymorphism
    public void displayInventory (String type){
        for (Item item: items){
            if (item instanceof Fruit && ((Fruit) item).getType().equalsIgnoreCase(type)) {
                System.out.println(item.toString());
            } else if (item instanceof Weapon && ((Weapon) item).getType().equalsIgnoreCase(type)) {
                System.out.println(item.toString());
            }
        }*/
    }
}



//KEY NOTE: Everything that in the interface, assumed as an abstract class