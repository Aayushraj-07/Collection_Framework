package collectionframework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Linked_List_05 {
    public static void main(String[] args) {
//        int i = 010;
//        int j =07;
//        System.out.println(i);
//        System.out.println(j);

//        int mask = 0x000F;
//        int value = 0x2222;
//        System.out.println(mask & value);

//        try {
//            Float f1 = new Float("3.0");
//            int x = f1.intValue();
//            byte b = f1.byteValue();
//            double d = f1.byteValue();
//            System.out.println(x+b+d);
//        }
//        catch (NumberFormatException e) {
//            System.out.println("bad number");
//        }

        String input = "My name is aayush raj 12 12,544.43";

        // Define regular expressions for integer and double types
        String intRegex = "-?\\d+";
        String doubleRegex = "-?\\d*\\.\\d+";
        String StringRegex = "\"[^\"]*\"";

        // Compile patterns
        Pattern StringPattern = Pattern.compile(StringRegex);
        Pattern intPattern = Pattern.compile(intRegex);
        Pattern doublePattern = Pattern.compile(doubleRegex);


        // Initialize counts
        int intCount = 0;
        int doubleCount = 0;
        int stringCount =0;

        //Match Strings
        Matcher stringMatcher =  StringPattern.matcher(input);
        while(stringMatcher.find()) {
            stringCount++;
        }
        // Match integers
        Matcher intMatcher = intPattern.matcher(input);
        while (intMatcher.find()) {
            intCount++;
        }

        // Match doubles
        Matcher doubleMatcher = doublePattern.matcher(input);
        while (doubleMatcher.find()) {
            doubleCount++;
        }

        // Print the result
        System.out.println("String : " + stringCount);
        System.out.println("Integer: " + intCount);
        System.out.println("Double : " + doubleCount);

    }
}



