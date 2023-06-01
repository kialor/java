public class MyNameIs {
    public static void main(String[] args) {
        String nameOutput = printName();
        System.out.println(nameOutput);
    }

    public static String printName(){
        String output = "My name is\n";
        output += "Larry\n";
        output += "Sprinkle";
        return output;
    }
}