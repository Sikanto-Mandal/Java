public class StrairCaseSearch {
    public static boolean strairCase(int matrix[][], int key){
        int col =0, row = matrix.length-1;

        while(col <= matrix.length && row >= 0){
            if(matrix[row][col] == key){
                System.out.println("Key is found at (" + row + ","+ col+")");
                return true;
            }
            else if( key < matrix[row][col]){
                row--;
            }else{
                col++;
            }

        }
        System.out.print("Key not found!");
        return false;

    }
    public static void main(String args[]){
        int matrix[][] ={{1,2,3,4},
                        {5,6,7,8}, 
                        {9,10,11,12},
                        {13,14,15,16}};
        int key = 11;
        strairCase(matrix, key);
                        
        

    }
    
}
