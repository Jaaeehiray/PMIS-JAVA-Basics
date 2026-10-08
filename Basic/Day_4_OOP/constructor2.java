package Basic.Day_4_OOP;

class studentprofile{
    String  full_name;
    int std_id;
    double finalscore;

    studentprofile(String full_name, int std_id, double finalscore){
        this.full_name = full_name;
        this.std_id = std_id;
        this.finalscore = finalscore;
    }

    studentprofile(String full_name, int std_id){
        this.full_name = full_name;
        this.std_id = std_id;
        this.finalscore = 0.0; // Default score if not provided
    }
    char grade(){
        if(finalscore >= 90){
            return 'A';
        }
        else if(finalscore >= 75){
            return 'B';
        }
        else if(finalscore >= 50){
            return 'C';
        }
        else{
            return 'F';
        }

    }
    void reportcard(){
        System.out.println("name:" + full_name);
        System.out.println("std_id:" + std_id);
        System.out.println("score:" + finalscore);
        System.out.println("Grade" + grade() );

    }

}
public class constructor2 {
    public static void main(String[]args){
studentprofile s1 = new studentprofile("jaaee",01,82.5);
studentprofile s2 = new studentprofile("Ankita",02);
s1.reportcard();
s2.reportcard();

    }
    
}
