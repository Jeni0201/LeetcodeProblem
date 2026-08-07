/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
void inorder(struct TreeNode* root, int* prev_val, int* min_diff) {
    if (root == NULL) {
        return;
    }
    inorder(root->left, prev_val, min_diff);
    if (*prev_val != -1) {
        int diff = root->val - *prev_val;
        if (diff < *min_diff) {
            *min_diff = diff;
        }
    }
    *prev_val = root->val;
    inorder(root->right, prev_val, min_diff);
}

int minDiffInBST(struct TreeNode* root) {
    int prev_val = -1;       
    int min_diff = INT_MAX; 
    inorder(root, &prev_val, &min_diff);  
    return min_diff;
    
}
