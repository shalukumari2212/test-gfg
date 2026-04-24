class Solution {
    static int lcs(String text1, String text2) {
        // code here
        int n= text1.length();
        int m= text2.length();
        int [][]dp= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                int p = (i>0 && j>0) ? dp[i-1][j-1] :0;
                int q= (i>0) ?  dp[i-1][j] :0;
                int r= (j>0) ? dp[i][j-1]:0;
            
                if(text1.charAt(i)== text2.charAt(j)) dp[i][j]= 1+p;
                else dp[i][j]= Math.max(q,r )  ;
            }
        }

        // int i=n-1 , j=m-1;
        // StringBuilder str = new StringBuilder("");

        // while(i>0 && j>0){
        //     if(text1.charAt(i)== text2.charAt(j)) str.append(text1.charAt(i));            
        //     if(dp[i-1][j] > dp[i][j-1]) i--;
        //     else j--;   
        // }
        // str.reverse();
        // System.out.print(str);

        return dp[n-1][m-1];
    }
}