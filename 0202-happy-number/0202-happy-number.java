class Solution {
    public boolean isHappy(int n) {

        int tmp = n;
        int ans = 0;
        Set<Integer> set  = new HashSet<>();

        while(true)
        {
            if(n == 0 && !set.add(ans))
                return false;
            else if(n == 0 && ans== 1)
                break;

            else if(n == 0 && ans > 1)
            {
                n = ans;
                ans = 0;
            }

            double pow = Math.pow(n%10 , 2);
            ans+= pow;
            n/=10;
        }
        return true;
    }
}