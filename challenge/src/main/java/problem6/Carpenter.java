package problem6;

public class Carpenter extends Person{
    public Carpenter(String name){
        super(name);
    } //constructor

    @Override
    public void display(){
        System.out.println( "I am "+getName()+" the Carpenter"); //printing
    }
}
