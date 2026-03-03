// User function Template for Java
class Solution {
    static int distinct(int arr[]) {
        // code here
        HashSet<Integer>ht=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            ht.add(arr[i]);
        }
        return ht.size();
    }
}