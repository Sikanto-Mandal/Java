import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrams {
    public static boolean isAnagrams(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] str1charArray = str1.toCharArray();
        char[] str2charArray = str2.toCharArray();

        Arrays.sort(str1charArray);
        Arrays.sort(str2charArray);

        boolean result = Arrays.equals(str1charArray, str2charArray);

        if(result){
            return true;
        } 
        return false;
        
    }
    public static void main(String args[]){
        String str1 ="Earth";
        String str2 = "HeRt";
        System.out.println(isAnagrams(str1, str2));

       

        
    }
}
    

