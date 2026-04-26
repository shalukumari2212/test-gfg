

class Solution {
    static Map<Node,Integer> dp;
    
    public int level(Node root){
        if(root==null) return 0;
        if(dp.containsKey(root)) return dp.get(root);
        int left= level(root.left);
        int right= level(root.right);
        dp.put(root,1+ Math.max(right,left));
        return dp.get(root);
        
    }
    public int dia(Node root) {
        if(root==null) return 0;
        int mid= level(root.right) + level(root.left);
        int left= dia(root.left);
        int right= dia(root.right);
        return Math.max(mid ,Math.max(right,left));
    }
    public int diameter(Node root) {
        dp= new HashMap<>();
        return dia(root);
    }
}