public class Pattern3 {
    public static void pattern3(int n){
        for(int i = 0; i<n; i++){
            //space
            System.out.printf("%"+(n-i)+"s","");
            
            for(int j = 0; j<=i ; j++){
                if(j==0 || j == i || i == n-1){
                    System.out.print("*");
                } else{
                System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n =5;
        pattern3(n);
    }
    
}
