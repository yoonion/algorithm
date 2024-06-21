import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] newArr = new String[numbers.length];
        for (int i=0; i<numbers.length; i++) {
            newArr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(newArr, new Comparator<String>() {
           public int compare(String s1, String s2) {
               return (s2+s1).compareTo(s1+s2);
           }
        });
        
        if (newArr[0].equals("0")) {
            return "0";
        }
        
        return String.join("", newArr);
    }
}