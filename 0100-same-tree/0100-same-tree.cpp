/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int cmp(TreeNode *p, TreeNode *q)
    {
        int r = false;
        if((!p && !q) || r)
            return 0;
        else if((!p && q) || (p && !q)|| (p->val != q->val))
            return(r = 1);
        if(cmp(p->left, q->left))
            return 1;
        if(cmp(p->right, q->right))
            return 1;
        return r;
    }
    bool isSameTree(TreeNode* p, TreeNode* q) {
        bool r = true;
        if(cmp(p, q))
            r = false;
        return r;
    }
};