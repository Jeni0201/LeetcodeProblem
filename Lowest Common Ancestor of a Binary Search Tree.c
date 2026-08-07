/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

struct TreeNode* lowestCommonAncestor(struct TreeNode* root, struct TreeNode* p, struct TreeNode* q) {
    struct TreeNode* curr = root;
    while(curr){
        if(p->val<curr->val&&q->val<curr->val){
            curr=curr->left;
        }
        else if(p->val>curr->val&&q->val>curr->val){
            curr=curr->right;
        }
        else{
            return curr;
        }
    }
    return NULL;   
}
