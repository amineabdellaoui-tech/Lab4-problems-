package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    //no arguments constructor
    public Major(){

    }

    public Major(String code, String name) {
        this.id = nextId++; // Auto-incrémentation of the ID de la Major
        this.code=code;
        this.name=name;
        this.students=new Student[50];
        this.studentCount=0;
    }

    // Method to add a student
    public void addStudent(Student s) {
        this.students[studentCount]=s;
        studentCount++; //incrementing studentCount
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public int getStudentCount() {
        return this.studentCount;
    }

    public Student[] getStudents() {
        return this.students;
    }

    //setters


    public void setCode(String code) {
        this.code = code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Display all students in the major
    public void displayStudents() {
        System.out.println("The list of students in the "+this.getName()+" major is: ");
        for(int i=0;i<studentCount;i++){ //looping
           System.out.println((i+1)+". "+getStudents()[i].getCne()+" "+getStudents()[i].getLastName()+" "+getStudents()[i].getFirstName());
        }
    }

    public Student findStudentByCNE(String cne){
        for(int i=0;i<studentCount;i++){ //looping
            if(getStudents()[i].getCne().equals(cne)){
                return getStudents()[i];
            }
        }
        return null;
    }

    public boolean removeStudent(String cne){
        if(findStudentByCNE(cne)==null){ //checking
            return false;
        }else{
            for(int i=0;i<studentCount;i++){ //looping
                if(getStudents()[i].getCne().equals(cne)){ //finding
                    for(int j=i;j<studentCount-1;j++){ //translate
                        this.students[j]=this.students[j+1];
                    }
                }
            }
            this.students[studentCount-1]=null; //remove
            studentCount--; //decrease
            return true;
        }
    }

    public void getOccupancyRate(){
        double ratio= ((double)studentCount/students.length)*100; //calculate the ratio
        System.out.println(this.getName()+" capacity: "+students.length+" students ");
        System.out.println("Current enrollment : "+studentCount+" students");
        System.out.println("Occupancy rate ="+ratio+"%");
    }

    public String getStudentListAsString(){
        StringBuilder allstudents = new StringBuilder(); //using StringBuilder
        for(int i=0;i<studentCount;i++){ //looping
            allstudents.append(getStudents()[i]);
            allstudents.append("\n");
        }
        return allstudents.toString();
    }
}
