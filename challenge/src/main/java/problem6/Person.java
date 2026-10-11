package problem6;

public abstract class Person {
    private String name; //attribute

    public Person(String name){
        this.name=name;
    } //constructor

    public String getName(){
        return this.name;
    } //getter

    public abstract void display(); //a method that we will override
}
