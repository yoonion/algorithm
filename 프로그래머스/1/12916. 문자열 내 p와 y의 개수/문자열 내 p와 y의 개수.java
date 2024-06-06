class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'P') {
                pCount++;
            } else if (s.charAt(i) == 'Y') {
                yCount++;
            }
        } if (pCount != yCount) {
            answer = false;
        }
        return answer;
    }
}