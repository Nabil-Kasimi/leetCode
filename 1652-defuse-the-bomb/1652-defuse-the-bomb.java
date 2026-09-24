class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k == 0)
            return new int[code.length];
        int ans[] = new int[code.length];

        for(int i = 0; k >0 && i < code.length ; i++)
        {
            int index = 0;
            for(int j = i+1 ; index < k ; j++)
            {
                if(j >= code.length)
                    j = 0;
                ans[i]+= code[j];
                index++;
            }
        }

        for(int i = 0; k <0 && i < code.length ; i++)
        {
            int res = 0;
            int index = 0;
            for(int j = i-1 ; index > k ; j--)
            {
                if(j < 0)
                    j = code.length-1;
                ans[i]+= code[j];
                index--;
            }
        }

        return ans;
    }
}