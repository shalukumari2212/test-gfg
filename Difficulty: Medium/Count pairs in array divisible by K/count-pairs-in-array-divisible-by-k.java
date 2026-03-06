import java.util.*;

class Solution {
    public static long countKdivPairs(int arr[], int n, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ele : arr){
            int x = ((ele % k) + k) % k;
            map.put(x , map.getOrDefault(x ,0) + 1);
        }

        long count = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            int ele = entry.getKey();
            long freq = entry.getValue();

            if(ele == 0 || ele * 2 == k){
                count += (freq * (freq - 1)) / 2;
            }

            else if(ele < k-ele && map.containsKey(k-ele)){
                count += freq * map.get(k-ele);
            }
        }

        return count;
    }
}