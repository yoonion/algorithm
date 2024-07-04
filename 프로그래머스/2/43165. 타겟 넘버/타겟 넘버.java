class Solution {
    
    int answer = 0;
    public int solution(int[] numbers, int target) {
        DFS(numbers, 0, target, 0);
        return answer;
    }
    
    public void DFS(int[] numbers, int depth, int target, int result) {
        if (depth == numbers.length) {
            if (result == target) {
                answer++;
            }
            return;
        }
        
        int plus = result + numbers[depth];
        int minus = result - numbers[depth];
        
        DFS(numbers, depth + 1, target, plus);
        DFS(numbers, depth + 1, target, minus);
    }
}