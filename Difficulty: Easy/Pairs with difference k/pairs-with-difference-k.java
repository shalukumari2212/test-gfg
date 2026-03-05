// User function Template for Java
class Solution {
    int countPairs(int[] arr, int k) {
        // code here
        // HashSet<Integer>set= new HashSet<>();
        // int count=0;
        // for(int i=0;i<arr.length;i++){
        //     if(set.contains(arr[i]-k)) count++;
        //     if(set.contains(k+arr[i])) count++;
        //     set.add(arr[i]);
        // }
        // return count;
        
        
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int ele :arr){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        int count=0;
        for(int ele : map.keySet()){
            int rem1= ele-k;
            int rem2= ele+k;
            if(map.containsKey(rem1)) count+=map.get(rem1)*map.get(ele);
            if(map.containsKey(rem2)) count+=map.get(rem2)*map.get(ele);
        }
        count/=2;
        return count;
    }
}