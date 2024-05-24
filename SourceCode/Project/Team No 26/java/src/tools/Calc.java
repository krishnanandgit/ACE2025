package tools;
public class Calc {
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }

}
class AdvCalc extends Calc{
    public int multi(int a,int b){
        return a*b;
    }
    public int div(int a ,int b){
        return a/b;
    }
}