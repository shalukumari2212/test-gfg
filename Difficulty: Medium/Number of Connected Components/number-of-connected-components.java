class Solution {
    public void bfs(int i, boolean[] visit,List<List<Integer>> adj,int n){
        Queue<Integer>q= new LinkedList<>();
        q.add(i);
        visit[i]= true;
        while(q.size()>0){
            int front= q.remove();
            
           for(int ele: adj.get(front)){
               if(!visit[ele]){
                   q.add(ele);
                   visit[ele]= true;
               }
           }
        }
        return;
    }
    int countConnected(int n, ArrayList<ArrayList<Integer>> edges) {
        // code here
       List<List<Integer>> adj= new ArrayList<>();
       for(int i=0;i<n;i++){
           List<Integer> list= new ArrayList<>();
           adj.add(list);
       }
       
       for(int i=0;i<edges.size();i++){
           int a= edges.get(i).get(0);
           int b= edges.get(i).get(1);
           adj.get(a).add(b);
           adj.get(b).add(a);
       }
       
        int count=0;
        boolean[] visit= new boolean[n];
        
        for(int i=0;i<n;i++){
            if(!visit[i]){
                bfs(i,visit,adj,n);
                count++;
            }
            
        }
        return count;
    }
}