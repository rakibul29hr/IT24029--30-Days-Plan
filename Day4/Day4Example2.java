class MathOperations{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){   return a+b;}

}
public class Day4Example2 {
    public static void main ( String[] args){

        MathOperations doAddition= new MathOperations();

        System.out.println(doAddition.add(2,3));
        System.out.println(doAddition.add(2,3,5));
        System.out.println(doAddition.add(2.3,3.5));
    }
}
