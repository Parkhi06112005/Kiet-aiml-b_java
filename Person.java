public class Person {
    public String address;
    public Person(String address){
        this.address=address;
    }
    public void get_address(){
        System.out.println("Your address " +address);
    }
    public static void main(String[] args) {
        Person a=new Person("hello");
        a.get_address();
    }
}
public class School_Student extends Person{
    public String course;
    public School_Student(String address,String course){
        super(address);
        this.course=course;
    }
    public void get_Course(){
        System.out.println("your course "+course);
    }
    public static void main(String[] args) {
        School_Student obj=new School_Student("aligarh", "btech");
        obj.get_Course();
       
    }
}
