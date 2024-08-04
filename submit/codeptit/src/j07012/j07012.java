package j07012;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class j07012 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        // Write your code here
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>)input.readObject();

        HashMap<String, Integer> mp = new HashMap<>();
        ArrayList<Word> words = new ArrayList<>();

        for (String s : a) {
            String w[] = s.toLowerCase().split("\\W+");
            for (String s1 : w) {
                if (!s1.equals(" ")) {
                    if (mp.containsKey(s1)) {
                        mp.put(s1, mp.get(s1) + 1);
                    } else {
                        mp.put(s1, 1);
                    }
                }
            }
        }
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            words.add(new Word(entry.getKey(), entry.getValue()));
        }
        Collections.sort(words, new CompareByFre());
        for (Word s : words) {
            System.out.println(s);
        }
}
