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

}
