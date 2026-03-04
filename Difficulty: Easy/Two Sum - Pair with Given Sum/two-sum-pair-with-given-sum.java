class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer>ht= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!ht.contains(target-arr[i])){
                ht.add(arr[i]);
            }
            else{
                return true;
            }
        }
        return false;
    }
}