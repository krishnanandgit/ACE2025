package tools;

class A{
    public A(){
        super();
        System.out.println("In tools.A");
    }
    public A(int n){
        super();
        System.out.println("In int tools.A");
    }

}
class B extends A{
    public B(){
        super();
        System.out.println("In tools.B");
    }
    public B(int n){
        this();
        System.out.println("In int tools.B");
    }

}
public class demo {
    public static void main(String[] args) {
        B obj = new B(3);
    }
}
