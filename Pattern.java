public class Pattern {
    public static void printPattern(int n){       
        for(int i =1; i<=n; i++){

            // left side numbers
            for(int j =1; j<=i; j++){
                System.out.print(j);                
            }   
            //space   
            for(int k = 1; k<=2*(n-i)-1; k++){
                System.out.print(" ");
            }

            //right side numbers
            for(int j =i; j>=1; j--){
                if(j !=n)
                  System.out.print(j);                
            }                
        System.out.println();   
        }      
    }         
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
    
}
