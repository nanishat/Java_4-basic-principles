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

    public void displayInventory (){
        //Java enhanced for loop (also called a "for-each" loop), and it's iterating through a collection named 'items'
        for (Item item : items) {
            System.out.println(
                    "Item: " + item.getName() + ", Quantity: " + item.getQuantity()
            );
        }
    }
}
