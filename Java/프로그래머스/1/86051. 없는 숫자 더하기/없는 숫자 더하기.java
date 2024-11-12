class Solution {
    public int solution(int[] numbers) {
        int answer = 45;

        for (int ex : numbers) {
            answer -= ex;
        }

        return answer;
    }
}