import java.util.*;
public class Hmm {
    // public static int sumOfN(int number){

    //     if(number == 0){
    //         return number;
    //     }
    //     int fisrt = sumOfN(number-1);

    //     int sum = fisrt + number;

    //     return sum;


    // }
    public static void main(String args[]){
        // for(int i =1; i<=108; i++){
        //     // System.out.print(i+" Radhe Radhe ");
        // }
        // int a = 4, b=15, c =10;

        // int max = Math.max(a,Math.max( b,c));
    
        // System.out.println("Maximum of three number : "+max);

        // int number = 5;
        // System.out.print(sumOfN(number));



int n = 8;    //n is the number of rows you want to print  
for (int i = 0; i < n; i++)   
{  
int number = 1;  
System.out.printf("%" + (n - i) * 2 + "s", "");  
for (int j = 0; j <= i; j++)   
    {  
    System.out.printf("%4d", number);  
    number = number * (i - j) / (j + 1);  
}  
    System.out.println();  
}  

// int n = 5;
// for(int i = 1; i<=n; i++){
//     for(int j = 1; j <=n-i; j++){
//         System.out.print(" ");
//     }
//     for(int j= 1 ; j<= (2*i)-1; j++){
//         System.out.print("*");
//     }
//     System.out.println();

// }

// for(int i = n-1; i>=1; i--){
//     for(int j = 1; j <=n-i; j++){
//         System.out.print(" ");
//     }
//     for(int j= 1 ; j<= (2*i)-1; j++){
//         System.out.print("*");
//     }
//     System.out.println();

// }
//     System.out.println();

// for(int i =1; i<=n; i++){
//     for(int j =1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     for(int j = 1; j<=(2*i)-1; j++ ){
//         if(j==1 || j==(2*i)-1){
//         System.out.print("*");
//         }else
//         System.out.print(" ");        
//     }
//     System.out.println();
//  }
//  for(int i =n-1; i>=1; i--){
//     for(int j =1; j<=n-i; j++){
//         System.out.print(" ");
//     }
    // for(int j = 1; j<=(2*i)-1; j++ ){
    //     if(j==1 || j==(2*i)-1){
    //     System.out.print("*");
    //     }else
    //     System.out.print(" ");        
    // }
//     System.out.println();
//  }
}
}

