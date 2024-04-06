import java.util.*;
public class Input{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        int input;

        while(true){
             System.out.print("Please enter a integer value : > ");
             if(sc.hasNextInt()){
                input = sc.nextInt();
                break;
             }
             else{
                System.out.println("Please enter the valid integer : >");
                sc.next();
             }
        }
        System.out.println("You entered " + input);
        sc.close();
    }
}