class Solution {
  public:
    vector<int> leaders(vector<int>& arr) {
        int n = arr.size();
        vector<int> result;
        
        int maxRight = arr[n - 1];
        result.push_back(maxRight);
        
        // Traverse from second last element
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                result.push_back(arr[i]);
                maxRight = arr[i];
            }
        }
        
        // Reverse to maintain original order
        reverse(result.begin(), result.end());
        
        return result;
    }
};