import java.util.*;
public class HigestScoringWord {
    public static String high(String s) {

        String[] wordList=s.split(" ");
        Map<Integer, String> map=new TreeMap<>();

        for(String word:wordList)
        {
            map.put(getWordScore(word),word);
        }

        return map.get(((TreeMap<Integer, String>) map).lastKey());
    }

    private static Integer getWordScore(String word) {
        Integer score=0;
        ArrayList<String> alphas=new ArrayList<>();
        alphas.add("a");alphas.add("b");alphas.add("c");alphas.add("d");alphas.add("e");alphas.add("f");alphas.add("g");
        alphas.add("h");alphas.add("i");alphas.add("j");alphas.add("k");alphas.add("l");alphas.add("m");alphas.add("n");
        alphas.add("o");alphas.add("p");alphas.add("q");alphas.add("r");alphas.add("s");alphas.add("t");alphas.add("u");
        alphas.add("v");alphas.add("w");alphas.add("x");alphas.add("y");alphas.add("z");

        for(int i=0;i<word.length();i++)
        {
            char r=word.charAt(i);
            score+=alphas.indexOf(String.valueOf(r))+1;

        }

        return score;
    }

}
