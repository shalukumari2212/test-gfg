class Solution {
  public:
    void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++){
            int a=1;
            for(int j=1;j<=(n+1)-i;j++){
                int d=a+64;
                cout<<char(d);
                a=a+1;
            }
            cout<<endl;
        }
    }
};