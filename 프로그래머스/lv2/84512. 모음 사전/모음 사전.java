import java.util.*;
class Solution {
    private static final char[] ch ="AEIOU".toCharArray();
    private List<String> generate(String word){
        List<String> words = new ArrayList<>();
        words.add(word);
        if(word.length()==5)
            return words;
        for(char c : ch){
            words.addAll(generate(word+c));
        }
        return words;
    }
    public int solution(String word) {
        return generate("").indexOf(word);
    }
}