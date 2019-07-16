package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        char[] strChar = str.toCharArray();
        strChar[str.length()/2] = Character.toUpperCase(getMiddleCharacter(str));
        return String.valueOf(strChar);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        char[] strChar = str.toCharArray();
        strChar[str.length()/2] = Character.toLowerCase(getMiddleCharacter(str));
        return String.valueOf(strChar);
    }

    public static Boolean isIsogram(String str) {
        String[] strArray = str.split("");
        Set<String> testAgainstSet = new LinkedHashSet<>();
        for(String string: strArray){
            testAgainstSet.add(string);
        }
        if(str.length()==testAgainstSet.size()){
            return true;
        }
        return false;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i-1) == str.charAt(i)){
                return true;
            }
        }

        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        List<Character> myList = new ArrayList<>();
        String result = str;
        for(int i  = 1; i< str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                myList.add(str.charAt(i));
            }
        }
        if(myList.size() > 0) {
            for (Character character : myList) {
                result = result.replace(character.toString(), "");
            }
        }

        return result;
    }

    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for(int i = 0; i<chars.length; i++){
            char toChange = chars[i];
            if(Character.isUpperCase(toChange)){
                chars[i] = Character.toLowerCase(toChange);
            }else if(Character.isLowerCase(toChange)){
                chars[i] = Character.toUpperCase(toChange);
            }
        }
        return new String(chars);
    }
}