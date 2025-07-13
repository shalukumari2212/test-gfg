class Solution {
  public:
    void printTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                cout<<" ";
            }
            int a=1;
            for(int k=1;k<=i;k++){
                int d=a+64;
                cout<<char(d);
                a++;
            }
            int p=i+63;
            for(int q=1;q<=i-1;q++){
                cout<<char(p);
                p--;
            }
            cout<<endl;
        }
        // code here
        
    }
};