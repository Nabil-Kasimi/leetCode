
class Solution {
public:
    int lengthOfLastWord(string s) {
        int start;
        int end;
        for(end = s.size()-1 ; end >= 0 ; end--)
            if(!isspace(s[end]))
                break;
        for( start = end ; start >= 0 ; start--)
            if(isspace(s[start]))
              break;
        return end -start;
    }
};