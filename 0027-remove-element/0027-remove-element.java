class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> lst = new ArrayList<>();

        for(int n : nums)
        {
            if(n != val)
            {
                lst.add(n);
            }
        }
        // System.out.println(lst.toString());
        for(int i = 0; i < lst.size(); i++)
        {
            nums[i] = lst.get(i);
        }
        return lst.size();
    }
}