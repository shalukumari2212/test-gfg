class Solution {
  public:
    void printTriangle(int n) {
        // code here
           for(int i=1;i<=n;i++){
        for(int j=1;j<=(n+1)-i;j++){
            cout<<"*";
        }
        
        for(int k=1;k<=(2*i-2);k++){
              cout<<" ";
        }
        

        for(int q=1;q<=(n+1)-i;q++){
            cout<<"*";
            
        }
        cout<<endl;
    }

    for(int i=1;i<=n;i++){
            for(int t=1;t<=i;t++){
            cout<<"*";
        }
        for(int u=1;u<=(2*n-2*i);u++){
            cout<<" ";
        }
        for(int s=1;s<=i;s++){
            cout<<"*";
        }
        
        
        cout<<endl;

    }
    }
};