package student;

public class Test {
    public static void main(String[] args) {
        //creating a couple of major
        Major major1 = new Major("22","Architecture");
        Major major2 = new Major("24","Medicine");
        Major major3 = new Major("23","Computer Science");
        Major major4 = new Major("26","Chemistry");

        //creation students
        Student student1 =new Student("Ahmed","Boutrika","0610102020","ahmed.boutrika@um6p.ma","120",major1);
        Student student2 =new Student("Mohamed","Karim","0712171625","mohamed.karim@um6p.ma","121",major1);
        Student student3 =new Student("Aicha","Alaoui","0678451203","aicha.alaoui@um6p.ma","122",major1);
        Student student4 =new Student("Salma","Benkirane","0789562341","salma.benkirane@um6p.ma","123",major1);

        Student student5 = new Student("Youssef", "El Fassi", "0611223344", "youssef.elfassi@um6p.ma", "124", major2);
        Student student6 = new Student("Fatima", "Zahra", "0622334455", "fatima.zahra@um6p.ma", "125", major2);
        Student student7 = new Student("Omar", "Bennis", "0633445566", "omar.bennis@um6p.ma", "126", major2);
        Student student8 = new Student("Sara", "Chraibi", "0644556677", "sara.chraibi@um6p.ma", "127", major2);

        Student student9 = new Student("Hassan", "Tazi", "0655667788", "hassan.tazi@um6p.ma", "128", major3);
        Student student10 = new Student("Khadija", "Idrissi", "0666778899", "khadija.idrissi@um6p.ma", "129", major3);
        Student student11 = new Student("Anas", "Lahlou", "0677889900", "anas.lahlou@um6p.ma", "130", major3);
        Student student12 = new Student("Meryem", "Amrani", "0688990011", "meryem.amrani@um6p.ma", "131", major3);

        Student student13 = new Student("Ilyas", "Berrada", "0699001122", "ilyas.berrada@um6p.ma", "132", major4);
        Student student14 = new Student("Zineb", "El Amrani", "0600112233", "zineb.elamrani@um6p.ma", "133", major4);
        Student student15 = new Student("Hamza", "Benjelloun", "0612345678", "hamza.benjelloun@um6p.ma", "134", major4);
        Student student16 = new Student("Leila", "Mennani", "0687654321", "leila.mennani@um6p.ma", "135", major4);

        // Display computer science students
        major3.displayStudents();

        Student foundStudent = major2.findStudentByCNE("127");
        System.out.println("Student found with CNE 127: " + foundStudent);


        major1.getOccupancyRate();

        System.out.println(major3.getStudentListAsString());

        // printing
        boolean isRemoved = major4.removeStudent("134");
        System.out.println("Was student 134 successfully removed? " + isRemoved);


    }
}

