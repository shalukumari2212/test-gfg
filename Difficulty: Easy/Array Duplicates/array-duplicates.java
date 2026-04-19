class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer>list= new ArrayList<>();
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int val: arr){
            map.put(val , map.getOrDefault(val,0)+1);
        }
        for(int val: map.keySet()){
            if(map.get(val)>1){
                list.add(val);
            }
        }
        return list;
    }
    
}