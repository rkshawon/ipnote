//https://leetcode.com/problems/number-of-islands/
public class Solution {

    private int n;
    private int m;

    public int numIslands(char[][] grid) {
        int count = 0;
        n = grid.length;
        if (n == 0) return 0;
        m = grid[0].length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++)
                if (grid[i][j] == '1') {
                    DFSMarking(grid, i, j);
                    ++count;
                }
        }    
        return count;
    }

    private void DFSMarking(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;
        grid[i][j] = '0';
        DFSMarking(grid, i + 1, j);
        DFSMarking(grid, i - 1, j);
        DFSMarking(grid, i, j + 1);
        DFSMarking(grid, i, j - 1);
    }
}


//https://leetcode.com/problems/flood-fill/
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int origColor = image[sr][sc];
        
        if (newColor == origColor) return image;

        dfs(image, sr, sc, origColor, newColor);
        return image;
    }

    private void dfs(int[][] image, int row, int col, int origColor, int newColor) {
        if (row < 0 || col < 0 || row == image.length || col == image[0].length || image[row][col] != origColor) {
            return;
        }

        image[row][col] = newColor;

        dfs(image, row - 1, col, origColor, newColor);
        dfs(image, row + 1, col, origColor, newColor);
        dfs(image, row, col + 1, origColor, newColor);
        dfs(image, row, col - 1, origColor, newColor);
    }
}