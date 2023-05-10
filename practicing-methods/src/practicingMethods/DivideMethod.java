package practicingMethods;
public class DivideMethod {
    public static void main(String[] args){
        double num1 = 1;
        double num2 = 3;
        double divideResult = divide(num1, num2);
        System.out.println(num1 + " / " +num2+ " = " +divideResult);
    }
    public static double divide(double num1, double num2) {
        return num1/num2;
    }
}
