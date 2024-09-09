package J03020;
import java.util.*;
public class Word {
    private String word;
    private static int count = 0;
    private int id, fre, length;
    public Word(String word) {
        count++;
        this.id = count;
        this.word = word;
        this.fre = 1;
        this.length = this.word.length();
    }
    public int getFre() {
        return fre;
    }
    public void setFre(int fre) {
        this.fre = fre;
    }
    public int getLength() {
        return length;
    }
    public int getId() {
        return id;
    }
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (Character.compare(s.charAt(i), s.charAt(j)) != 0) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    @Override
    public String toString() {
        return word + " " + fre;
    }
}

class CompareByLength implements Comparator<Word> {
    @Override
    public int compare(Word a, Word b) {
        int res = Integer.compare(b.getLength(), a.getLength());
        if (res == 0) {
            return Integer.compare(a.getId(), b.getId());
        }
        return res;
    }
}