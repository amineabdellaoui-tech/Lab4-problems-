package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String phone;
    protected String email;

    //no arguments constructor
    public Person(){

    }

    public Person(String firstName, String lastName, String phone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        // add others
        this.lastName=lastName;
        this.phone=phone;
        this.email=email;
    }

    //getters
    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPhone() {
        return this.phone;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getEmail() {
        return this.email;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static void setNextId(int nextId) {
        Person.nextId = nextId;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    //toString method
    @Override
    public String toString(){
        // adding "=" after lastName
        return "Person [id="+ getId()+", firstName="+getFirstName()+", lastName="+getLastName()+", phone="+getPhone()+", email="+getEmail()+"]";
    }
}

