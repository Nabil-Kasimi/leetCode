class Solution {

    public int maximumLengthSubstring(String s) {

        char sa[] = s.toCharArray();
        int max = 0;
        int reco[] = new int[26];

        int sl = 0;
        for(int i = 0; i < sa.length; i++)
        {
            reco[sa[i] -'a']++;

            while(reco[sa[i] -'a'] > 2)
            {
                reco[sa[sl] -'a']--;
                sl++;;
            }
            max = Math.max(max, i - sl +1);
        }
        return max;
    }
}