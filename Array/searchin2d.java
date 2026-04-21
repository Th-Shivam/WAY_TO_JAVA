class Searchin2d {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        
        int n = matrix.length;        // Number of rows
        int m = matrix[0].length;     // Number of columns
        
        // Start at the Top-Right corner
        int row = 0; 
        int col = m - 1;    
        
        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {
                return true; // Found it
            } else if (matrix[row][col] < target) {
                // Current is too small, go down to find bigger numbers
                row++;
            } else {
                // Current is too big, go left to find smaller numbers
                col--;
            }
        }
        
        return false; // Out of bounds, target not found
    }
}