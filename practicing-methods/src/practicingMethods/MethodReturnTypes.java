package practicingMethods;

public class MethodReturnTypes {
    public static void main(String[] args){
        System.out.println(textString());

        int num = num();
        System.out.println(num);

        System.out.println(boo());
    }

    public static String textString() {
        return "String of text";
    }

    public static int num(){
        return 5;
    }

    public static boolean boo(){
        return false;
    }
}
