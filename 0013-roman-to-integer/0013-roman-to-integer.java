class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I' , 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int m = 0;
        int sum = 0;
        for(int i = 0; i < s.length();i++)
        {
            
            int n = map.get(s.charAt(i));
            if(i < s.length()-1)
            {
                m = map.get(s.charAt(i+1));
            }
            if(m > n)
            {
                n = m -n;
                i++;
                m = 0;
            }
            sum+= n;
        }
        return sum;
    }
}