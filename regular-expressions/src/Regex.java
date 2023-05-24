import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args){
        System.out.println("Match email: " +matchEmail("yoyo@gmail.com"));
        System.out.println("Match email: " +matchEmail("yoyo@"));

        System.out.println("Match phone number: " +matchPhoneNumber("(920) 555-5555"));
        System.out.println("Match phone number: " +matchPhoneNumber("1-920-555-5555"));

        System.out.println("Match date: " +matchDate("01/21/1995"));
        System.out.println("Match date: " +matchDate("January 21, 1995"));

        System.out.println("Match URL: " +matchURL("https://regexr.com/"));
        System.out.println("Match URL: " +matchURL("google.com"));

        System.out.println("Match credit card: " +matchCreditCard("4444-0000-7777-3333"));
        System.out.println("Match credit card: " +matchCreditCard("18112222333444"));

        System.out.println("Match zip code: " +matchUSZipCode("53081"));
        System.out.println("Match zip code: " +matchUSZipCode("530811245"));

        System.out.println("Match Java identifier: "+matchJavaIdentifier("regularExpression"));
        System.out.println("Match Java identifier: "+matchJavaIdentifier("3_hello"));

        System.out.println("Match hexadecimal color: " +matchHexadecimalColor("#FFFFFF"));
        System.out.println("Match hexadecimal color: " +matchHexadecimalColor("434524"));

        System.out.println("Match time: " +matchTime("12:34"));
        System.out.println("Match time: " +matchTime("12pm"));

    }
    public static boolean matchEmail(String email){
        Pattern pattern = Pattern.compile("[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}");
        Matcher match = pattern.matcher(email);
        return match.matches();
    }

    public static boolean matchPhoneNumber(String phone){
        Pattern pattern = Pattern.compile("^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$");
        Matcher match = pattern.matcher(phone);
        return match.matches();
    }

    public static boolean matchDate(String date){
        Pattern pattern = Pattern.compile("^(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d\\d$");
        Matcher match = pattern.matcher(date);
        return match.matches();
    }

    public static boolean matchURL(String uRL){
        Pattern pattern = Pattern.compile("https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)");
        Matcher match = pattern.matcher(uRL);
        return match.matches();
    }

    public static boolean matchCreditCard(String cardNumber){
        Pattern pattern = Pattern.compile("^4[0-9]{3}-?[0-9]{4}-?[0-9]{4}-?[0-9]{4}$");
        Matcher match =pattern.matcher(cardNumber);
        return match.matches();
    }

    public static boolean matchUSZipCode(String zipCode){
        Pattern pattern = Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?$");
        Matcher match =pattern.matcher(zipCode);
        return match.matches();
    }

    public static boolean matchJavaIdentifier(String identifier){
        Pattern pattern = Pattern.compile("(?:\\b[_a-zA-Z]|\\B\\$)[_$a-zA-Z0-9]*+");
        Matcher match =pattern.matcher(identifier);
        return match.matches();
    }

    public static boolean matchHexadecimalColor(String hexa){
        Pattern pattern = Pattern.compile("^#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$");
        Matcher match =pattern.matcher(hexa);
        return match.matches();
    }

    public static boolean matchTime(String time){
        Pattern pattern = Pattern.compile("^[0-2][0-3]:[0-5][0-9]$");
        Matcher match =pattern.matcher(time);
        return match.matches();
    }
}
