class OuterClass{
    int outerVariable=10;
    class InnerClass{
        void display(){
            System.out.println("Outer variable value: " + outerVariable);
        }
    }
}
public class Day5Example2 {
    public static void main(String[] args){
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner=outer.new InnerClass();
        inner.display();
    }
}
