public class StringPalindrome {
    public static boolean palindrome(String str){
        
        for(int i =0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){

                return false;
            }
        }
        return true;
    }

    public static void alphabetsComparison(){
        for(char ch = 'a'; ch<'z'; ch++){
            char uppercaseChar = Character.toUpperCase(ch);
        }
    }
    public static void main(String args[]){
        String str = "racecar";
      
        System.out.println(palindrome(str));
    }
    
}
