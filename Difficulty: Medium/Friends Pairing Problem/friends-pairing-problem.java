// User function Template for Java

class Solution {
    public long pair(int n){
        if(n<=2) return n;
        return pair(n-1)+ (n-1)*pair(n-2);
    }
    public long countFriendsPairings(int n) {
        // code here
        return pair(n);
    }
}
