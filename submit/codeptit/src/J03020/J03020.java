package J03020;
import java.util.*;
public class J03020 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        Map<String, Word> mp = new HashMap<>();
        
        while(input.hasNextLine()) {
            String x[] = input.nextLine().trim().split("\\s+");
            for (String n : x) {
                if (Word.isPalindrome(n)) {
                    if (mp.containsKey(n)) {
                        mp.get(n).setFre(mp.get(n).getFre() + 1);
                    } else {
                        Word a = new Word(n);
                        mp.put(n, a);
                    }
                }
            }
        }
        ArrayList<Word> words = new ArrayList<>(mp.values());
        Collections.sort(words, new CompareByLength());
        int maxLength = words.get(0).getLength();
        for (Word temp : words) {
            if (temp.getLength() == maxLength) {
                System.out.println(temp);
            }
        }
        input.close();
    }

}
