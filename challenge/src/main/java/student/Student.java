package student;

public class Student extends Person {
    private String cne;
    private Major major;

    //no arguments constructor
    public Student(){

    }

    public Student(String firstName, String lastName, String phone, String email, String cne, Major major) {
        super(firstName,lastName,phone,email); //we use super for the arguments coming from Person because Student extends Person
        this.cne=cne;
        this.major=major;

        //Qst 3
        if(this.major!=null){
            this.major.addStudent(this);
        }
    }

    //qst 1 : Computer Science (constructor chaining)
    public Student(String firstName, String lastName, String phone, String email, String cne){
        this(firstName,lastName,phone,email,cne,new Major("23","Computer Science"));
    }

    // Getters
    public String getCne(){
        return this.cne;
    }

    public Major getMajor(){
        return this.major;
    }


    // Setters
    public void setCne(String cne){
        this.cne=cne;
    }

    public void setMajor(Major major){
        this.major=major;
    }

    @Override
    public String toString(){
        return "Student [id="+ getId()+", firstName="+getFirstName()+", lastName="+getLastName()+", phone="+getPhone()+", email="+getEmail()+", cne="+getCne()+", major="+getMajor()+"]";
    }

    //method getFullNameFormatted()
    public String getFullNameFormatted(){
        StringBuilder string1 = new StringBuilder();
        string1.append(getLastName().toUpperCase());
        string1.append(", ");
        string1.append(getFirstName());
        return string1.toString();
    }

}

