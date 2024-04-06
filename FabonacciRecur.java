public class FabonacciRecur {
    public static int fib(int n){
        if(n ==0 || n == 1){
            return n;
        }
        int fibN1 = fib(n-1);
        int fibN2 = fib(n-2);

        int fib = fibN1 + fibN2;
        return fib;
    }
    public static void main(String[] args) {
        int n =7;
        System.out.println(fib(n));
    }
    
}
