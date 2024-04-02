public class ReverseArray {
    public static void reverse(int arr[]){
        int first = 0, end = arr.length-1;

        while(first <end){
            int temp = arr[end];
            arr[end] = arr[first];
            arr[first] = temp;

            first++;
            end--;
        }
    }

    public static void main(String args []){
        int arr[] = {2,3,4,5,6};
        reverse(arr);
        for(int i =1; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }
    
}
