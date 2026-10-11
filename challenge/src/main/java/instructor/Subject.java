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


}
