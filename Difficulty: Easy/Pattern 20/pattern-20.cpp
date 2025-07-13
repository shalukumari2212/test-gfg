class Solution {
  public:
    void printTriangle(int n) {
        // code here
         for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            cout<<"*";
        }
        for(int k=1;k<=2*(n-i);k++){
            cout<<" ";
        }
        for(int m=1;m<=i;m++){
            cout<<"*";
        }
        cout<<endl;
    }
    int d=n-1;
    for(int p=1;p<=d;p++){
        for(int q=1;q<=(d+1-p);q++){
            cout<<"*";
        }
        for(int r=1;r<=2*p;r++){
            cout<<" ";
        }
        for(int s=1;s<=d+1-p;s++){
            cout<<"*";
        }
        cout<<endl;
    }
    }
};