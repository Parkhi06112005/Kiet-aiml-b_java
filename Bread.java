public class Bread {
    static int bread=10;
    public static void display(){
        System.out.println("Slices left " +bread);
    }
    public static void Eat(){
       bread--;
    
    }
    public static void main(String[] args) {
        Bread.display();
        Bread.Eat();
        Bread.display();
         Bread.Eat();
         Bread.display();
    }
}
