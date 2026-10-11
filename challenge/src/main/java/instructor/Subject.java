package instructor;

public class Subject {
    private int id;
    private String code;
    private String title;

    public Subject(int id,String code,String title){
        this.id=id;
        this.code=code;
        this.title=title;
    }

    public String normalizedCode(){
        if(code==null){
            return null;
        }else{
            return code.trim().toUpperCase();
        }
    }

    public String properTitle(){
        if(title==null || title.isEmpty()){
            return null;
        }
        String[] words=title.split(" ");
        StringBuilder val=new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(!words[i].isEmpty()){
                val.append(words[i].substring(0,1).toUpperCase());
                val.append(words[i].substring(1).toLowerCase());
                if(i<words.length-1){val.append(" ");}
            }

        }
        return val.toString();
    }

    public boolean isIntroCourse(){
        if(title==null || code==null){
            return false;
        }
        String stringCheck=title.toLowerCase();
        return stringCheck.contains("intro")||code.toUpperCase().startsWith("INTRO-");
    }

    public String syllabusLine(Instructor instructor1){
        StringBuilder str1=new StringBuilder();
        str1.append(normalizedCode());
        str1.append(" - ");
        str1.append(properTitle());
        str1.append(" (Instructor: ");
        str1.append(instructor1.getLastName());
        str1.append(" ");
        str1.append(instructor1.getFirstName());
        str1.append(")");
        return str1.toString();
    }

    public static void main(String[] args) {
        Instructor prof1 = new Instructor("Amine", "Abdellaoui", "0600000000", "amine.abdellaoui@um6p.ma", " AB 123");
        Instructor prof2 = new Instructor(null, "Smith", "0612345678", "smith@test.com", "SM456");

        Subject sub1 = new Subject(1, " cs-101", "introduction to java");
        Subject sub2 = new Subject(2, "MATH-200", "linear algebra");

        System.out.println(prof1.cleanEmployeeNumber());
        System.out.println(prof1.summaryLine());
        System.out.println(prof1.displayName());
        System.out.println(prof2.displayName());

        System.out.println(prof1.toCard());

        System.out.println(sub1.normalizedCode());
        System.out.println(sub1.properTitle());
        System.out.println(sub1.isIntroCourse());
        System.out.println(sub2.isIntroCourse());

        System.out.println(sub1.syllabusLine(prof1));
    }


}
