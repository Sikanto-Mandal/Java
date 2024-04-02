public class TwoSum {
    public static int[] twoSum(int arr[],int target){
        for(int i = 0; i<arr.length; i++){
            
            for(int j = i+1; j<arr.length; j++){

                int sum = arr[i]+arr[j];
                
                if(sum == target){
                    return new int[]{i,j};
                    // System.out.print("(" + i+ "," + j+ ")");
                    
                }
            }
            
        }
        return new int[]{};
        
    }
    public static void main(String args[]){
    
        int arr[] = {2,7,3,6};
        int target = 9;
       int [] result=  twoSum(arr, target);
       if (result.length == 2) {
        System.out.println("(" + result[0] + "," + result[1] + ")");
    } else {
        System.out.println("No such pair found.");
    }
    }
    
    
}
