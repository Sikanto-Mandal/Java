public class Pattern6 {
    public static void main(String args[]){
        int n =5;

        for(int i = 0; i<n; i++){
            for(int j = n-i; j>=1; j--){
                if(i == 0 || j == n-i ||j==1){                
                 System.out.print(j);
                } else{
                     System.out.print(" ");
                }                
            }
        
            // System.out.printf("%"+(2*i-1)+"s","");
            for(int j =1; j<= 2*i -1; j++){
                System.out.print(" ");

            }
            for(int j = 1; j<=n-i; j++){
                 if(i == 0 || j == 1 ||j==n-i){                
                 System.out.print(j);
                } else{
                     System.out.print(" ");
                }  

            }

            System.out.println();
        }
    }
    
}
