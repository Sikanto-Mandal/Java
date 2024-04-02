public class Palindrome {
    public static boolean palindrome(int num){
        int myNum = num;
        int palin = 0;
        while(num >0){
            palin = palin*10 + num%10;
            num/=10;
        }
        if(myNum == palin){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String args[]){
        int num = 123454321;
    
        System.out.println(palindrome(num));
    }
    
}
