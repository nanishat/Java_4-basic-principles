//Here I am going to learn four basic principles of Object-Oriented Programming (OOP) by creating an Inventory management system of a video game.
//The features I will be using are: Encapsulations,

public class Main {
    public static void main(String[] args) {
        //Here, "new Inventory()" is connecting the constructor from the Inventory class and first Inventory is the "Inventory" class itself.
        Inventory inventory = new Inventory();
        //String string = 'String';

        Item item1 = new Item ("Banana", 20);
        Item item2 = new Item ("Bullet", 10);

        inventory.addItem(item1);
        inventory.addItem(item2);

        inventory.displayInventory();


        //System.out.println("Hello and welcome!");

    }
}