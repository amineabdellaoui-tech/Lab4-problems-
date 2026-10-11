package instructor;

import student.Person;

public class Instructor extends Person {
    private String employeeNumber;

    //constructor
    public Instructor(String firstName, String lastName, String phone, String email,String employeeNumber){
        super(firstName,lastName,phone,email);
        this.employeeNumber=employeeNumber;
    }

    //method String cleanEmployeeNumber()
    public String cleanEmployeeNumber(){
        if(employeeNumber==null){
            return null;
        }else{
            return employeeNumber.replace(" ",""); //I use .replace to chnage every space by nothing
        }
    }

    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",cleanEmployeeNumber(),lastName,firstName);
    }

    public String toCard(){
        StringBuilder card=new StringBuilder();
        card.append("Instructor");
        card.append("\n");
        card.append("--------");
        card.append("\n");
        card.append("Employee #: ");
        card.append(employeeNumber);
        card.append("\n");
        card.append("Name : ");
        card.append(lastName);
        card.append(", ");
        card.append(firstName);
        card.append("\n");
        card.append("Email : ");
        card.append(email);
        card.append("\n");
        card.append("Phone : ");
        card.append(phone);
        return card.toString();
    }

    public String displayName(){
        StringBuilder str2=new StringBuilder();
        if(getLastName()!=null){
            str2.append(getLastName());
        }
        if(getFirstName()!=null){
            if(str2.length()>0){
                str2.append(" ");
            }
            str2.append(getFirstName());
        }
        return str2.toString();
    }
}
