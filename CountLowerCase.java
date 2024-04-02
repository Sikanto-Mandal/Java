/*Count how many times lowercase vowels occurred ina string entered by the user */
import java.util.Scanner;
public class CountLowerCase {
    public static int coutLowerCase(String str){
        int count = 0;
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch =='a'  || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u'){
                count++;
            }
        }        
        return count;
    }
    public static void main (String args[]){
        System.out.print("Please enter the String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("LowerCase vowels : "+coutLowerCase(str));
    }
    
    
}
