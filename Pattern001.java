public class Pattern001 {
    public static void pattern (int n){
        for(int i =0; i<5; i++){
            // for(int j = 1; j<=n-i; j++){
            //     System.out.print(" ");
            // }
            // System.out.printf("%" + (n - i)  + "s", ""); 
            System.out.printf("%"+ (n-i)+ "S","");
            for(int j =0; j<=i; j++){
                System.out.print("*");

            }
            System.out.println();
           
        }
        
    }
    public static void main(String[] args) {
        int n =5;
        pattern(n);
        
    }
    
}
