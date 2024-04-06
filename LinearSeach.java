import java.util.*;
public class LinearSeach {

    public static int result(int arr[], int key){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            } 
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.print("Please enter your key : ");
        int key = sc.nextInt();

        System.out.println("Please enter your array elements : ");
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
      
     
        int linear = result(arr, key);
        if(linear == -1){
            System.out.print("KEY NOT FOUND :> ");
        } else {
            System.out.print("KEY FOUND AT INDEX :> " + linear);
        }
   
    
}
    
}
