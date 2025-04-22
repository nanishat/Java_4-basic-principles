//Here I am going to learn four basic principles of Object-Oriented Programming (OOP) by creating an Inventory management system of a video game.
//The features I will be using are: Encapsulations, Inheritance, Abstraction

public class Main {
    public static void main(String[] args) {
        //Here, "new Inventory()" is connecting the constructor from the Inventory class and first Inventory is the "Inventory" class itself.
        Inventory inventory = new Inventory();
        //String string = 'String';

        // performed runtime polymorphism

        //Item item = new Item ("Generic Item", 20);
        Fruit fruit = new Fruit( "Apple", 5, "Fuji");
        Weapon weapon = new Weapon("AK47", 3, 72, "Assault");


        //inventory.addItem(item);
        inventory.addItem(fruit);
        inventory.addItem(weapon);



        //here, performing compile time polymorphism AKA method overloading
        //inventory.addItem("Apple", 5, "Fuji");
        //inventory.addItem("AK47", 3, 72, "Assault");

        //here, I have successfully performed method overloading by using same method name but using different parameter. Though, it isn't an ideal way to represent in this code.

        //first displayInventory is for the method overriding
        inventory.displayInventory();
        System.out.println("\n");
        //second displayInventory is for the method overloading
        //inventory.displayInventory("Fuji");
        //inventory.displayInventory("Assault");


        //System.out.println("Hello and welcome!");

    }
}