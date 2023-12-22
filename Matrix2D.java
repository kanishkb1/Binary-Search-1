// Time Complexity : O(log n) (binary search approach) 
// Space Complexity : O(1) as no extra space is used.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: In this question, we have try to visualize the 2D array into single array and then used the binary search algorithm. We have adjust the 'high' variable based on the row and column.



class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int low = 0;
        int high = m*n;
        int mid;
        int row, column;
        while(low < high){
            mid = low + (high - low) / 2;

            row = mid / n;
            column = mid % n;
            if (matrix[row][column]==target) 
                return true;

            else if (matrix[row][column] >= target){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
    }
}