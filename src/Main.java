//Here I am going to learn four basic principles of Object-Oriented Programming (OOP) by creating an Inventory management system of a video game.
//The features I will be using are: Encapsulations, Inheritance,

public class Main {
    public static void main(String[] args) {
        //Here, "new Inventory()" is connecting the constructor from the Inventory class and first Inventory is the "Inventory" class itself.
        Inventory inventory = new Inventory();
        //String string = 'String';

        Item item = new Item ("Generic Item", 20);
        Fruit fruit = new Fruit( "Apple", 5, "Fuji");


        inventory.addItem(item);
        inventory.addItem(fruit);

        inventory.displayInventory();


        //System.out.println("Hello and welcome!");

    }
}