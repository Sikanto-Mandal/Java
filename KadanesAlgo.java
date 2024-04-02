public class KadanesAlgo {
    public static void kadanes(int[] nums){
        int cs=0, ms= Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            cs = cs+nums[i];

            // if(cs <0){
            //     cs =0;
            // }
            ms= Math.max(ms, cs);
        }
        System.out.print("Max subArray : " + ms);
    }
    public static void main(String args[]){
        int [] number = {-1,2,-3,4};
    
        kadanes(number);
        
    }
    
}
