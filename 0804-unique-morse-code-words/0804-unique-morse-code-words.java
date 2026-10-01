class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       var set = new HashSet<String>() ;
       String[] reco = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

       for(var e : words)
       {
            var sb = new StringBuilder();
            for(int i = 0; i < e.length() ; i++)
            {
                sb.append(reco[e.charAt(i) -'a']);
            }
            set.add(sb.toString());
            sb.setLength(0);
       }
       return set.size();

    }
}