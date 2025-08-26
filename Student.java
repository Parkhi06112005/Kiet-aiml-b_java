public class Student {
    int roll_no;
    String name;

    Student(){
        System.out.println("Please pass some parameters.");
    }
    Student(int Roll_no,String N){
        roll_no=Roll_no;
        name=N;
    }
    Student(Student s){
        roll_no=s.roll_no;
        name=s.name;
    }
    public void display(){
        System.out.println("Roll_no " + roll_no);
        System.out.println("Name " + name);
    }
    public static void main(String[] args) {
         Student s=new Student(12,"parkhi");
         Student s1=new Student(s);
         s1.display();

    }
}
