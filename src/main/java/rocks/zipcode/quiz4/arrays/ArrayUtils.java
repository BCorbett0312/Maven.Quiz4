package rocks.zipcode.quiz4.arrays;


import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] resultArray = new String[values.length-1];

        for(int i= 0; i<values.length/2; i++){
            resultArray[i] = values[i];
        }

        for(int i= values.length/2 ; i<resultArray.length; i++){
            resultArray[i] = values[i+1];
        }
        return resultArray;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] resultArray = new String[values.length-1];
        for(int i = 0; i <values.length-1; i++)
            resultArray[i] = values[i];
        return resultArray;
    }
}