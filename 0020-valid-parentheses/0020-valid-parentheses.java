class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1)
            return false;

        Map<Character, Character> map = new HashMap<>();
        Deque<Character> stack = new ArrayDeque<>();

        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');

        for(int i = 0; i < s.length() ; i++)
        {
            Character c = s.charAt(i);
            if(map.containsKey(c))
                stack.push(c);
            else if(map.get(stack.peek()) !=c)
                    return false;
            else
                stack.pop();
        }
        return stack.isEmpty();
    }
}