class Solution {
    public int solution(int num) {
        int answer = 0;
        long obj = num;

        while (obj != 1) {
            if (obj % 2 == 0) {
                obj /= 2;
            } else {
                obj = obj * 3 + 1;
            }
            answer++;
            if (answer == 500) {
                return -1;
            }
        }
        return answer;
    }
}