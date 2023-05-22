package task1;

public class SimpleLambda {
    public static void main(String[] args){

        Math add = (a, b) -> a+b;
        Math subtract = (a, b) -> a-b;
        Math multiply = (a, b) -> a*b;
        Math divide = (a, b) -> a/b;

        System.out.println(add.mathOperation(10,5));
        System.out.println(subtract.mathOperation(10,5));
        System.out.println(multiply.mathOperation(10,5));
        System.out.println(divide.mathOperation(10,5));

    }

}
