class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character,Integer>map= new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        int maxfreq=0;
        char result= 'a';
        for(Character ch: map.keySet()){
            int freq= map.get(ch);
            
            if(freq>maxfreq || (freq==maxfreq && ch<result)){
                maxfreq=  freq;
                result=ch;
            }
            
        }
        return result;
      
       
    }
}