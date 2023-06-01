public class Casting {
        public double getDoubleValue() {
            double data = 112.35;
            System.out.println("Double: " + data);
            return data;
        }

        public int getIntValue(double data) {
            int number = (int) data;
            System.out.println("int: " + number);
            return number;
        }

        public String getStringValue() {
            String myString = "49";
            System.out.println("The string value is: " + myString);
            return myString;
        }

        public int parseStringToInt(String myString) {
            int value = Integer.parseInt(myString);
            System.out.println("The integer value is: " + value);
            return value;
        }
}