

class Solution {
    public int level(Node root){
        if(root==null) return 0;
        int leftans= level(root.left);
        int rightans= level(root.right);
        return 1+ Math.max(leftans,rightans);
    }
    public int height(Node root){
        if(root==null || root.left==null && root.right==null) return 0;
        int leftans= height(root.left);
        int rightans= height(root.right);
        return 1+ Math.max(leftans,rightans);
    }
    public int diameterLevel(Node root) {
        if(root==null) return 0;
        int mid= level(root.left) + level(root.left);
        int right = diameterLevel(root.left);
        int left = diameterLevel(root.right);
        return Math.max(mid,Math.max(left,right)); 
    }
    public int diameterheight(Node root) {
        if(root==null || root.left==null && root.right==null) return 0;
        int mid=height(root.left) + height(root.right);
        if(root.left != null) mid++;
        if(root.right != null) mid++;
        int right = diameterheight(root.left);
        int left = diameterheight(root.right);
        return Math.max(mid,Math.max(left,right)); 
    }
    
    public int diameter(Node root) {
        return diameterheight(root);
    }
}