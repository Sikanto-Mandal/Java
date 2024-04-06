public class RecursionFabonacci {
    public static int fab(int n){
        if(n ==0){
            return 1;
        }
        // int fn1 = fab(n-1);
        // int fn = n*fn1;
        int fn= n*fab(n-1);
        return fn;
    }
    public static void main(String[] args) {
        int n=4;
       System.out.print( fab(n));
    }
    
}
