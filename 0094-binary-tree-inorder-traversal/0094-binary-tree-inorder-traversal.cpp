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
	void rec(vector <int> &ret, TreeNode* root)
	{
		if(!root)
			return;
		rec(ret, root->left);
        ret.push_back(root->val);
        rec(ret , root->right);
	}
    vector<int> inorderTraversal(TreeNode* root) {
        vector <int>ret;
		rec(ret, root);
        return ret;
    }
};