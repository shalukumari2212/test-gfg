class Solution {
    int missingNum(int arr[]) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+= arr[i];
        }
        
        int result=0;
        for(int i=1;i<=arr.length+1;i++){
            result+=i;
        }
        int ans= result-sum;
        return ans;
    }
}