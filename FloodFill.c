#include <stdlib.h>
void dfs(int** image, int rowSize, int colSize, int r, int c, int originalColor, int newColor) {
    if (r < 0 || r >= rowSize || c < 0 || c >= colSize) {
        return;
    }
    if (image[r][c] != originalColor) {
        return;
    }
    image[r][c] = newColor;
    dfs(image, rowSize, colSize, r - 1, c, originalColor, newColor);
    dfs(image, rowSize, colSize, r + 1, c, originalColor, newColor);
    dfs(image, rowSize, colSize, r, c - 1, originalColor, newColor); 
    dfs(image, rowSize, colSize, r, c + 1, originalColor, newColor);
}
int** floodFill(int** image, int imageSize, int* imageColSize, int sr, int sc, int color, int* returnSize, int** returnColumnSizes) {
    int originalColor = image[sr][sc];
    if (originalColor != color) {
        dfs(image, imageSize, imageColSize[0], sr, sc, originalColor, color);
    }
    *returnSize = imageSize;
    *returnColumnSizes = imageColSize;    
    return image;
}
