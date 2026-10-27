class Solution {
    public String[] createGrid(int m, int n) {
        String ans[] = new String[m];
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for( i = 0 ; i < m -1; i ++)
        {
            sb.append('.');
            for(int j = 1 ; j < n ; j ++)
            {
                sb.append('#');
            }
            if(i < m -1)
            {
                ans[i] = sb.toString();
                sb.setLength(0);
            }
        }

        for(int j = 0 ; j < n ; j ++)
        {
            sb.append('.');
        }
        ans[i] = sb.toString();
        
        System.out.println(ans[0]);
        return ans;
    }
}