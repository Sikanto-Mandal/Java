public class Majority {
    public static boolean isMajority(int[] nums, int target){
        int count = 0;
        for(int i = 0; i< nums.length; i++){
            if(target == nums[i]){
                count++;
            
            if(count >= nums.length/2){
                return true;
            }
        }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,2  ,3,4,5,5};
        int target = 2; 
       System.out.print( isMajority(nums,target));
    }
    
}
