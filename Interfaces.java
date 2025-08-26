public interface Interfaces {
    public void display(int some);
}
public interface helloWorld {
    public void display();
}
class Sub implements Interfaces,helloWorld{
    @Override
    public void display(int a){
        int c=a+3;
        System.out.println("I'm in subclass " + c);
    }
    // @Override
    // public void msg(){
    //     System.out.println("I am using one more inheritence");
    // }
    public static void main(String[] args) {
        Sub obj=new Sub();
        obj.display(3);
      
    }
}
