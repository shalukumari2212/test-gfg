// User function Template for Java

class Sol {
    long equalPairs(String s) {
        // your code here
        HashMap<Character,Integer>map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        long count=0;
        for(char ch: map.keySet()){
            count+=map.get(ch)*map.get(ch);
        }
        return count;
    }
}