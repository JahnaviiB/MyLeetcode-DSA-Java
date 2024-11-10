import java.util.HashMap;

public class Occurences {
    public static void main(String[] args) {
        String input = "jahnavi";

        HashMap<Character,Integer> frequencyMap =new HashMap<>();
        for(char ch : input.toCharArray()){
            frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1);
        }
        for(char ch: input.toCharArray()){
            System.out.println(ch+" Frequency "+frequencyMap.get(ch));
        }
    }
}
