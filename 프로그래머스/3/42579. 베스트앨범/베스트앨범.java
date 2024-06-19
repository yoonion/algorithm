import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        
        Map<String, Integer> sumMap = new HashMap<>();
        for (int i=0; i<plays.length; i++) {
            sumMap.put(genres[i], sumMap.getOrDefault(genres[i], 0) + plays[i]);
        }
        //System.out.println(sumMap);
        
        // 장르 재생순 내림차순 정렬
        List<String> genreList = new ArrayList<>(sumMap.keySet());
        genreList.sort(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return (sumMap.get(o1) - sumMap.get(o2)) * -1;
            }
        });
        // System.out.println(genreList);
        
        // 장르별로 각 노래 재생수 저장
        for (String genre : genreList) {
            Map<Integer, Integer> playMap = new HashMap<>();
            for (int i=0; i<genres.length; i++) {
                if (genres[i].equals(genre)) {
                    playMap.put(i, plays[i]); // 노래 고유번호 & 재생 수 저장
                }
            }
            
            // 노래 재생 수 내림차순 정렬
            List<Integer> playList = new ArrayList<>(playMap.keySet());
            playList.sort(new Comparator<Integer>() {
                public int compare(Integer o1, Integer o2) {
                    // 재생수 같은 경우 -> 고유번호 오름차순
                    if (playMap.get(o1) == playMap.get(o2)) {
                        return o1 - o2;
                    } 
                    return (playMap.get(o1) - playMap.get(o2)) * -1; // 재생수 내림차순
                }
            });
            
            int count = 0;
            for (Integer idx : playList) {
                answer.add(idx);
                count++;
                if (count == 2) break;
            }   
        }
        
        int[] result = new int[answer.size()];
        for (int i=0; i<answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}