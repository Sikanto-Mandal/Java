public class PascalsPattern {
    public static void pascal(int n){
        for(int i = 0; i<n; i++){
            //space
            // for(int j =0; j<n-i; j++){
            //     System.out.print(" ");
            // }
            System.out.printf("%" + (n-i)*2 +"s", "");
            
            //numbers

            int number = 1;
            
            for(int k  =0; k <=i ; k++){
                System.out.printf("%4d",number);
                number = number * (i-k )/ (k+1);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int row = 5;
        pascal(row);
    }

    
}
