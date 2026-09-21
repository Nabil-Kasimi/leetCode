class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s = new StringBuilder();

        int len = strs.length;
        if(len ==1 || strs[0].length() == 0)
            return strs[0];
        int j  = 0;
        int stop =1;
        while(true)
        {
            if(j >= strs[0].length())
                break;
            char c = strs[0].charAt(j);
            for(int i = 1; i < len ; i++)
            {
                if(strs[i].length() <= j || strs[i].charAt(j) != c)
                {
                    stop = 0;
                    break;
                }
            }
            if(stop == 0)
                break;
            s.append(c);
            j++;
        }
        String res = s.toString();
        return res; 
    }

}