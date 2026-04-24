class Solution {
    public int editDistance(String s1, String s2) {
        // code here
         int n= s1.length();
        int m= s2.length();
        if(n==0) return m;
        if(m==0 ) return n;
        int[][]dp = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                if(s1.charAt(i)==s2.charAt(j))  dp[i][j] = (i>0 && j>0) ? dp[i-1][j-1] :((i==0) ? j :i );
                else{
                    int del = (i>0) ? dp[i-1][j] : j;
                    int insert =  (j>0) ? dp[i][j-1] : i;
                    int rep = (i>0 && j>0) ? dp[i-1][j-1] : ((i==0) ? j :i );

                    dp[i][j]= 1+ Math.min(del,Math.min(insert,rep));
                }
            }
        }
        return dp[n-1][m-1];
    }
}