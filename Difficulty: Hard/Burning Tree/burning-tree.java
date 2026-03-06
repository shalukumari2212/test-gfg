

class Solution {
    public Node getNode(Node root, int target){
        if(root==null) return null;
        if(root.data==target) return root;
        Node left= getNode(root.left,target);
        Node right= getNode(root.right,target);
        if(left==null) return right;
        else return left;
    }
    public void preOrder(Node root,HashMap<Node,Node>p){
        if(root==null) return ;
        if(root.left!=null) p.put(root.left,root);
        if(root.right!=null) p.put(root.right,root);
        preOrder(root.left,p);
        preOrder(root.right,p);
    }
    
    
    public int minTime(Node root, int target) {
        Node node = getNode(root,target);
        
        HashMap<Node,Node>p= new HashMap<>();
        preOrder(root,p);
        
        HashMap<Node,Integer>v= new HashMap<>();
        v.put(node,0);
        
         Queue<Node>q= new LinkedList<>();
        q.add(node);
        
        while(q.size()>0){
            Node temp=q.remove();
            int lev=v.get(temp);
            
            if(temp.left!=null && !(v.containsKey(temp.left))){
                v.put(temp.left,lev+1);
                q.add(temp.left);
            }
            if(temp.right!=null && !(v.containsKey(temp.right))){
                v.put(temp.right,lev+1);
                q.add(temp.right);
            }
            if(p.containsKey(temp) && !(v.containsKey(p.get(temp)))){
                v.put(p.get(temp),lev+1);
                q.add(p.get(temp));
            }
           
        }
         int max=-1;
         for(int level: v.values()){
         max= Math.max(max,level);
         }
         return max;
        
        
        
    }
}