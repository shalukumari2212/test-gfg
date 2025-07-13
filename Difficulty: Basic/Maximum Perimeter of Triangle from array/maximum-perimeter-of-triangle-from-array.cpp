class Solution {
  public:
    int maxPerimeter(vector<int> &arr) {
        int n= arr.size();
        sort(arr.begin(),arr.end());
        
        for(int i=n-1;i>=2;i--){
            int c=arr[i];
            int b=arr[i-1];
            int a= arr[i-2];
            
            if(a+b>c) return a+b+c;
        }
        return -1;
      
    
        
    }
    
    
};