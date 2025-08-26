public class Parent {
    public void display(){
        System.out.println("You are in parent class");
    }
}
class child extends Parent{
    public void display(){
        System.out.println("I am in subclass");
        super.display();
    }
    public static void main(String[] args) {
        child obj=new child();
        obj.display();
    }
}
