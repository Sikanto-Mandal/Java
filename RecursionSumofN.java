public class RecursionSumofN {
    public static int sum(int n){
        if(n ==1){
            return 1;
        }
        int fn1 =sum(n-1);
        int sum = n + fn1;
        return sum;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(sum(n));
    }
    
}
