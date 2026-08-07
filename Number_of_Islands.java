#include <stdio.h>

void dfs(char** grid, int rowSize, int colSize, int r, int c) {
    if (r < 0 || r >= rowSize || c < 0 || c >= colSize) {
        return;
    }
    if (grid[r][c] != '1') {
        return;
    }
    grid[r][c] = '0';

    dfs(grid, rowSize, colSize, r - 1, c); 
    dfs(grid, rowSize, colSize, r + 1, c); 
    dfs(grid, rowSize, colSize, r, c - 1); 
    dfs(grid, rowSize, colSize, r, c + 1); 
}
int numIslands(char** grid, int gridSize, int* gridColSize) {
    if (gridSize == 0 || gridColSize[0] == 0) {
        return 0;
    }  
    int islandCount = 0;
    int rows = gridSize;
    int cols = gridColSize[0];
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (grid[i][j] == '1') {
                islandCount++;
                dfs(grid, rows, cols, i, j);
            }
        }
    }  
    return islandCount;
}
