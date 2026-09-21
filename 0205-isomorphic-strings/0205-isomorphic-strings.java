class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sr []  = new int[128];
        int tr []  = new int[128];

        for(int i = 0 ; i < s.length(); i++)
        {
            if(sr[s.charAt(i)] != tr[t.charAt(i)])
                return false;
            sr[s.charAt(i)] =i +1;
            tr[t.charAt(i)] =i + 1;
        }
        return true;
    }
}