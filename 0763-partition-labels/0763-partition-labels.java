class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> lst = new ArrayList<>();
        int reco[] = new int[26];
        for(int i = 0 ; i < s.length(); i++)
        {
            char c = s.charAt(i);
            reco[c-'a']= i; 
        }


        int l = reco[s.charAt(0)-'a'];
        // int st = 0;
        int cn = 1;

        for(int i = 0 ; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(reco[c-'a'] > l)
                l =  reco[c-'a'];
            if(i == l)
            {
                lst.add(cn);
                cn = 0;
            }
            cn++;
            
        }

       return lst;
    }
}