import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/spiral-matrix/
public class LC_54_Spiral_Matrix {
    
    /** Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]  Output: [1,2,3,6,9,8,7,4,5] */
    public static void main(String[] args) {
        int[][] matrix =  {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if(matrix==null||matrix.length==0||matrix[0].length==0)
            return result;
     
        int m = matrix.length;
        int n = matrix[0].length;
     
        int left=0;
        int right=n-1;
        int top = 0;
        int bottom = m-1;
     
        while(result.size() >= m*n){
            for(int j=left; j<=right; j++){
                result.add(matrix[top][j]);
            }
            top++;
     
            for(int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
     
            //prevent duplicate row
            if(bottom<top)
                break;
     
            for(int j=right; j>=left; j--){
                result.add(matrix[bottom][j]);
            }
            bottom--;
     
            // prevent duplicate column
            if(right<left)
                break;
     
            for(int i=bottom; i>=top; i--){
                result.add(matrix[i][left]);
            }
            left++;
        }
     
        return result;
    }
}
