class Solution {
    public ArrayList<Integer> bfs( int V,int[] indegree,List<List<Integer>>adj){
        ArrayList<Integer>list= new ArrayList<>();
        Queue<Integer> q= new LinkedList<>();
        
        for(int i=0;i<V;i++){
            if(indegree[i] == 0 ) q.add(i);
        }
        while(q.size()>0){
            int front= q.remove();
            list.add(front);
            for(int ele : adj.get(front)){
                indegree[ele]--;
                if(indegree[ele] ==0) q.add(ele); 
                
            }
        }
        return list;
    }
    
    
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        List<List<Integer>>adj= new ArrayList<>();
        for(int i=0;i<V;i++){
            List<Integer>list= new ArrayList<>();
            adj.add(list);
        }
        
        for(int i=0;i<edges.length;i++){
            int a= edges[i][0];
            int b= edges[i][1];
            adj.get(a).add(b);
           
        }
        
        int[] indegree  = new int[V];
        Arrays.fill(indegree  ,0);
        
        for(int i=0;i<V;i++){
             for(int ele : adj.get(i)){
                indegree[ele]++; 
            }
        }
        
        ArrayList<Integer>ans=bfs(V,indegree,adj);
        return ans;
       
    }
}