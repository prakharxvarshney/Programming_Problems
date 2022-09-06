/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        
        // There are no good nodes if the root is null
        if (root == null) {            
            return 0;           
        }
        
        // There is only one good node if both paths are null
        if (root.left == null && root.right == null) {        
            return 1;            
        }
        
        int goodOnes = findNodes(root, root.val);
        return goodOnes;
        
    }
    
    private int findNodes(TreeNode root, int prevNode) {
        
        // If the traversed path is null, don't add to the total
        if (root == null) {
            return 0;
        }
                
        // If the previous largest node is less than the current node, increment total by one, then traverse the left and right paths using the current root value as the new previous largest node.
        if (prevNode <= root.val) {
            return 1 + findNodes(root.left, root.val) + findNodes(root.right, root.val);
        }
        
        // If the previous largest node is larger than the current node, do not increment by one and do not change previous largest node value when traversing the left and right paths.
        return findNodes(root.left, prevNode) + findNodes(root.right, prevNode);
        
    }
}