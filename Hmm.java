import java.util.*;
public class Hmm {
    public static int sumOfN(int number){

        if(number == 0){
            return number;
        }
        int fisrt = sumOfN(number-1);

        int sum = fisrt + number;

        return sum;


    }
    public static void main(String args[]){
        // for(int i =1; i<=108; i++){
        //     // System.out.print(i+" Radhe Radhe ");
        // }
        // int a = 4, b=15, c =10;

        // int max = Math.max(a,Math.max( b,c));
    
        // System.out.println("Maximum of three number : "+max);

        int number = 5;
        System.out.print(sumOfN(number));
    }

    
    
}
