import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        /*System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));*/

        /*System.out.println(intMax(1, 2, 3) );
        System.out.println(intMax(1, 3, 2));
        System.out.println(intMax(3, 2, 1));*/

        /*System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));
        System.out.println(stringYak("notfound"));*/

        /*int[] array = {1,1,2,3,1};
        boolean arrayEx123 = array123(array);
        System.out.println(arrayEx123);*/

        /*System.out.println(old35(3));
        System.out.println(old35(10));
        System.out.println(old35(15));*/

        /*System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));*/

        /*System.out.println(countHi("xxhixx"));
        System.out.println(countHi("xhixhix"));
        System.out.println(countHi("hi"));*/

        /*Map<String, String> food = new HashMap<>();
        food.put("ice cream", "peanuts");
        //food.put("pancake", "syrup");
        topping1(food);
        System.out.println(food);*/

    }
   public static boolean sleepIn(boolean weekday, boolean vacation) {
        /*sleep in if weekday is false
        sleep in if vacation remains true
        if either or occur then we can sleep in and return true
        otherwise we return false bc we can't sleep in*/
        if(!weekday || vacation){
            return true;
        }else{
            return false;
        }
    }

    public static int intMax(int a, int b, int c) {
        /*
        find the max between three numbers by comparing each number to each other
        first if a is greater than b and c, a is the largest.
        do the same for b, and if a or b is not greater, then c is the largest
         */
        if(a > b && a > c){
            return a;
        }else if(b > a && b > c){
            return b;
        }else{
            return c;
        }
    }

    public static String stringYak(String str) {
        /*
        if the string contains "yak", it will be replaced with an
        empty string. the new string will be returned.
        otherwise the original string will be returned.
         */
        if(str.contains("yak")){
            str = str.replace("yak", "");
            return str;
        }else {
            return str;
        }
    }


    public static boolean array123(int[] nums) {
        /*
        iterate through the array and make sure that the array
        has at least three numbers in order to check for 1,2,3.
        if the number at index of i is 1 and the next is 2, and
        the next after that index is 3 then return true, else
        return false
         */

        for(int i=0; i < nums.length -2; i++){
            if(nums[i] == 1 && nums[i+1] ==2 && nums[i+2] ==3){
                return true;
            }
        }
        return false;
    }

    public static boolean old35(int n) {
        /*
        since the non-neg number cannot return true if it is a multiple
        of 3 and 5, it will check that first and return false if it is.
        if it is a multiple of either 3 or 5, then it will return true,
        otherwise return false.
         */
        if(n%3==0 && n%5==0){
            return false;
        }else if (n%3==0 || n%5==0){
            return true;
        }else{
            return false;
        }
    }

    public static String doubleChar(String str) {
        /*
        First start off with an empty string where we will store our
        letters. Iterate through each letter of the string and at
        each index, we take that character and set it to a variable.
        we add that character twice to the empty string we created.
        Return the string when done iterating through the length of
        the letters in the string.
         */
        String localStringResult = "";
        for(int i = 0; i < str.length(); i++){
            char character = str.charAt(i);
            localStringResult+=character;
            localStringResult+=character;
        }
        return localStringResult;
    }

    public static int countHi(String str) {
        /*
        first, check if string is less than two characters.
        then we check if the first two letters are equal to hi.
        if it is then we count it as 1. we continue by calling
        the method again starting at the second index.

        if hi is not found as the first two letters, we call the
        method again and continue with the letter at index 1.

        each hi that is found will be added to the previous result
         */
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2));
        } else {
            return countHi(str.substring(1));
        }
    }

    public static Map<String, String> topping1(Map<String, String> map) {
        /*
        if the map contains the key of ice cream, we modify the
        value of ice cream to be cherry, then we add another
        key value pair of bread and butter and return the map.
         */
        if (map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;

    }

}
