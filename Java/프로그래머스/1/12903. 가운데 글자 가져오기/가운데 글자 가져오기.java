class Solution {
    public String solution(String s) {
        int len = s.length();
        int start = 0;

        while (start + 1 < len - 1) {
            start++;
            len--;
        }

        return s.substring(start, len);
    }
}