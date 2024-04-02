public class SumOf2ndRow {

    public static int sumOf2ndRow(int[][] nums){
        int row =1; 
        // int col = nums[0].length-1;
        int col =0;
        int sum =0;
       // while(col >= 0){
        while(col <= nums[0].length-1){
            sum += nums[row][col];
            col++;
            System.out.println("single line sum : "+sum);
        }
        return sum;
    }
    public static void main(String args[]){
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        System.out.println(sumOf2ndRow(nums));
    }
    
}
