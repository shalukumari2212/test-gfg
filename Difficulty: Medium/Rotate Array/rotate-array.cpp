class Solution {
  public:

    // Function to rotate an array by d elements in counter-clockwise direction.
    void rotateArr(vector<int>& arr, int d) {
        int n= arr.size();
        d= d%n;
         vector<int>temp;
    for(int i=0;i<=d;i++){
        temp.push_back(arr[i]);
    }
    for(int i=d;i<n;i++){
        arr[i-d]= arr[i];
    }
    for(int i=n-d;i<n;i++){
        arr[i]= temp[i-(n-d)];
    }
  
    
    }
      
    
};