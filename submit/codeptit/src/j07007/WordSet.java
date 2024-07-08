package j07007;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    TreeSet<String> st = new TreeSet<>();
    String showImage;
    public WordSet(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        while (input.hasNextLine()) {
            String line = input.nextLine().toLowerCase();
            String []a = line.split("\\s+");
            for (String x : a) {
                st.add(x);
            }
        }
        input.close();
        StringBuilder res = new StringBuilder("");
        for (String s : st) {
            res.append(s).append("\n");
        }
        showImage = res.toString().trim();
    }
    @Override
    public String toString() {
        return showImage;
    }
    
}
