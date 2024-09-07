package j07012;

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
    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return word + " " + fre;
    }
}

class CompareByFre implements Comparator<Word> {
    @Override
    public int compare(Word a, Word b) {
        int freqCompare = Integer.compare(b.getFre(), a.getFre());
        if (freqCompare != 0) {
            return freqCompare;
        }
        return a.getWord().compareTo(b.getWord());
    }
}