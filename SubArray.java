public class SubArray {
    public static void subArray(int number[]){
        int ts =0;
        for(int i =0; i<number.length; i++){
            // System.out.println(number[i]);
            int start = i;
            
            for(int j = i; j<number.length; j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print(number[k]+ " ");
                }

            ts++;
                System.out.println();
            }
            System.out.println();            
        }
        System.out.print("Total SubArray : "+ ts);
    }
        public static void main(String args[]){
            int number[] = {2,4,6,8,10};
            subArray(number);
        }
        
    }
    
    

