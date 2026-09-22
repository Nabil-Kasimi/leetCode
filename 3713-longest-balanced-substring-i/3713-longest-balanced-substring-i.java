class Solution {
    private int uMax(int a[])
    {
        int ans = 0;
        int cmn = -1;
        for(int i = 0; i < 26 ; i++)
        {
            if(a[i] > 0 && cmn == -1)
                cmn = a[i];
            if(a[i] > 0 && a[i] == cmn)
            {
                ans+=a[i];
            }
            else if (a[i]> 0)
                return -1;
        }
        return ans;
    }

    public int longestBalanced(String s) {
    char a[] = s.toCharArray();
    int len = a.length;


    int ans = 0;
    for(int i = 0; i < len; i++)
    {
        int reco[] = new int[26];
        for(int j = i; j < len; j++)
        {
            reco[a[j] -'a']++;
            ans = Math.max(ans , uMax(reco)) ;
        }
    }
       return ans; 
    }
}