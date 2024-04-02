public class TransposeMatrix {

    public static void printMatrix(int[][] matrix){
        System.out.println("The matrix is : ");
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }           
             System.out.println();
        }
        
    }

    public static void main(String args[]){
        int [][] matrix = {{11, 12, 13},{21, 22, 23}}; 

        int m = matrix.length, n = matrix[0].length;

        //print the Original matrix
        printMatrix(matrix);

        //transpose the matrix

        int[][] transpose = new int[n][m];

        for(int i =0; i<m; i++){
            for(int j = 0; j<n; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        //print transposed matrix

        printMatrix(transpose);

    }
    
}
