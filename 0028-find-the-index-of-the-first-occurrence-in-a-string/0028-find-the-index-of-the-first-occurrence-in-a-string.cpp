class Solution {
public:
    int strStr(string haystack, string needle) {
		int f = -1;
		f = haystack.find(needle, 0);
		return f;
    }
};