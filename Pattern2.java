public class Pattern2 {
    public static void pattern2(int n){
        for(int i = 0; i<n; i++){

            //spaces
            System.out.printf("%"+(n-i)+"s","");
            

            //star
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }

            //nextLine
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int n =5;
        pattern2(n);
    }
    
}
