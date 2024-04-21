import java.util.*;
public class ReverseString {
    public static String reverse(String str){
        char charArray[] = str.toCharArray();
        int start = 0;
        int end = charArray.length-1;
        while(start < end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start ++;
            end--;
        }
        String reversed = new String (charArray);
        return reversed;
    }
    public static void main(String[] args) {
        String str ="sikanto";

        System.out.println("Actual String : " + str);
        System.out.print("Reverse String : "+reverse(str));
    }    
}
