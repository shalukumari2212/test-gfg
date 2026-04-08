// User function Template for Java

class Solution {
    static int countDer(int n) {
        // Base case
        if(n==1) return 0;
        if(n==2) return 1;
        return (n-1)*(countDer(n-1)+countDer(n-2));
        
    }
}