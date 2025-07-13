class Solution {
  public:
    void printTriangle(int n) {
        int a=1;
        // code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                cout<<a<<" ";
                a=a+1;
            }
            cout<<endl;
        }
    }
};