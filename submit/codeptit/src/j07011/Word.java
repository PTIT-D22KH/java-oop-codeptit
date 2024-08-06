package j07011;

import java.util.Comparator;

public class Word {
    private String word;
    private int fre;

    public Word(String word, int fre) {
        this.word = word;
        this.fre = fre;
    }
    public int getFre() {
        return fre;
    }
    @Override
    public String toString() {
        return word + " " + fre;
    }
}
class CompareByFre implements Comparator<Word> {
    @Override
    public int compare(Word a, Word b) {
        return Integer.compare(b.getFre(), a.getFre());
    }
}
